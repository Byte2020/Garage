import javax.swing.JOptionPane;
import utilities.VehicleType;

public class Car extends Vehicle {

	private String color;

	// 2 Constructors    one for a new car registration and one for a car that was registered from another day
	public Car() {
		super();
		color = JOptionPane.showInputDialog("What color is the car?");
	}

	//History list
	public Car(String plate, String model, String owner, String color, String fuelType) {
		super(plate, model, owner, fuelType);
		this.color = color;
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