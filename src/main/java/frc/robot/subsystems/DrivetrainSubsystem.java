// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private TalonSRX motorLeftprimary = new TalonSRX(Constants.MOTOR_LEFT_PRIMARY_ID);;
  private TalonSRX motorLeftfollwer = new TalonSRX(Constants.MOTOR_LEFT_FOLLOWER_ID);
  // private TalonSRX motorRightprimary = new TalonSRX(Constants.MOTOR_RIGHT_1_ID);
  private VictorSPX motorRightfollower  = new VictorSPX(Constants.MOTOR_RIGHT_FOLLOWER_ID);
  private TalonSRX motorRightprimary = new TalonSRX(Constants.MOTOR_RIGHT_PRIMARY_ID);
  public DrivetrainSubsystem() {
    motorLeftprimary.configFactoryDefault();
    motorLeftfollwer.configFactoryDefault();

    TalonSRXConfiguration config = new TalonSRXConfiguration();
    config.peakCurrentLimit = 40; // the peak current, in amps
    config.peakCurrentDuration = 1500; // the time at the peak current before the limit triggers, in ms
    config.continuousCurrentLimit = 30; // the current to maintain if the peak limit is triggered
    motorLeftprimary.configAllSettings(config); // apply the config settings; this selects the quadrature encoder
    motorLeftfollwer.configAllSettings(config); // apply the config settings; this selects the quadrature encoder
    motorRightprimary.configAllSettings(config);// apply the config settings; this selects the quadrature encoder


    motorRightprimary.configFactoryDefault();
    motorRightfollower.configFactoryDefault();

    motorLeftfollwer.follow(motorLeftprimary);
    motorRightfollower.follow(motorRightprimary);

    motorLeftprimary.setInverted(InvertType.InvertMotorOutput);
    motorLeftfollwer.setInverted(InvertType.FollowMaster);
    motorRightprimary.setInverted(InvertType.None);
    motorRightfollower.setInverted(InvertType.FollowMaster);

    // or
    // motorLeftprimary.setInverted(InvertType.None);
    // motorLeftfollwer.setInverted(InvertType.FollowMaster);
    // motorRightprimary.setInverted(InvertType.InvertMotorOutput);
    // motorRightfollower.setInverted(InvertType.FollowMaster);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setLeftMotors(double speed){
    if (Math.abs(speed) < 0.70){
    motorLeftprimary.set(ControlMode.PercentOutput,(speed));
    }
  }

  public void setRightMotors(double speed){
    if (Math.abs(speed) < 0.70){
        motorRightprimary.set(ControlMode.PercentOutput,(speed));
        }
  }

  public void stop(){
    motorLeftprimary.set(ControlMode.PercentOutput, 0);
    motorRightprimary.set(ControlMode.PercentOutput, 0);
  }

}
