package org.usfirst.frc.team117.robot.commands;
import org.usfirst.frc.team117.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;



public class ElevatorDown extends Command {

	public ElevatorDown()
	{
		requires(Robot.elevator);
	}
	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.elevator.down();
	}

	@Override
	protected void end() {
		Robot.elevator.stop();
 	}

	@Override
	protected void interrupted() {
		Robot.elevator.stop();
	}
	

}
