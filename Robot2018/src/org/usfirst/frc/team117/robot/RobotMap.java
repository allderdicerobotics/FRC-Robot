/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team117.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//PWM Ports
	public static final int ELEVATOR_PWM = 5;
	public static final int ELEVATOR_PWM_2 = 4;
	public static final int CLAW_PWM = 1;
	public static final int INTAKE_PWM_LEFT = 6;
	public static final int INTAKE_PWM_RIGHT = 7;

	public static final int DRIVE_TRAIN_LEFT = 2;
	public static final int DRIVE_TRAIN_RIGHT = 3;
	public static final int DRIVE_TRAIN_RIGHT_2 = 9;
	public static final int DRIVE_TRAIN_LEFT_2 = 8;
	public static final int PLATFORM_PWM = 1;
	public static final int TOP_LIMIT_SWITCH_PWM = 1;
	public static final int BOTTOM_LIMIT_SWITCH_PWM = 1;

	//USB Ports
	public static final int DRIVE_PORT = 0;
	public static final int CONTROLLER_PORT = 1;

	//speed constants
	public static final double ELEVATOR_SPEED = 0.75;
	public static final double INTAKE_SPEED = 0.75;
	public static final double THROTTLE_SCALE = 0.6;
	public static final double STEERING_SCALE = 0.6;
	
	//Distance constants
}
