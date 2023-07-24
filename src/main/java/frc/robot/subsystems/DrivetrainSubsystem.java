// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenixpro.signals.InvertedValue;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DrivetrainSubsystem extends SubsystemBase {
  /** Creates a new DriveTrain. */
  private TalonSRX motorLeftprimary = new TalonSRX(Constants.MOTOR_LEFT_1_ID);;
  private TalonSRX motorLeftfollwer = new TalonSRX(Constants.MOTOR_LEFT_2_ID);
  // private TalonSRX motorRightprimary = new TalonSRX(Constants.MOTOR_RIGHT_1_ID);
  private VictorSPX motorRightprimary = new VictorSPX(Constants.MOTOR_RIGHT_1_ID);
  private TalonSRX motorRightfollower = new TalonSRX(Constants.MOTOR_RIGHT_2_ID);
  public DrivetrainSubsystem() {
    motorLeftprimary.configFactoryDefault();
    motorLeftfollwer.configFactoryDefault();

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
    motorLeftprimary.set(ControlMode.PercentOutput,speed);
  }

  public void setRightMotors(double speed){
    motorRightprimary.set(ControlMode.PercentOutput,speed);
  }

  public void stop(){
    motorLeftprimary.set(ControlMode.PercentOutput, 0);
    motorRightprimary.set(ControlMode.PercentOutput, 0);
  }

}
