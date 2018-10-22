package org.usfirst.frc.team117.robot.commands;
import org.usfirst.frc.team117.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;



public class IntakeStop extends Command {

	public IntakeStop()
	{
		requires(Robot.intake);
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
		Robot.intake.stop();
	}

	@Override
	protected void end() {
		Robot.intake.stop();
 	}

	@Override
	protected void interrupted() {
		Robot.intake.stop();
	}
	

}
