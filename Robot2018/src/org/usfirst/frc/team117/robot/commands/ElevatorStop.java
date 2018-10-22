package org.usfirst.frc.team117.robot.commands;
import org.usfirst.frc.team117.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;



public class ElevatorStop extends Command {

	public ElevatorStop()
	{
		requires(Robot.elevator);
	}
	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.elevator.stop();
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
