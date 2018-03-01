import java.util.Scanner;

import utilities.FuelType;

public class Motorbike extends Vehicle {

	private String plate;  
	private String model; 
	private String owner;
	private String NumberOfSeats;
	private FuelType type;
			
	//Constructor 
	public Motorbike (String plate, String model, String owner, String NumberOfSeats, FuelType type) {
					
				this.plate = plate; 	 
				this.model = model; 
				this.owner = owner;
				this.NumberOfSeats = NumberOfSeats;
				this.type = type;  
		}	

	public String getPlate() {
		return plate; 	
	}
	
	public String getmodel() {
		return model;  	
	}
	
	public String getOwner() {
		return owner; 	
	}
	
	public String getNumberOfSeats() {
		return NumberOfSeats; 	
	}
	
	public FuelType getFuelType() {
		return type; 
	}
	
	public void printOutDetails() {
		super.printDetails(); 
		
		Scanner input = new Scanner(System.in);   
		
		System.out.println("Please enter the registration plate?");
		String plate = input.next();
		
		System.out.println("Model of the vehicle?");
		String model = input.next();
		
		System.out.println("Owner's Name?");
		String owner = input.next();
		
		System.out.println("How many Seats?");
		String NumberOfSeats = input.next();
		
		System.out.println("Fuel Type?");
		String FuelType = input.next(); 
	
	}
	
}