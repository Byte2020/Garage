import java.util.ArrayList;


public class Garage {

	private static final int maxCapacity = 10;
	


	private Vehicle[] vehiclesParked= new Vehicle[maxCapacity];
	private int nextFreespot=0;
	
	// Constructor
	public Garage()
	{
		
	}
	

	//Method to find parking spot available in the Garage	
	public int NumberOfAvailableSpots(){
		return maxCapacity - nextFreespot; 
	}
	
	public void addVehicles(Vehicle vehicle) {
		if (NumberOfAvailableSpots() > 0) {
			vehiclesParked[nextFreespot]=vehicle;
			nextFreespot++;
		}		
		else {
			System.out.println("Full Parking");
		}
	
	}
	
	public void printOutVehicleDetails () {
		
		System.out.println("this vehicles are parked in the garage att the moment");
		for (int i = 0; i < nextFreespot; i++) {
			System.out.println(vehiclesParked[i].getInfo());
		}
		
	}




	public Vehicle findPlate() {
		// TODO Auto-generated method stub
		return null;
	}
		
}