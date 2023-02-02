// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenixpro.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;;

public class ArmSubsystem extends SubsystemBase {

  public ArmSubsystem() {
    lowerLeft.setInverted(false);
    lowerRight.setInverted(true);
    upperLeft.setInverted(false);
    upperRight.setInverted(true);
  }

  TalonFX lowerLeft = new TalonFX(ArmConstants.LowerLeftMotor);
  TalonFX lowerRight = new TalonFX(ArmConstants.LowerRightMotor);
  TalonFX upperLeft = new TalonFX(ArmConstants.UpperLeftMotor);
  TalonFX upperRight = new TalonFX(ArmConstants.UpperRightMotor);
  TalonFX spinningPlate = new TalonFX(ArmConstants.SpinningPlateMotor);

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public CommandBase exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }

  public void lowerDrive(double speed) {
    lowerLeft.set(speed);
    lowerRight.set(speed);
  }

  public void upperDrive(double speed) {
    upperLeft.set(speed);
    upperRight.set(speed);
  }

  public void spinningDrive(double speed) {
    spinningPlate.set(speed);
  }
}
