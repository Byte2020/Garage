import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import utilities.VehicleType;

public class Garage {
	
		private static final int maxCapacity = 10; 
		private static Vehicle [] array = new Vehicle[maxCapacity]; 
		
		private static int nextVehicle; 
		

		
		public void readFromFile() throws FileNotFoundException {
			File text = new File("parkedCarList.txt");
			Scanner input = new Scanner(text);
			

			while (input.hasNext()) {
				String plate = input.next();
				String model = input.next();
				String owner = input.next();
				String color = input.next();			
				String fuelType = input.next();
				
				Car carInList =new Car(plate,model,owner,color,fuelType);
				array[nextVehicle]=carInList;
				nextVehicle++;								
				
				
			}
			input.close();
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
					
					for (int j = i; j < nextVehicle-1; j++) {
						array[j] = array[j+1];	
						
					}
					--nextVehicle;
				}
			}
			
		}	
		
		public Vehicle findPlate() {
			return null;
		}

		public void writeCarsInGaragetoList() throws FileNotFoundException {
			PrintWriter out = new PrintWriter("parkedCarList.txt");
			for (int i = 0; i < nextVehicle; i++) {
				out.println(array[i].getInfo());
			}
			out.close();
			
			
		}		
}