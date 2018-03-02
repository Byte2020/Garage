import java.util.ArrayList;

public class Garage {
	
		private static final int maxCapacity = 10; 
		private static Vehicle [] array = new Vehicle[maxCapacity]; 
		
		private static int nextVehicle; 
		
		//Constructor 
		public Garage() {
			
		}
		
		public static int getMaxCapacity ()  {
			return maxCapacity; 
		}
	
		public int numberOfAvailableSpots() {
				return maxCapacity - nextVehicle;     							
			}
		
		public void printOutVehicleDetails() {	
			for (int i = 0; i < nextVehicle; i++) {
				System.out.println(array[i].getInfo());
			}
		}

		public void addVehicles(Vehicle visitor) {
			if(numberOfAvailableSpots() > 0) {
				array[nextVehicle] = visitor; 
				nextVehicle++;
			}	
			
			else 
				System.out.println("Parking Full");
		
		}
		
		
		public void removeVehicle (String regPlate) {
			
			for (int i = 0; i < nextVehicle; i++) {
				if (array[i].getPlate().equalsIgnoreCase(regPlate)) {
					for (int j = i; j < nextVehicle; i++) {
						array[j] = array[j+1];	
						nextVehicle--;
					}
					
				}
			}
			
		}	
		
		public Vehicle findPlate() {
			return null;
		}		
}