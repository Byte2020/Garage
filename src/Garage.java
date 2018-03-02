import java.util.ArrayList;

public class Garage {
	
		private static final int maxCapacity = 10; 
		private static Car [] array = new Car[maxCapacity]; 
		
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
		}

		public void addVehicles(Car visitor) {
			if(numberOfAvailableSpots() > 0) {
				array[nextVehicle] = visitor; 
				nextVehicle++;
			}	
			
			else 
				System.out.println("Parking Full");
		
		}
		
		
		public void removeVehicle (Car visitor) {
			
			for (int i = 0; i < nextVehicle; i++) {
				if (array[i] == visitor) {
					for (int j = i; j < nextVehicle; i--)
						array[j] = array[j+1]; 
				}
			}
			
			}	
		
		public Vehicle findPlate() {
			return null;
		}		
}