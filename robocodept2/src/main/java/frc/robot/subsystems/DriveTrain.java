/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.PWMSparkMax;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private PWMSparkMax motorLeft1 = new PWMSparkMax(RobotMap.MotorLeft1ID);
  private PWMSparkMax motorLeft2 = new PWMSparkMax(RobotMap.MotorLeft2ID);
  private PWMSparkMax motorRight1 = new PWMSparkMax(RobotMap.MotorRight1ID);
  private PWMSparkMax motorRight2 = new PWMSparkMax(RobotMap.MotorRight2ID);



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed) {
    
    motorLeft1.set(-speed);
    motorLeft2.set(-speed);

  }

  public void setRightMotors(double speed) {
  
    motorRight1.set(speed);
    motorRight2.set(speed);
 
}






}




