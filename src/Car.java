import java.util.Scanner;
import utilities.FuelType;
import utilities.VehicleType;

public class Car extends Vehicle {
	
	private String color; 
	
	//Constructor 
	public Car () {
		super();  
		
		this.color = color;
		
		Scanner input = new Scanner(System.in);   
		
		System.out.println("Color of the car?");
		String color = input.next();
		
		input.close();
	}
	
	@Override
	public VehicleType getType() {
		return VehicleType.CAR; 
		
	}
		
	
	@Override
	public String getInfo() {
		return plate+"\t" +model+ "\t" +owner+ "\t" +color+ "\t" +fuelType;
	}

}