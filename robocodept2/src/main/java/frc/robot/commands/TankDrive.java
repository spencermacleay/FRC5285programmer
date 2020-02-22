/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class TankDrive extends Command {
  public TankDrive() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.driveTrain);
  
  
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  
  
  
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    double leftStickY= Robot.m_oi.GetDriverRawAxis(RobotMap.LeftStickY);
    double rightStickY= Robot.m_oi.GetDriverRawAxis(RobotMap.RightStickY);
  
  
    Robot.driveTrain.setLeftMotors(leftStickY*leftStickY*leftStickY/Math.abs(leftStickY));
   Robot.driveTrain.setRightMotors(rightStickY*rightStickY*rightStickY/Math.abs(rightStickY));

    
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  Robot.driveTrain.setLeftMotors(0);
  Robot.driveTrain.setLeftMotors(0);

  
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  this.end();
   }
}