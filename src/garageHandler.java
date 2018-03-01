
public class garageHandler {

	Garage garage=new Garage();
	
	
	public void listParkedVehicles() {
		
		
	}
	
	public void listVehicleTypes() {
		//TODO
	}

	public void checkIn(Vehicle visitor) {
		if(visitor.getType()==VehicleType.CAR ||visitor.getType()==VehicleType.MOTORBIKE )
		garage.addVehicles(vehicle);
		
	}

	public void checkOut(String regPlate) {
		garage.showPlate();
		
	}

	public void registerParkedVehicles() {
		// TODO Auto-generated method stub
		
	}

	
	
}
