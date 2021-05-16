#include <FreqCount.h>
#include <LiquidCrystal.h>

LiquidCrystal lcd(12, 11, 4, 3, 2, 1);

void setup() {
  //Serial.begin(57600);
  lcd.begin(16, 2);
  lcd.print("Freq:");
  FreqCount.begin(1000);
}

void loop() {
  if (FreqCount.available()) {
    unsigned long count = FreqCount.read();
    lcd.setCursor(0, 1);
    lcd.print(count);
    lcd.print("       ");
  }
}
