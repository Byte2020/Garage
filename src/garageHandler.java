import java.io.FileNotFoundException;

import utilities.VehicleType;

public class garageHandler {

	Garage garage = new Garage();


	public garageHandler() throws FileNotFoundException {
		garage.readFromFile();
	}

	public void listParkedVehicles() {

		garage.printOutVehicleDetails();
	}

	public void listVehicleTypes() {
		// TODO
	}

	public void checkIn(Vehicle visitor) {
		if (visitor.getType() == VehicleType.CAR)
			garage.addVehicles(visitor);

	}

	public void checkOut(String regPlate) {
		garage.removeVehicle(regPlate);

	}

	public void registerParkedVehicles() throws FileNotFoundException {
		garage.writeCarsInGaragetoList();

	}

}
