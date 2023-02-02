// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public final class ArmConstants {
        public static final int LowerLeftMotor = 0;
        public static final int LowerRightMotor = 0;
        public static final int UpperLeftMotor = 0;
        public static final int UpperRightMotor = 0;
        public static final int SpinningPlateMotor = 0;
  } 

  public final class OIConstants {
        // Logitech F310 (X Input Mode)
        public static final int leftStick_X = 0;
        public static final int leftStick_Y = 1;
        public static final int rightStick_X = 4;
        public static final int rightStick_Y = 5;
        public static final int trigger_L = 2;
        public static final int trigger_R = 3;
        public static final int Btn_A = 1;
        public static final int Btn_B = 2;
        public static final int Btn_X = 3;
        public static final int Btn_Y = 4;
        public static final int Btn_LB = 5;
        public static final int Btn_RB = 6;
        public static final int Btn_LS = 9;  
        public static final int Btn_RS = 10;    
  }
}
