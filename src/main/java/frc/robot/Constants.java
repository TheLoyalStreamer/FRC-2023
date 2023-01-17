// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static final class DriveConstants { //TODO: add all of these
        public static final int kLeftMotor1Port = 0;
        public static final int kLeftMotor2Port = 0;
        public static final int kRightMotor1Port = 0;
        public static final int kRightMotor2Port = 0;

        public static final int[] kLeftEncoderPorts = {0, 0};
        public static final int[] kRightEncoderPorts = {0, 0};
        public static final boolean kLeftEncoderReversed = false;
        public static final boolean kRightEncoderReversed = false;

        public static final double kEncoderDistancePerPulse = 0.5;

        public static final double kPDriveVel = 0;
        public static final double ksVolts = 0;
        public static final double kvVoltSecondsPerMeter = 0;
        public static final double kaVoltSecondsSquaredPerMeter = 0;

        public static final DifferentialDriveKinematics kDriveKinematics = null;
    }

    public static final class TrajectoryConstants { //TODO: add all of these
        public static final double kMaxSpeedMetersPerSecond = 0; 
        public static final double kMaxAccelerationMetersPerSecondSquared = 0;

        public static final double kRamseteB = 0;
        public static final double kRamseteZeta = 0;
    }

}
