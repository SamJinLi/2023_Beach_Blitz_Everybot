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

public static final class ArmConstants{
    // TODO: change these stuff as needed
    public static final int k_ARM_DRIVE_LEADER_ID = 16;
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
