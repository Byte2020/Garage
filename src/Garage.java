import java.util.ArrayList;

import sun.util.resources.cldr.pa.CalendarData_pa_Arab_PK;

public class Garage {
	
		private static final int maxCapacity = 10; 
		private static Car [] array = new Car[maxCapacity]; 
		
		private static int nextVehicle; 
		
		private ArrayList <Vehicle> carParkArray; // Every new registration will of type Vehicle
		
		
		//Constructor 
		public Garage() {
			
		}
		
		public static int getMaxCapacity ()  {
			return maxCapacity; 
		}
	
			public int numberOfAvailableSpots() {
				return maxCapacity - nextVehicle;     
						
						
			}
			
			
//			public boolean isParkingEmpty() {
//				boolean isEmpty = true;
//				int i = 0;
//				int placesOfParking = parking.length;
//				while (isEmpty && i < placesOfParking) {
//					isEmpty = (parking[i] == null);
//					i++;
//				}
//				return isEmpty;
//			}
//
//			public boolean isParkingFull() {
//				boolean isFull = true;
//				int i = 0;
//				int placesOfParking = parking.length;
//				while (isFull && i < placesOfParking) {
//					isFull = !isSlotEmpty(i);
//					i++;
//				}
//				return isFull;
//			}	
			
			
			
			
		}

		public void addVehicles(Vehicle visitor) {
			// TODO Auto-generated method stub
			
		}

		public Vehicle findPlate() {
			// TODO Auto-generated method stub
			return null;
		}

		public void printOutVehicleDetails() {
			// TODO Auto-generated method stub
			
		}
		
}
