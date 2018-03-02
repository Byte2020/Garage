import java.util.Scanner;

import javax.swing.JOptionPane;

import utilities.FuelType;
import utilities.VehicleType;

public class Car extends Vehicle {

	private String color;

	// Constructor
	public Car() {
		super();

		color= JOptionPane.showInputDialog("What color is the car?");
		
	}





	public Car(String plate, String model, String owner, String color, String fuelType) {
		super(plate,model,owner,fuelType);
		this.color=color;
	}




	@Override
	public String getInfo() {
		return plate + "\t" + model + "\t" + owner + "\t" + color + "\t" + fuelType;
	}

	@Override
	public VehicleType getType() {
		return VehicleType.CAR;

	}
}