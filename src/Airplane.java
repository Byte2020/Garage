import javax.swing.JOptionPane;
import utilities.VehicleType;

public class Airplane extends Vehicle {

	private String NumberOfSeats;

	public Airplane() {
		super();
		NumberOfSeats = JOptionPane.showInputDialog("How many seats?");
	}

	@Override
	public VehicleType getType() {
		return VehicleType.AIRPLANE;

	}

	@Override
	public String getInfo() {
		return plate + "\t" + model + "\t" + owner + "\t" + NumberOfSeats + "\t" + fuelType;
	}

}