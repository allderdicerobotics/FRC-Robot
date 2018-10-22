package org.usfirst.frc.team117.robot.commands;

import org.usfirst.frc.team117.robot.RobotMap;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

public class AutonomousForward extends CommandGroup
{
	public AutonomousForward()
	{
//		this.addSequential(new AutonomousDrive(168.0, 0.0, RobotMap.THROTTLE_SCALE, 0.0)); this.addSequential(new WaitCommand(2.0));
//		StopDriving();
//		this.addSequential(new WaitCommand(5.0));
		this.addSequential(new AutonomousDrive(RobotMap.THROTTLE_SCALE, 0.0), 2.5); 
		//this.addSequential(new WaitCommand(3.0));
		this.addSequential(new AutonomousDrive(0.0, 0.0)); 
		this.addSequential(new WaitCommand(1.0));

	}
	private void StopDriving(){
//		this.addSequential(new AutonomousDrive(0.0, 0.0, 0.0, 0.0)); this.addSequential(new WaitCommand(0.1));
	}

}
