import java.util.Scanner;
import utilities.FuelType;
import utilities.VehicleType;

public class Car extends Vehicle {

	private String color;

	// Constructor
	public Car() {
		super();

		this.color = color;

		Scanner input = new Scanner(System.in);

		System.out.println("Color of the car?");
		String color = input.next();

		input.close();
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