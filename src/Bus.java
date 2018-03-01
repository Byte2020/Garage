import java.util.Scanner;

import utilities.FuelType;
import utilities.VehicleType;

public class Bus extends Vehicle {
	
	private String length; 
	
	public Bus () {
		super();  
		
		Scanner input = new Scanner(System.in);   
		
		System.out.println("Length of the Bus?");
		String length = input.next(); 
		
		input.close();
		
	}
	
	@Override
	public VehicleType getType() {
		return VehicleType.BUS; 
		
	}
	
	@Override
	public String getInfo() {
		return plate+"\t" +model+ "\t" +owner+ "\t" +length+ "\t" +fuelType;
	}
}
