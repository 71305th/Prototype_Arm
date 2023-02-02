// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.ArmSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {

  //Joystick
  private final Joystick DriverJoystick = new Joystick(0);
  private final Joystick OperatorJoystick = new Joystick(1);

  private final ArmSubsystem m_arm = new ArmSubsystem();

  public RobotContainer() {
    configureBindings();

    m_arm.setDefaultCommand(new RunCommand(() -> {
      m_arm.lowerDrive(0.1*OperatorJoystick.getRawAxis(OIConstants.rightStick_Y));
      m_arm.upperDrive(0.1*OperatorJoystick.getRawAxis(OIConstants.leftStick_Y));
      m_arm.spinningDrive(0.1*OperatorJoystick.getRawAxis(OIConstants.leftStick_X));
    }, m_arm));
  }

  private void configureBindings() {

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    return null;
  }
}
