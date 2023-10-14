// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
// TODO:change the motors into a class/method, like Arm Constants
public static final int MOTOR_LEFT_PRIMARY_ID = 9;
public static final int MOTOR_LEFT_FOLLOWER_ID = 0;
public static final int MOTOR_RIGHT_PRIMARY_ID = 8;
public static final int MOTOR_RIGHT_FOLLOWER_ID = 2;
// public static final int MOTOR_LEFT_PRIMARY_ID = 2;
// public static final int MOTOR_LEFT_FOLLOWER_ID = 8;
// public static final int MOTOR_RIGHT_PRIMARY_ID = 9;
// public static final int MOTOR_RIGHT_FOLLOWER_ID = 0;

public static final class DriveConstants {

  public static final double kTrackWidth = Units.inchesToMeters(21);
  // Distance between right and left wheels
  public static final double kWheelBase = Units.inchesToMeters(25);
  // Distance between front and back wheels
  public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
          new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
          new Translation2d(kWheelBase / 2, kTrackWidth / 2),
          new Translation2d(-kWheelBase / 2, -kTrackWidth / 2),
          new Translation2d(-kWheelBase / 2, kTrackWidth / 2));

  public static final int kFrontLeftDriveMotorPort = 7;
  public static final int kBackLeftDriveMotorPort = 2;
  public static final int kFrontRightDriveMotorPort = 0;
  public static final int kBackRightDriveMotorPort = 5;

  public static final int kFrontLeftTurningMotorPort = 3;
  public static final int kBackLeftTurningMotorPort = 4;
  public static final int kFrontRightTurningMotorPort = 1;
  public static final int kBackRightTurningMotorPort = 6;

  public static final boolean kFrontLeftTurningEncoderReversed = false;
  public static final boolean kBackLeftTurningEncoderReversed = false;
  public static final boolean kFrontRightTurningEncoderReversed = false;
  public static final boolean kBackRightTurningEncoderReversed = false;

  public static final boolean kFrontLeftDriveEncoderReversed = false;
  public static final boolean kBackLeftDriveEncoderReversed = false;
  public static final boolean kFrontRightDriveEncoderReversed = false;
  public static final boolean kBackRightDriveEncoderReversed = false;

  public static final int kFrontLeftDriveAbsoluteEncoderPort = 1;
  public static final int kBackLeftDriveAbsoluteEncoderPort = 0;
  public static final int kFrontRightDriveAbsoluteEncoderPort = 3;
  public static final int kBackRightDriveAbsoluteEncoderPort = 2;

  public static double kFrontLeftDriveAbsoluteEncoderOffsetDeg = 0;
  public static double kBackLeftDriveAbsoluteEncoderOffsetDeg = 0;
  public static double kFrontRightDriveAbsoluteEncoderOffsetDeg = 0;
  public static double kBackRightDriveAbsoluteEncoderOffsetDeg = 0;

  public static final double kPhysicalMaxSpeedMetersPerSecond = 10;
  public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 6 * Math.PI;

  public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond;
  public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = kPhysicalMaxAngularSpeedRadiansPerSecond / 2;
  public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 3;
  public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 3;
}

public static final class ArmConstants{
    // TODO: change these stuff as needed
    public static final int arm_ID = 1;
    //Uncomment k_MOTORS_REVERSED if true
    public static final boolean k_MOTORS_REVERSED = true;
    public class ControlType{
        public static final int k_PERCENT = 0;
        public static final int k_POSITION = 1;
    } 
    public static final double k_SOFT_LIMIT = 125;

}

public static final int DRIVER_CONTROLLER = 0;
}
