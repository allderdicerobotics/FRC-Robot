package org.usfirst.frc.team117.robot.util;

//import edu.wpi.first.wpilibj.Joystick;

public class Gamepad extends DeadzoneJoystick {
		
	public static final double kDeadZone = 0.07;
	
	/* axis mappings */
	public static final int kLeftStickX = 0;
	public static final int kLeftStickY = 1;
	public static final int kLeftTrigger = 2;
	public static final int kRightTrigger = 3;
	public static final int kRightStickX = 4;
	public static final int kRightStickY = 5;
	
	/* button mappings */
	public static final int kButtonA = 1;
	public static final int kButtonB = 2;
	public static final int kButtonX = 3;
	public static final int kButtonY = 4;
	public static final int kButtonLeftBumper = 5;
	public static final int kButtonRightBumper = 6;
	public static final int kButtonBack = 7;
	public static final int kButtonStart = 8;
	public static final int kButtonLeftStick = 9;
	public static final int kButtonRightStick = 10;
	public static final int kPOVDPad = 0;
	
	public Gamepad(int port) {
		super(port, kDeadZone);
	}
	

	
}
