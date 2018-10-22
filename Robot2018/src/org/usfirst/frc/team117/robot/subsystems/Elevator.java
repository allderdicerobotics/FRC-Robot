package org.usfirst.frc.team117.robot.subsystems;

import org.usfirst.frc.team117.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.PWMSpeedController;


public class Elevator extends Subsystem{

	private PWMSpeedController elevatorMotor;
	//private DigitalInput topLimitSwitch;
	//private DigitalInput bottomLimitSwitch;

	public Elevator()
	{
		elevatorMotor = new Spark(RobotMap.ELEVATOR_PWM);
		//topLimitSwitch = new DigitalInput(Config.TOP_LIMIT_SWITCH_PWM);
		//bottomLimitSwitch = new DigitalInput(Config     .BOTTOM_LIMIT_SWITCH_PWM);
	}
	public void Init()
	{
		stop();
	}
	public void up()
	{
		setSpeed(RobotMap.ELEVATOR_SPEED);
	}
	public void down()
	{
		setSpeed(-(RobotMap.ELEVATOR_SPEED));
	}
	private void setSpeed(double speed)
	{
		//if(!topLimitSwitch.get() && !bottomLimitSwitch.get()) {
			elevatorMotor.setSpeed(speed);
		}
  //}
	public void stop()
	{
		elevatorMotor.setSpeed(0.0);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}
	

	

}
