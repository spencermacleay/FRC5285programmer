/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ShooterSub extends Subsystem {
  private TalonSRX shootermotorLeft1 = new TalonSRX(RobotMap.shooterMotorLeft1ID);
  private TalonSRX shootermotorLeft2 = new TalonSRX(RobotMap.shooterMotorLeft2ID);
  private TalonSRX shootermotorRight1 = new TalonSRX(RobotMap.shooterMotorRight1ID);
  private TalonSRX shootermotorRight2 = new TalonSRX(RobotMap.shooterMotorRight2ID);
 
 
 
 
 
 
 
 
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


  public void setshooterLeftMotors(double speed) {
    if (Math.abs(speed) < 0.1){
    speed = 0;
    }
    shootermotorLeft1.set(ControlMode.PercentOutput, -speed);
    shootermotorLeft2.set(ControlMode.PercentOutput, -speed);

   
    
  }


  public void setshooterRightMotors(double speed) {
    
    shootermotorRight1.set(ControlMode.PercentOutput, -speed);
    shootermotorRight2.set(ControlMode.PercentOutput, -speed);

   
    
  }










}


































