#include <PinChangeInt.h>
#include <PinChangeIntConfig.h>
#include <EEPROM.h>
#define _NAMIKI_MOTOR   //for Namiki 22CL-103501PG80:1
#include <fuzzy_table.h>
#include <PID_Beta6.h>
#include <MotorWheel.h>
#include <Omni4WD.h>

irqISR(irq1, isr1);
MotorWheel wheel1(3, 2, 4, 5, &irq1);

irqISR(irq2, isr2);
MotorWheel wheel2(11, 12, 14, 15, &irq2);

irqISR(irq3, isr3);
MotorWheel wheel3(9, 8, 16, 17, &irq3);

irqISR(irq4, isr4);
MotorWheel wheel4(10, 7, 18, 19, &irq4);


Omni4WD Omni(&wheel1, &wheel2, &wheel3, &wheel4);

void setup() {
  TCCR1B = TCCR1B & 0xf8 | 0x01; // Pin9,Pin10 PWM 31250Hz
  TCCR2B = TCCR2B & 0xf8 | 0x01; // Pin3,Pin11 PWM 31250Hz

  Omni.PIDEnable(0.31, 0.01, 0, 10);
}

int speed = 0;

void loop() {
    speed = 100;
    float rs_a = 3;
    float rs_b = 30;
    while (rs_a > 0) {
        rs_c(rs_b);
        rs_a -= 1;
        rs_b *= 2;
    }
    return;
}

void rs_c(float rs_b) {
    float rs_d = 4;
    while (rs_d > 0) {
        float rs_e = rs_b;
        Omni.setCarMove(speed, rs_e<0 ? PI*3/2 : PI/2);
        Omni.delayMS(abs(rs_e)/speed);
        Omni.setCarStop();
        float rs_f = speed/(sqrt(pow(Omni.getWheelspan()/2,2)*2));
        Omni.setCarMove(0, 0, rs_f);
        Omni.delayMS(90/rs_f);
        Omni.setCarStop();
        rs_d -= 1;
    }
    return;
}
