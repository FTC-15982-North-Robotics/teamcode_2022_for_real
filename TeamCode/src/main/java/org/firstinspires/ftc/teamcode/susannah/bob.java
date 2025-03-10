package org.firstinspires.ftc.teamcode.susannah;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.Drive;
import org.firstinspires.ftc.teamcode.subsystems.System;

@TeleOp
public class bob extends LinearOpMode {

    public Drive drive;
    public System system;

    @Override
    public void runOpMode() {
        drive = new Drive(hardwareMap);
        system = new System(hardwareMap);

        telemetry.addData("Initialized", "Ready to start");
        waitForStart();

        while (opModeIsActive()) {
/*
  Drivetrain Options
 */
//                        double speed;
//                        speed = 1;
//                        backLeft.setPower(((1 * gamepad1.left_stick_y + gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);
//                        backRight.setPower(((-1 * gamepad1.left_stick_y + gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);
//                        frontLeft.setPower(((1 * gamepad1.left_stick_y - gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);
//                        frontRight.setPower(((-1 * gamepad1.left_stick_y - gamepad1.left_stick_x) - gamepad1.right_stick_x) * speed);

                        double speed = gamepad1.left_stick_y;
                        double turn = -gamepad1.right_stick_x;
                        double strafe = gamepad1.left_stick_x;
                        drive.frontLeft.setPower(speed + turn + strafe);
                        drive.frontRight.setPower(speed - turn + strafe);
                        drive.backLeft.setPower(speed + turn - strafe);
                        drive.backRight.setPower(speed - turn - strafe);

//                        if (gamepad1.right_bumper) {
//                            system.carousel.setPower(0.7);
//                        } else if (gamepad1.left_bumper) {
//                            system.carousel.setPower(-0.7);
//                        }

                        if (gamepad1.dpad_up) {
                            system.Elevate(1);
                        } else if (gamepad1.dpad_down) {
                            system.Elevate(0);
                        } else {
                            system.cascade.setPower(0.1);
                            system.cascadeDown.setPower(-.5);
                        }

//            double x = gamepad1.left_stick_x;
//            double y = gamepad1.left_stick_y*-1;
//            double turn = gamepad1.right_stick_x;
//            double theta = Math.atan2(y, x);
//            double power = Math.hypot(x, y);
//            double sin = Math.sin(theta - Math.PI/4);
//            double cos = Math.cos(theta - Math.PI/4);
//            double max = Math.max(Math.abs(sin), Math.abs(cos));
//            frontLeft.setPower(power * cos/max + turn);
//            frontRight.setPower(power * sin/max - turn);
//            backLeft.setPower(power * sin/max + turn);
//            backRight.setPower(power * cos/max - turn);
//            if ((power + Math.abs(turn)) > 1) {
//                frontLeft.setPower((frontLeft.getPower()) / power + turn);
//                frontRight.setPower((frontRight.getPower()) / power + turn);
//                backLeft.setPower((backLeft.getPower()) / power + turn);
//                backRight.setPower((backRight.getPower()) / power + turn);
//            }
/*
  Arm Cascade Options
  */
//                        if (gamepad1.right_trigger > 0.01) {
//                                cascade.setPower(gamepad1.right_trigger);
//                        } else if (gamepad1.left_trigger > 0.01) {
//                                cascade.setPower(gamepad1.left_trigger / -3);
//                        } else {
//                                cascade.setPower(0);
//                        }
//
//                        if (gamepad1.right_trigger > 0.01) {
//                                cascade.setPower(gamepad1.right_trigger);
//                        } else if (gamepad1.left_trigger > 0.01) {
//                                cascade.setPower(gamepad1.left_trigger / -3);
//                        } else {
//                                cascade.setPower(0.1);
//                        }
//
//                        Something having to do with encoders...
/*
  Intake
  */
//                        if (gamepad1.left_bumper) {
//                                intake.setPower(1);
//                        } else if (gamepad1.right_bumper) {
//                                intake.setPower(-1);
//                        } else {
//                                intake.setPower(0);
//                        }

            /*
            Intake for 2022-23 season game: Power Play, presented by Raytheon Technologies
             */

            telemetry.update();
        }
    }
}
// Hi Susan, good luck :) I believe in you!
