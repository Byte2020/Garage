import utilities.VehicleType;

public class garageHandler {

	Garage garage=new Garage();
	
	public garageHandler() {
		
		
	}
	
	
	public void listParkedVehicles() {
		
		
	}garage.printOutVehicleDetails();
	
	public void listVehicleTypes() {
		//TODO
	}

	public void checkIn(Vehicle visitor) {
		if(visitor.getType()==VehicleType.CAR ||visitor.getType()==VehicleType.MOTORBIKE )
		garage.addVehicles(visitor);
		
	}

	public void checkOut(String regPlate) {
		Vehicle vehicle=garage.findPlate();
		
	}

	public void registerParkedVehicles() {
		// TODO Auto-generated method stub
		
	}

	
	
}
