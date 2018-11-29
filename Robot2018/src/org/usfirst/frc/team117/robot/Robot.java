/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team117.robot;

import edu.wpi.cscore.MjpegServer;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team117.robot.commands.Autonomous;
import org.usfirst.frc.team117.robot.commands.AutonomousStraight;
import org.usfirst.frc.team117.robot.commands.TeleopDrive;
import org.usfirst.frc.team117.robot.subsystems.DriveTrain;
import org.usfirst.frc.team117.robot.subsystems.Elevator;
import org.usfirst.frc.team117.robot.subsystems.Intake;
import org.usfirst.frc.team117.robot.util.Gamepad;
import org.usfirst.frc.team117.robot.util.OI;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public static final Elevator elevator = new Elevator();
	public static final Intake intake = new Intake();
	public static final DriveTrain driveTrain = new DriveTrain();
	public static final Gamepad operatorPad = new Gamepad(RobotMap.CONTROLLER_PORT);
	public static final Gamepad driverPad = new Gamepad(RobotMap.DRIVE_PORT);
	private static final String kDefaultAuto = "Default";
	private static final String kCustomAuto = "My Auto";

	public static OI m_oi;

	Command m_autonomousCommand;
	SendableChooser<Command> m_chooser;

	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	@Override
	public void robotInit() {
		m_oi = new OI();
		m_chooser = new SendableChooser<>();
		SmartDashboard.putData("Auto modes", m_chooser);
		driveTrain.setDefaultCommand(new TeleopDrive(driveTrain));
		setUpCameraServer();
	}
private void setUpCameraServer() {
	MjpegServer rawVideoServer = new MjpegServer("video", 1180);
	UsbCamera cam0 = new UsbCamera("camera", 0);
	rawVideoServer.setSource(cam0);
}
	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
//		m_autonomousCommand = m_chooser.getSelected();
		String gameData;
		gameData = DriverStation.getInstance().getGameSpecificMessage();
		m_autonomousCommand = new Autonomous();
		
		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */

		// schedule the autonomous command (example)
		if (m_autonomousCommand != null) {
				m_autonomousCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
		SmartDashboard.putString("m_chooser", m_chooser.getName());
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (m_autonomousCommand != null) {
				m_autonomousCommand.cancel();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
