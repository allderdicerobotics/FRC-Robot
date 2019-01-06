package org.usfirst.frc.team117.robot.commands;

import org.usfirst.frc.team117.robot.Robot;
import org.usfirst.frc.team117.robot.RobotMap;
import org.usfirst.frc.team117.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class AutonomousStraight extends Command{
	
	public AutonomousStraight() {
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(3.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.tankDrive(-(RobotMap.THROTTLE_SCALE), -(RobotMap.THROTTLE_SCALE));
    }//my dick is hard

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
