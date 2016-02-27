package org.usfirst.frc.team1510.robot.commands;

import org.usfirst.frc.team1510.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team1510.robot.commands.Move;
/**
 *
 */
public class CrossLowBar extends CommandGroup {

    public CrossLowBar() {
    	addParallel(new Move(3.4));
    	addParallel(new DeployWheels(135));
    	
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}