package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class System {
    public DcMotor carousel;
    public DcMotor cascade;
    public Servo spinLeft;
    public Servo spinRight;
    public CRServo cascadeDown;

    public System(HardwareMap hardwareMap) {
        carousel = hardwareMap.get(DcMotor.class, "carousel");
        cascade = hardwareMap.get(DcMotor.class, "cascade");
        spinLeft = hardwareMap.get(Servo.class, "spinLeft");
        spinRight = hardwareMap.get(Servo.class, "spinRight");
        cascadeDown = hardwareMap.get(CRServo.class, "cascadeDown");
    }

    public void Elevate(Integer level) {
        if (level == 0) {
            cascade.setPower(-0.2);
            cascadeDown.setPower(-1);
        } else {
            cascade.setPower(0.5);
            cascadeDown.setPower(1);
        }
    }
}