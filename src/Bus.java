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
		// TODO Auto-generated method stub
		return null;
	}

}
