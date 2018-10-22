package org.usfirst.frc.team117.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import org.usfirst.frc.team117.robot.RobotMap;
import org.usfirst.frc.team117.robot.commands.TeleopDrive;

import edu.wpi.first.wpilibj.Victor;


public class DriveTrain extends Subsystem{

	private Victor rightMotor;
	private Victor leftMotor;
	private DifferentialDrive robotDrive;
	
	public DriveTrain() {
		leftMotor = new Victor(RobotMap.DRIVE_TRAIN_LEFT);
		rightMotor = new Victor(RobotMap.DRIVE_TRAIN_RIGHT);
		robotDrive = new DifferentialDrive(leftMotor, rightMotor);
	}
	
	public void arcadeDrive(double speed, double rotation)
	{
		robotDrive.arcadeDrive(speed, rotation);
	}
	public void resetEncoders()
	{
		
	}
	public void resetGyro()
	{
		
	}
	public void stop()
	{
		robotDrive.arcadeDrive(0.0, 0.0);
	}
	public double getHeading()
	{
		return 0.0;
	}
	public double getDistance()
	{
		return 0.0;
	}
	public void rightMotorMove(boolean forward)
	{
		if(forward)
		{
			rightMotor.set(RobotMap.THROTTLE_SCALE);
		}
		else
		{
			rightMotor.set(-(RobotMap.THROTTLE_SCALE));
		}
	}
	public void leftMotorMove(boolean forward)
	{
		if(forward)
		{
			leftMotor.set(RobotMap.THROTTLE_SCALE);
		}
		else
		{
			leftMotor.set(-(RobotMap.THROTTLE_SCALE));
		}
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
