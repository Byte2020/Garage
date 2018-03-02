import java.util.Scanner;

import javax.swing.JOptionPane;

import utilities.FuelType;
import utilities.VehicleType;

public class Motorbike extends Vehicle {

	private String NumberOfWheels;

	// Constructor
	public Motorbike() {
		super();
		NumberOfWheels= JOptionPane.showInputDialog("How many wheels?");
	}

	@Override
	public VehicleType getType() {
		return VehicleType.MOTORBIKE;

	}

	@Override
	public String getInfo() {
		return plate + "\t" + model + "\t" + owner + "\t" + NumberOfWheels + "\t" + fuelType;
	}
}