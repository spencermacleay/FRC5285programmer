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
import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.commands.Climber;
import frc.robot.commands.IntakeIn;
import frc.robot.commands.IntakeOut;
import frc.robot.commands.Move;
import frc.robot.commands.Shooter;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.IntakeSub;
import frc.robot.subsystems.ShooterSub;
import frc.robot.subsystems.SpindexerSubsystem;









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
   Button ButtonB = new JoystickButton(driverController, RobotMap.ButtonB);
   
   public double GetDriverRawAxis(int axis){
   return driverController.getRawAxis(axis);



}
 
private void configureButtonBindings() {
IntakeSub.setDefaultCommand(new RunCommand(() -> IntakeSub.setSpeed(() -> driverController.getRightStickY() * 0.5,
() -> driverController.getRightTrigger() - driverController.getLeftTrigger()), IntakeSub));
}
public OI() {
    
      ButtonLB.whileHeld(new IntakeOut());
      ButtonA.whileHeld(new Shooter());
      ButtonB.whenPressed(new Climber());
      ButtonX.whenPressed(new Move(4,0.5,0.5));
  
  
   }

  

}
