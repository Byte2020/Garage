import java.util.ArrayList;

public class Garage {

	private static final int maxCapacity = 10;
	
	private ArrayList<Vehicle> vehicleGarageArray;
	
	// Constructor
	public Garage()
	{
		//This check Max capacity
		this.vehicleGarageArray = new ArrayList<Vehicle>(maxCapacity);
	}
	

	//Method to find parking spot available in the Garage	
	public int NumberOfAvailableSpots(){
		return maxCapacity - vehicleGarageArray.size(); 
	}
	
	public void addVehicles(Vehicle vehicle) {
		
		if (this.NumberOfAvailableSpots() > 0) {
			this.vehicleGarageArray(vehicle);
			
			
			System.out.println(+NumberOfAvailableSpots()+ "Available Spots" );
		}
		
		else {
			System.out.println("Full Parking");
		}
	
	}
	
	public void printOutVehicleDetails () {
		
		// TODO Do something here
		
	}

	private void vehicleGarageArray(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}
		
}