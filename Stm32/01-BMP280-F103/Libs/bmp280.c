#include "bmp280.h"
#include "math.h"

// Mean Sea Level Pressure -> 101325 Pa
// 1/101325 yerine direkt hesaplanip carpmasini yapmak mcu icin daha iyi bir secenek
// Unutmayin ki bulundugunuz ile göre MSL Pressure yani deniz seviyesindeki basinc degisiklik gösterebilir. Bunu ayarlamak için ise asagidaki yorum satirini duzenleyip kullanabilirsiniz.
//#define BMP280_1_101325 ((float) 1.0 / [BULUNDUGUNUZ YERDEKI MSL BASINCI]) 
#define BMP280_1_101325 ((float) 0.00000986923266726)

extern I2C_HandleTypeDef BMP280_I2C;
BMP280_t BMP280;

uint8_t BMP280_Read8(uint8_t addr) {
		uint8_t tmp = 0;
		HAL_I2C_Mem_Read(&BMP280_I2C, BMP280_I2C_ADDRESS << 1, addr, 1, &tmp, 1, 10);
		return tmp;
}

uint16_t BMP280_Read16(uint8_t addr) {
	uint8_t tmp[2];
	HAL_I2C_Mem_Read(&BMP280_I2C, BMP280_I2C_ADDRESS << 1, addr, 1, tmp, 2, 10);
	return ((tmp[0] << 8) | tmp[1]);
}

uint16_t BMP280_Read16LE(uint8_t addr) {
	uint16_t tmp;

	tmp = BMP280_Read16(addr);
	return (tmp >> 8) | (tmp << 8);
}

void BMP280_Write8(uint8_t addr, uint8_t data) {
	HAL_I2C_Mem_Write(&BMP280_I2C, BMP280_I2C_ADDRESS << 1, addr, 1, &data, 1, 10);
}

uint32_t BMP280_Read24(uint8_t addr) {
	uint8_t tmp[3];
	HAL_I2C_Mem_Read(&BMP280_I2C, BMP280_I2C_ADDRESS << 1, addr, 1, tmp, 3, 10);
	return ((tmp[0] << 16) | tmp[1] << 8 | tmp[2]);
}

void BMP280_SetConfig(uint8_t standby_time, uint8_t filter) {
	BMP280_Write8(BMP280_REGISTER_CONFIG, (((standby_time & 0x7) << 5) | ((filter & 0x7) << 2)) & 0xFC);
}
	
void BMP280_Init() {
		if(HAL_I2C_IsDeviceReady(&BMP280_I2C,BMP280_I2C_ADDRESS << 1,2,5) != HAL_OK)	{
				BMP280.isConnected = 0;
				BMP280.libInitialized = 0;
		}
		else if(BMP280_Read8(BMP280_REGISTER_CHIPID) == BMP280_CHIP_ID){
				BMP280.isConnected = 1;
				
				/* Kalibrasyon datalari */
				BMP280.calibData.dig_T1 = BMP280_Read16LE(BMP280_REGISTER_DIG_T1);
				BMP280.calibData.dig_T2 = BMP280_Read16LE(BMP280_REGISTER_DIG_T2);
				BMP280.calibData.dig_T3 = BMP280_Read16LE(BMP280_REGISTER_DIG_T3);

				BMP280.calibData.dig_P1 = BMP280_Read16LE(BMP280_REGISTER_DIG_P1);
				BMP280.calibData.dig_P2 = BMP280_Read16LE(BMP280_REGISTER_DIG_P2);
				BMP280.calibData.dig_P3 = BMP280_Read16LE(BMP280_REGISTER_DIG_P3);
				BMP280.calibData.dig_P4 = BMP280_Read16LE(BMP280_REGISTER_DIG_P4);
				BMP280.calibData.dig_P5 = BMP280_Read16LE(BMP280_REGISTER_DIG_P5);
				BMP280.calibData.dig_P6 = BMP280_Read16LE(BMP280_REGISTER_DIG_P6);
				BMP280.calibData.dig_P7 = BMP280_Read16LE(BMP280_REGISTER_DIG_P7);
				BMP280.calibData.dig_P8 = BMP280_Read16LE(BMP280_REGISTER_DIG_P8);
				BMP280.calibData.dig_P9 = BMP280_Read16LE(BMP280_REGISTER_DIG_P9);
			
				BMP280_Write8(BMP280_REGISTER_CONTROL, ((BMP280_TEMPERATURE_RESOLUTION<<5) | (BMP280_PRESSURE_OVERSAMPLING<<2) | BMP280_MODE));
				BMP280.libInitialized = 1;
		}
		else {
				BMP280.libInitialized = 0;
		}
}

