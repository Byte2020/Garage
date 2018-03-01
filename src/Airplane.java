import java.util.Scanner;

import utilities.FuelType;
import utilities.VehicleType;

public class Airplane extends Vehicle {
	
		private String NumberOfSeats;
	
	public Airplane () {
		super(); 
	
		this.NumberOfSeats = NumberOfSeats;
		Scanner input = new Scanner(System.in);   
		
		System.out.println("Number of Seats?");
		String NumberOfSeats = input.next();
		
		input.close();
		
}
	@Override
	public VehicleType getType() {
		return VehicleType.AIRPLANE; 
		
	}
	
	@Override
	public String getInfo() {
		return plate+"\t" +model+ "\t" +owner+ "\t" +NumberOfSeats+ "\t" +fuelType;
	}
	
}