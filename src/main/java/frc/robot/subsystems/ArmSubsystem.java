// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenixpro.hardware.TalonFX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ArmConstants;
import frc.robot.Constants.OIConstants;;

public class ArmSubsystem extends SubsystemBase {

  private final Joystick OperatorJoystick = new Joystick(1);
  
  public ArmSubsystem() {
    LowerLeft.setInverted(false);
    LowerRight.setInverted(true);
    UpperArm.setInverted(false);
    UpperSpinner.setInverted(true);
  }

  TalonFX LowerLeft = new TalonFX(ArmConstants.LowerLeftMotor);
  TalonFX LowerRight = new TalonFX(ArmConstants.LowerRightMotor);
  TalonFX UpperArm = new TalonFX(ArmConstants.UpperArmMotor);
  TalonFX UpperSpinner = new TalonFX(ArmConstants.UpperSpinnerMotor);
  TalonFX SpinningPlate = new TalonFX(ArmConstants.SpinningPlateMotor);

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

  public void lowerDrive(Double speed) {
    LowerLeft.set(speed);
    LowerRight.set(speed);
  }

  public void upperDrive(Double speed) {
    UpperArm.set(speed);
  }

  public void upperSpin(Double speed){
    UpperSpinner.set(speed);
  }

  public void spinningDrive(Double speed) {
    SpinningPlate.set(speed);
  }
}
