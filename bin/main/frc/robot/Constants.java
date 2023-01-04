// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.io.FilenameFilter;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final int FLYWHEEL_ID = 5;
    public static WPI_TalonFX flyWheelMotorTalon = new WPI_TalonFX(FLYWHEEL_ID);
    public static MotorController flywheelMotor = flyWheelMotorTalon;

    public static final int FRONT_LEFT_MOTOR = 4;
    public static final int FRONT_RIGHT_MOTOR = 3; 
    public static final int REAR_LEFT_MOTOR = 1;
    public static final int REAR_RIGHT_MOTOR = 2;

    public static final double ROTATION_MULTIPLIER_CONSTANT = 0.6;
    public static final double SPEED_MULTIPLIER_CONSTANT = -0.2;
}