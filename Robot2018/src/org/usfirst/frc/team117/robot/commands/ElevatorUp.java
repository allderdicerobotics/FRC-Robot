package org.usfirst.frc.team117.robot.commands;
import org.usfirst.frc.team117.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;


public class ElevatorUp extends Command {

	public ElevatorUp()
	{
		requires(Robot.elevator);
		System.out.println("In ElevatorUp Constructor");
	}
	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void initialize() {
		System.out.println("In ElevatorUp initialize");
	}

	@Override
	protected void execute() {
		System.out.println("In ElevatorUp execute");
		Robot.elevator.up();
	}

	@Override
	protected void end() {
		System.out.println("In ElevatorUp end");
		Robot.elevator.stop();
 	}

	@Override
	protected void interrupted() {
		System.out.println("In ElevatorUp interrupted");
		Robot.elevator.stop();
	}
	

}
