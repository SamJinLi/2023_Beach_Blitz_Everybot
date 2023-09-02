// // Copyright (c) FIRST and other WPILib contributors.
// // Open Source Software; you can modify and/or share it under the terms of
// // the WPILib BSD license file in the root directory of this project.

// package frc.robot.subsystems;

// import edu.wpi.first.math.controller.PIDController;
// // import edu.wpi.first.networktables.GenericEntry;
// import edu.wpi.first.wpilibj2.command.PIDSubsystem;
// import com.revrobotics.RelativeEncoder;
// import com.revrobotics.SparkMaxRelativeEncoder.Type;
// import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkMax.IdleMode;
// import com.revrobotics.CANSparkMaxLowLevel.MotorType;

// import frc.robot.Constants.*;

// public class ArmSubsystem extends PIDSubsystem {
//     private final CANSparkMax armDriveLeader;
//     private final RelativeEncoder armEncoder;
//   /** Creates a new Arm. */
//   public ArmSubsystem(){
//     super(
//     // The PIDController used by the subsystem
//     new PIDController(0, 0, 0));
//     // NOTE: everything belows here

//     armDriveLeader = new CANSparkMax(ArmConstants.k_ARM_DRIVE_LEADER_ID, MotorType.kBrushless);
// // CANSparkMax(ArmConstants.k_ARM_DRIVE_LEADER_ID, MotorType.kBrushless);
//     armDriveLeader.restoreFactoryDefaults();
//     armDriveLeader.setInverted(ArmConstants.k_MOTORS_REVERSED);
//     armDriveLeader.setIdleMode(IdleMode.kBrake);


//     armEncoder = armDriveLeader.getEncoder(Type.kHallSensor, 42);
//   }

//   @Override
//   public void useOutput(double output, double setpoint) {
//     // Use the output here
//   }

//   @Override
//   public double getMeasurement() {
//     // Return the process variable measurement here
//     return 0;
//   } 
//   public void printEncoderVal(){
//     System.out.println(armEncoder.getPosition());
//   }
// }
