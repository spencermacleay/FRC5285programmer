/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.TankDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private VictorSPX motorLeft1 = new VictorSPX(RobotMap.MotorLeft1ID);
  private VictorSPX motorLeft2 = new VictorSPX(RobotMap.MotorLeft2ID);
  private VictorSPX motorRight1 = new VictorSPX(RobotMap.MotorRight1ID);
  private VictorSPX motorRight2 = new VictorSPX(RobotMap.MotorRight2ID);
  //private VictorSPX TestMotor = new VictorSPX(RobotMap.TestMotorID);





  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new TankDrive());
  }

  public void setLeftMotors(double speed) {
    if (Math.abs(speed) < 0.1){
    speed = 0;
    }
    motorLeft1.set(ControlMode.PercentOutput, -speed);
    motorLeft2.set(ControlMode.PercentOutput, -speed);

   
    
 
  }
  

public void setRightMotors(double speed) {
  if (Math.abs(speed) < 0.1){
    speed = 0;
  }

  motorRight1.set(ControlMode.PercentOutput, speed);
  motorRight2.set(ControlMode.PercentOutput, speed);

  
  




}






}




