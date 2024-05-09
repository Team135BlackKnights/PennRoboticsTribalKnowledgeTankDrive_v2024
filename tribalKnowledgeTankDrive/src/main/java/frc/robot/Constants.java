// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  //motor declaration

  //drive motors - could also put this in a class declaration for these items
  public static final int frontLeftMotor = 10;
  public static final int frontRightMotor = 11;
  public static final int backLeftMotor = 12;
  public static final int backRightMotor = 13;
 
  //manipulator motors
  public static final int intake_Motor1 = 20; //flywheel motor
  public static final int intake_Motor2 = 21; //flywheel motor
  public static final int intake_Motor3 = 22; //actuation motor
  

  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
