import javax.swing.JOptionPane;
import utilities.VehicleType;

public class Bus extends Vehicle {

	private String length;

	public Bus() {
		super();
		length = JOptionPane.showInputDialog("Length of the bus?");
	}

	@Override
	public VehicleType getType() {
		return VehicleType.BUS;

	}

	@Override
	public String getInfo() {
			return plate + "\t" + model + "\t" + owner + "\t" + length  + "\t" + fuelType;
		}

}
