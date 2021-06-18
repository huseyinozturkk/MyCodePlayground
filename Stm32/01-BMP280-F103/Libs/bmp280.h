/*
  ******************************************************************************
  * @file           : bmp280.h
  * @brief          : Header for bmp280.c file.
  *                   This file contains the common defines of the application.
  * @author			: Huseyin Ozturk
  *	@note			: I received help from https://github.com/lamik/BMXX80_STM32_HAL
  ******************************************************************************
*/

#ifndef __BMP280_H
#define __BMP280_H

#ifdef __cplusplus
extern "C" {
#endif

/* Includes ------------------------------------------------------------------*/
// Hangi stm32 serisinde bu kutuphaneyi kullanmak istiyorsaniz asagidan hal kutuphanesini ayarlayabilirsiniz.
#include "stm32f1xx_hal.h"



/* BMP280 Config -------------------------------------------------------------*/

/* BMP280 I2C */
// Burdan kullanmak istediginiz i2c hattini ayarlayin.
#ifndef BMP280_I2C
#define BMP280_I2C			hi2c1
#endif

/* Pressure oversampling */
//Kullanmak istediginiz sampling disindaki secenekleri yorum satiri yapin.

//#define BMP280_PRESSURE_OVERSAMPLING			0			/* None */
//#define BMP280_PRESSURE_OVERSAMPLING		  1 		/* ULTRA LOW POWER 1x */
//#define BMP280_PRESSURE_OVERSAMPLING			2			/* LOW POWER 2x */
#define BMP280_PRESSURE_OVERSAMPLING			3			/* STANDART 4x */
//#define BMP280_PRESSURE_OVERSAMPLING			4			/* HIGH RESOLUTION 8x */
//#define BMP280_PRESSURE_OVERSAMPLING		  5			/* ULTRA HIGH RESOLUTION 16x */

/* Temperature Resolution */
//Kullanmak istediginiz sicaklik olcumu cozunurlugu disindaki secenekleri yorum satiri yapin.

#define BMP280_TEMPERATURE_RESOLUTION 1		/* 16 BIT */
//#define BMP280_TEMPERATURE_RESOLUTION 2		/* 17 BIT */
//#define BMP280_TEMPERATURE_RESOLUTION 3		/* 18 BIT */
//#define BMP280_TEMPERATURE_RESOLUTION 4		/* 19 BIT */
//#define BMP280_TEMPERATURE_RESOLUTION 5		/* 20 BIT */

/* Mode */

//#define BMP280_MODE		0			/* SLEEP MODE */
#define BMP280_MODE		1			/* FORCED MODE */
//#define BMP280_MODE		3			/* NORMAL MODE */


/* BMP280 Registers & etc. ---------------------------------------------------*/

/* BMP280 I2C address */
#ifndef BMP280_I2C_ADDRESS
#define BMP280_I2C_ADDRESS			0x76
#endif


#define BMP280_CHIP_ID            0x58

/* Registers */
#define	BMP280_REGISTER_DIG_T1		0x88
#define	BMP280_REGISTER_DIG_T2		0x8A
#define	BMP280_REGISTER_DIG_T3		0x8C

#define	BMP280_REGISTER_DIG_P1		0x8E
#define	BMP280_REGISTER_DIG_P2		0x90
#define	BMP280_REGISTER_DIG_P3		0x92
#define	BMP280_REGISTER_DIG_P4		0x94
#define	BMP280_REGISTER_DIG_P5		0x96
#define	BMP280_REGISTER_DIG_P6		0x98
#define	BMP280_REGISTER_DIG_P7		0x9A
#define	BMP280_REGISTER_DIG_P8		0x9C
#define	BMP280_REGISTER_DIG_P9		0x9E

#define	BMP280_REGISTER_CHIPID			0xD0
#define	BMP280_REGISTER_VERSION			0xD1
#define	BMP280_REGISTER_SOFTRESET		0xE0
#define	BMP280_REGISTER_CAL26			0xE1
#define	BMP280_REGISTER_STATUS			0xF3
#define	BMP280_REGISTER_CONTROL			0xF4
#define	BMP280_REGISTER_CONFIG			0xF5
#define	BMP280_REGISTER_PRESSUREDATA		0xF7
#define	BMP280_REGISTER_TEMPDATA			0xFA

/* Commands */

#define BMP280_MODE_SLEEP			0			/* SLEEP MODE */
#define BMP280_MODE_FORCED		1			/* FORCED MODE */
#define BMP280_MODE_NORMAL		3			/* NORMAL MODE */
#define BMP280_SW_RESET     0xB6    /* SOWFTWARE RESET */



/* BMP280 Typdef,Structs etc.--------------------------------------------------*/

typedef struct {
	uint16_t dig_T1;
  int16_t dig_T2;  
  int16_t dig_T3;  

  uint16_t dig_P1;
  int16_t dig_P2;  
  int16_t dig_P3; 
  int16_t dig_P4;  
  int16_t dig_P5;  
  int16_t dig_P6;  
  int16_t dig_P7;  
  int16_t dig_P8;  
  int16_t dig_P9;  
}BMP280_calibData_t;



typedef struct {
		uint8_t isConnected;
		uint8_t libInitialized;
		uint32_t Pressure;
		float Altitude;
		float Temperature;
		BMP280_calibData_t calibData;
		int32_t t_fine;
 }BMP280_t;

 /* BMP280 Functions ---------------------------------------------------------*/
 
uint8_t BMP280_Read8(uint8_t addr);
uint16_t BMP280_Read16(uint8_t addr);
uint16_t BMP280_Read16LE(uint8_t addr);
void BMP280_Write8(uint8_t address, uint8_t data);
uint32_t BMP280_Read24(uint8_t addr);
void BMP280_SetConfig(uint8_t standby_time, uint8_t filter);
void BMP280_Init(void);
float BMP280_ReadTemperature(void);
int32_t BMP280_ReadPressure(void);
float BMP280_CalcAltitude(void);
void BMP280_ReadAll(void);
 
#ifdef __cplusplus
}
#endif

#endif /* __BMP280_H */

/*****END OF FILE****/

