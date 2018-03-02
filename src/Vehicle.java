import java.util.Scanner;

import javax.swing.JOptionPane;

import utilities.FuelType;
import utilities.VehicleType;

//Parent class
public abstract class Vehicle {

	protected String plate, model, owner, fuelType;

	// Default Constructor to print out the Vehicles details [Generate Constructor]

	public Vehicle() {

		plate= JOptionPane.showInputDialog("Enter the registration plate, please?");
		model= JOptionPane.showInputDialog("Model of the Vehicle?");
		owner= JOptionPane.showInputDialog("Owner's name?");
		fuelType= JOptionPane.showInputDialog("Fuel Type?");
	}
	public Vehicle(String plate, String model, String owner, String fuelType) {
		super();
		this.plate = plate;
		this.model = model;
		this.owner = owner;
		this.fuelType = fuelType;
	}
	// GETTERS	
	public String getPlate() {
		return plate;
	}



	public String getModel() {
		return model;
	}

	public String getOwner() {
		return owner;
	}
	
	public String getFuelType() {
		return fuelType;
	}

	
	
	public abstract String getInfo();
	public abstract VehicleType getType();
	

	// Print out method
	public void printDetails() {

		System.out.println("The registration plate of this vehicles is" + this.plate);
		System.out.println("The model of this vehicle is" + this.model);
		System.out.println("The owner is" + this.owner);
		System.out.println("This vehicle is" + fuelType);

	}

}