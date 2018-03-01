import java.util.Scanner;

import utilities.FuelType;
import utilities.VehicleType;

//Parent class
public abstract class Vehicle {

	protected String plate, model, owner, fuelType;

	// Default Constructor to print out the Vehicles details [Generate Constructor]

	public Vehicle() {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the registration plate, please?");
		String plate = input.next();

		System.out.println("Model of the Vehicle?");
		String model = input.next();

		System.out.println("Owner's name?");
		String owner = input.next();

		System.out.println("Fuel Type?");
		String FuelType = input.next();
		
		input.close();
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