float BMP280_ReadTemperature(void) {
  int32_t var1, var2;

  if(BMP280_MODE == BMP280_MODE_FORCED)
  {
	  uint8_t mode;
	  uint8_t ctrl = BMP280_Read8(BMP280_REGISTER_CONTROL);
	  ctrl &= ~(0x03);
	  ctrl |= BMP280_MODE_FORCED;
	  BMP280_Write8(BMP280_REGISTER_CONTROL, ctrl);

	  mode = BMP280_Read8(BMP280_REGISTER_CONTROL);
	  mode &= 0x03;							

	  if(mode == BMP280_MODE_FORCED)
	  {
		  while(1)
		  {
			  mode = BMP280_Read8(BMP280_REGISTER_CONTROL);
			  mode &= 0x03;
			  if(mode == BMP280_MODE_SLEEP)
				  break;
		  }

		  int32_t adc_T = BMP280_Read24(BMP280_REGISTER_TEMPDATA);
		  adc_T >>= 4;

		  var1  = ((((adc_T>>3) - ((int32_t)BMP280.calibData.dig_T1 <<1))) *
				  ((int32_t)BMP280.calibData.dig_T2)) >> 11;

		  var2  = (((((adc_T>>4) - ((int32_t)BMP280.calibData.dig_T1)) *
				  ((adc_T>>4) - ((int32_t)BMP280.calibData.dig_T1))) >> 12) *
				  ((int32_t)BMP280.calibData.dig_T3)) >> 14;

		  BMP280.t_fine = var1 + var2;

		  float T  = (BMP280.t_fine * 5 + 128) >> 8;
		  return T/100;
	  }
  }

  return -99;
}

int32_t BMP280_ReadPressure(void)
{
	  int64_t var1, var2, p;

	  // t_fine degerinin hesaplanmasi icin
	  //BMP280_ReadTemperature();

	  int32_t adc_P = BMP280_Read24(BMP280_REGISTER_PRESSUREDATA);
	  adc_P >>= 4;

	  var1 = ((int64_t)BMP280.t_fine) - 128000;
	  var2 = var1 * var1 * (int64_t)BMP280.calibData.dig_P6;
	  var2 = var2 + ((var1*(int64_t)BMP280.calibData.dig_P5)<<17);
	  var2 = var2 + (((int64_t)BMP280.calibData.dig_P4)<<35);
	  var1 = ((var1 * var1 * (int64_t)BMP280.calibData.dig_P3)>>8) +
	    ((var1 * (int64_t)BMP280.calibData.dig_P2)<<12);
	  var1 = (((((int64_t)1)<<47)+var1))*((int64_t)BMP280.calibData.dig_P1)>>33;

	  if (var1 == 0) {
	    return 0;  // 0 a bölünme hatasi
	  }
	  p = 1048576 - adc_P;
	  p = (((p<<31) - var2)*3125) / var1;
	  var1 = (((int64_t)BMP280.calibData.dig_P9) * (p>>13) * (p>>13)) >> 25;
	  var2 = (((int64_t)BMP280.calibData.dig_P8) * p) >> 19;

	  p = ((p + var1 + var2) >> 8) + (((int64_t)BMP280.calibData.dig_P7)<<4);
	  return (int32_t)p/256;
}

float BMP280_CalcAltitude() {
		float Alt;
		Alt = 44330 * (1.0 - pow(BMP280.Pressure * BMP280_1_101325, 0.1903));
		return Alt;
}

void BMP280_ReadAll() {
		BMP280.Temperature = BMP280_ReadTemperature();
		BMP280.Pressure =	BMP280_ReadPressure();
		BMP280.Altitude = BMP280_CalcAltitude();
}

/*****END OF FILE****/
