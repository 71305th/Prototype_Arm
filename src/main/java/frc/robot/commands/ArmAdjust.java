// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.Constants.OIConstants;
import frc.robot.subsystems.ArmSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
 
/** An example command that uses an example subsystem. */
public class ArmAdjust extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final ArmSubsystem m_arm;
  private final String status;
  

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ArmAdjust(ArmSubsystem subsystem , String flag) {
    m_arm = subsystem;
    status = flag;
    System.out.println(status);
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println(status);
    if( status == "lowerDrive" )  m_arm.lowerDrive();
    if( status == "upperDrive ")  m_arm.upperDrive();
    if( status == "upperSpin ")  m_arm.upperSpin();
    if( status == "SpinningDrive ")  m_arm.spinningDrive();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
