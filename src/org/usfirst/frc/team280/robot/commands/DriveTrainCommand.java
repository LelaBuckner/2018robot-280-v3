package org.usfirst.frc.team280.robot.commands;

import org.usfirst.frc.team280.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveTrainCommand extends Command {


	// int leftSpeed = 1;
	// int rightSpeed = 1;
	
    public DriveTrainCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.Drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	System.out.println("Starting drivetrain");
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.Drivetrain.tankDrive(-1*Robot.m_oi.leftStick.getX(), -1*Robot.m_oi.rightStick.getX());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
