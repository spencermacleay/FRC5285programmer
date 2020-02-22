/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.BallSpinner;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.IntakeOut;
import frc.robot.commands.Move;








/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {



private XboxController driverController = new XboxController(RobotMap.DriverController);
   Button ButtonX = new JoystickButton(driverController, RobotMap.ButtonX);
   Button ButtonLB = new JoystickButton(driverController, RobotMap.ButtonLB);
   Button ButtonY = new JoystickButton(driverController, RobotMap.ButtonY);
   Button ButtonA = new JoystickButton(driverController, RobotMap.ButtonA);
   public static Encoder m_encoder = new Encoder(RobotMap.kEncoderPortA, RobotMap.kEncoderPortB);
   public double GetDriverRawAxis(int axis){
   return driverController.getRawAxis(axis);



}
   
public double getTriggerAxisLeft(Hand kleft){
   return driverController.getTriggerAxis(Hand.kLeft);



}


public double getTriggerAxisRight(Hand kRight){
   return driverController.getTriggerAxis(Hand.kRight);



}

public OI() {
      ButtonX.whenPressed(new Move(4, 1 ,1));
      ButtonLB.whileHeld(new IntakeOut());
      ButtonA.whileHeld(new BallSpinner());
      
   }







}
