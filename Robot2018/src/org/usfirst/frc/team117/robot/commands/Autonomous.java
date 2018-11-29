package org.usfirst.frc.team117.robot.commands;

import org.usfirst.frc.team117.robot.Robot;
import org.usfirst.frc.team117.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


public class Autonomous extends CommandGroup
{
	public Autonomous() {
		addSequential(new AutonomousStraight());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
