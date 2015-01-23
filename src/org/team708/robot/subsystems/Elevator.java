package org.team708.robot.subsystems;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.team708.robot.RobotMap;

public class Elevator extends Subsystem {

	//Talon declarations
	private CANTalon elevatorMaster, elevatorSlave;
	
	//Sensor declarations
	private DigitalInput upperLimit, lowerLimit;
	private Encoder elevatorEncoder;
	
	public Elevator() {
		
		//Instantiates the Talons
		elevatorMaster = new CANTalon(RobotMap.elevatorMaster);
		elevatorSlave = new CANTalon(RobotMap.elevatorSlave);
		
		//Instantiates the limit switches
		upperLimit = new DigitalInput(RobotMap.upperLimit);
		lowerLimit = new DigitalInput(RobotMap.lowerLimit);
		
		//Instantiates the encoder
		elevatorEncoder = new Encoder(RobotMap.elevatorEncoderA, RobotMap.elevatorEncoderB);
		
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Make a command to run the elevator with a joystick

	}

}
