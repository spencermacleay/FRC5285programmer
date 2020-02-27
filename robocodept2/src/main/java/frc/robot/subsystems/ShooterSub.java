/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Shooter;

/**
 * Add your docs here.
 */
public class ShooterSub extends Subsystem {
   double setpoint;
  
  private TalonSRX ShooterRight1 = new TalonSRX(RobotMap.ShooterRight1);
  private TalonSRX ShooterRight2 = new TalonSRX(RobotMap.ShooterRight2);
  private TalonSRX ShooterLeft1 = new TalonSRX(RobotMap.ShooterLeft1);
  private TalonSRX ShooterLeft2 = new TalonSRX(RobotMap.ShooterLeft2);
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new Shooter(1));
  }
  public void setRightShooterMotors(double speed){

    ShooterRight1.set(ControlMode.PercentOutput, speed);
    ShooterRight2.set(ControlMode.PercentOutput, speed);
  }
  
    public void setLeftShooterMotors(double speed){

      ShooterLeft1.set(ControlMode.PercentOutput, speed);
      ShooterLeft2.set(ControlMode.PercentOutput, speed);
    }
    

  
  
  }



