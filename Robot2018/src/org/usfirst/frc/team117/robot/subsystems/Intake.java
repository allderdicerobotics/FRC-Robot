package org.usfirst.frc.team117.robot.subsystems;

import org.usfirst.frc.team117.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.Victor;

public class Intake extends Subsystem{

	private Spark intakeMotorLeft;
	private Spark intakeMotorRight; 

	public Intake()
	{
		intakeMotorLeft = new Spark(RobotMap.INTAKE_PWM_LEFT);
		intakeMotorRight = new Spark(RobotMap.INTAKE_PWM_RIGHT);	
	}
	public void Init()
	{
		stop();
	}
	public void in()
	{
		setSpeed(RobotMap.INTAKE_SPEED);
	}
	public void out()
	{
		setSpeed(-(RobotMap.INTAKE_SPEED));
	}
	private void setSpeed(double speed)
	{
			intakeMotorLeft.setSpeed(speed);
			intakeMotorRight.setSpeed(speed);
	}
	public void stop()
	{
		intakeMotorLeft.setSpeed(0.0);
		intakeMotorRight.setSpeed(0.0);	
	}
	@Override
	protected void initDefaultCommand() {		
	}
}
