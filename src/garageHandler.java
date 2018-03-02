import java.io.FileNotFoundException;

import utilities.VehicleType;

public class garageHandler {

	Garage garage = new Garage();
	
	// constructor
	public garageHandler() throws FileNotFoundException {
		garage.readFromFile();
	}

	
	// methods , aske by console after choosing action
	public void checkIn(Vehicle visitor) {
		switch (visitor.getType()) {	// The garage may allow new vehicles upon request 
		case CAR:{
			garage.addVehicles(visitor);
			break;
		}		
		case AIRPLANE:{
			System.out.println("You better go to Arlanda");
			break;
		}		
		case BUS:{
			System.out.println("The garage is too little for a bus");
			break;
		}		
		case MOTORBIKE:{
			garage.addVehicles(visitor);
			break;
		}
		
		default:
			break;
		}
			
	}

	public void checkOut(String regPlate) {
		garage.removeVehicle(regPlate);

	}

	public void listParkedVehicles() {
		garage.printOutVehicleDetails();
	}

	public void registerParkedVehicles() throws FileNotFoundException {
		garage.writeCarsInGaragetoList();

	}

}
