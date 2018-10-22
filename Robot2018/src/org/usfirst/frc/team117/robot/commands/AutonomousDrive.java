package org.usfirst.frc.team117.robot.commands;

import org.usfirst.frc.team117.robot.Robot;
import org.usfirst.frc.team117.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class AutonomousDrive extends Command {
	
	private DriveTrain drivetrain;
	private boolean done;
	
//	private double targetDistance;
//	private double targetAngle;
	private double moveSpeed;
	private double angle;
//	private double turnSpeed;
	
	/* stopping threshold for distance (feet) */
	private static final double distanceTolerance = .25;
	
	/* stopping threshold for turning (degrees) */
	private static final double angleTolerance = 5.0;
	
    public AutonomousDrive(double distance, double angle,
    		double moveSpeed, double turnSpeed) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	drivetrain = Robot.driveTrain;
//    	this.targetDistance = distance;
//    	this.targetAngle = angle;
//    	this.moveSpeed = moveSpeed;
//    	this.turnSpeed = turnSpeed;
    	requires(drivetrain);
    }
    
    public AutonomousDrive(double speed, double angle)
    {
    	drivetrain = Robot.driveTrain;
    	this.moveSpeed = speed;
    	this.angle = angle;
    	requires(drivetrain);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	drivetrain.resetEncoders();
    	drivetrain.resetGyro();
    	drivetrain.arcadeDrive(0.0, 0.0);
    	
    	done = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//    	double angleError = targetAngle - drivetrain.getHeading();
//    	double distanceError = targetDistance - drivetrain.getDistance();
//    	double moveValue = 0.0;
//    	double rotateValue = 0.0;
//   
//    	done = true;
//    	if(Math.abs(angleError) > angleTolerance && targetAngle != 0.0) {
//    		rotateValue = (angleError > 0)? turnSpeed : -1 * turnSpeed;
//    		done = false;
//    	}
//    	
//    	if(Math.abs(distanceError) > distanceTolerance && targetDistance != 0.0) {
//    		//moveValue = (distanceError > 0)? moveSpeed : -1 * moveSpeed;
//    		moveValue = (distanceError > 0)? -1 * moveSpeed : moveSpeed;
//    		done = false;    	
    	drivetrain.arcadeDrive(-moveSpeed, 0.0);
    	
    	//SmartDashboard.putNumber("distance", drivetrain.getDistance());
    	//SmartDashboard.putNumber("angle", drivetrain.getHeading());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return done;
    }

    // Called once after isFinished returns true
    protected void end() {
    	drivetrain.arcadeDrive(0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}

