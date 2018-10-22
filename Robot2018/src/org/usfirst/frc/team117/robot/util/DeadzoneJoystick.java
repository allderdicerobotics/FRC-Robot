package org.usfirst.frc.team117.robot.util;

import edu.wpi.first.wpilibj.Joystick;

public class DeadzoneJoystick extends Joystick {
	
	private double deadzoneThreshold;
	
	public DeadzoneJoystick(int port, double deadzone) {
		super(port);
		deadzoneThreshold = deadzone;
	}
	
	public double getAxis(int axis) {
		double value = super.getRawAxis(axis);
		if (Math.abs(value) > deadzoneThreshold) {
			return value;
		} else {
			return 0.0;
		}
	}
	
	public boolean getButton(int button) {
		return super.getRawButton(button);
	}
	
	public int getPOV(int pov) {
		return super.getPOV(pov);
	}
	
	
}
