package org.usfirst.frc.team280.robot.subsystems;

import org.usfirst.frc.team280.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;

public class GripWheel extends Subsystem {

	WPI_TalonSRX Motor = new WPI_TalonSRX(RobotMap.GripWheelTalon);
	
	public GripWheel() {
		
	}
	
	public void intake(double speed) {
		Motor.set(speed);
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}
