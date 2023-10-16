// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

// Libraries import from officila code start
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMax.IdleMode;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.SparkMaxRelativeEncoder.Type;
import edu.wpi.first.networktables.GenericEntry;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.shuffleboard.BuiltInWidgets;
import java.util.function.Supplier;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.math.controller.PIDController;
// Libraries import from officila code end

import frc.robot.Constants.ArmConstants;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    /** Creates a new ArmSubsystem. */
    private final SparkMaxPIDController armPidController;
    private final RelativeEncoder armEncoder;
    CANSparkMax arm = new CANSparkMax(ArmConstants.arm_ID, MotorType.kBrushless);

    public ArmSubsystem() {
        this.armPidController = arm.getPIDController();
        this.armPidController.setP(.005);
        this.armPidController.setI(0);
        this.armPidController.setD(0);
        this.armPidController.setFF(0);
        this.armPidController.setIZone(0);

        this.armEncoder = this.arm.getEncoder(Type.kHallSensor, 42);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }
}
