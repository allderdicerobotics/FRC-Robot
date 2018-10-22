package org.usfirst.frc.team117.robot.commands;

import org.usfirst.frc.team117.robot.util.Gamepad;
import org.usfirst.frc.team117.robot.util.OI;
import org.usfirst.frc.team117.robot.Robot;
import org.usfirst.frc.team117.robot.RobotMap;
import org.usfirst.frc.team117.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TeleopDrive extends Command {

	private DriveTrain drivetrain;
	private Gamepad driverGamepad;
	
    public TeleopDrive(DriveTrain drivetrain) {
    	this.drivetrain = drivetrain;
    	this.driverGamepad = Robot.driverPad;
    	System.out.println("In TeleopDrive Command");
    	requires(this.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	drivetrain.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double speed = RobotMap.THROTTLE_SCALE;
    	double steer = RobotMap.STEERING_SCALE;
    	
    	if(driverGamepad.getButton(Gamepad.kButtonA))
    	{
    		speed = speed / 1.5;
    		steer = steer / 1.1;
    	}
    	if(driverGamepad.getButton(Gamepad.kButtonRightBumper))
    	{
    		speed = speed * 1.5;
    		steer = steer * 1.3;
    	}
    	drivetrain.arcadeDrive(speed * driverGamepad.getAxis(Gamepad.kLeftStickY),
    			steer * driverGamepad.getAxis(Gamepad.kRightStickX));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	drivetrain.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
