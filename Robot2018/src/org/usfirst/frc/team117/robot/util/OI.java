/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team117.robot.util;

import org.usfirst.frc.team117.robot.Robot;
import org.usfirst.frc.team117.robot.commands.ElevatorDown;
import org.usfirst.frc.team117.robot.commands.ElevatorStop;
import org.usfirst.frc.team117.robot.commands.ElevatorUp;
import org.usfirst.frc.team117.robot.commands.IntakeIn;
import org.usfirst.frc.team117.robot.commands.IntakeOut;
import org.usfirst.frc.team117.robot.commands.IntakeStop;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public OI() {
		new JoystickButton(Robot.operatorPad, Gamepad.kButtonY).whenPressed(new ElevatorUp());
		new JoystickButton(Robot.operatorPad, Gamepad.kButtonY).whenReleased(new ElevatorStop());

		new JoystickButton(Robot.operatorPad, Gamepad.kButtonA).whenPressed(new ElevatorDown());
		new JoystickButton(Robot.operatorPad, Gamepad.kButtonA).whenReleased(new ElevatorStop());

		new JoystickButton(Robot.operatorPad, Gamepad.kButtonX).whenPressed(new IntakeIn());
		new JoystickButton(Robot.operatorPad, Gamepad.kButtonX).whenReleased(new IntakeStop());

		new JoystickButton(Robot.operatorPad, Gamepad.kButtonB).whenPressed(new IntakeOut());
		new JoystickButton(Robot.operatorPad, Gamepad.kButtonB).whenReleased(new IntakeStop());


	}
}
