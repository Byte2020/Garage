import utilities.VehicleType;

public class garageHandler {

	Garage garage = new Garage();

	public garageHandler() {

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

	public void registerParkedVehicles() {
		// TODO Auto-generated method stub

	}

}
