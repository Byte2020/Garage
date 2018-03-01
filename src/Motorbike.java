import java.util.Scanner;

import utilities.FuelType;
import utilities.VehicleType;

public class Motorbike extends Vehicle {

	private String NumberOfWheels;

	// Constructor
	public Motorbike() {

		this.NumberOfWheels = NumberOfWheels;

		Scanner input = new Scanner(System.in);

		System.out.println("How many Wheels?");
		String NumberOfWheels = input.next();

		input.close();

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