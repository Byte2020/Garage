//Super class
public class Vehicle {
	
	private String plate;  
	private String model; 
	private String owner;
	private boolean fuelType;
	
	private String color;
	private int numOfWheels; 
	private String transmission;
	private int NumberOfSeats; 
	 
		
	//Default Constructor to print out the Vehicles details
	public Vehicle() {
	}
	
	
	
	//Print out method 
	public void printDetails() {
		System.out.println("The registration plate of this vehicles is" +this.plate);
		System.out.println("The model of this vehicle is" +this.model);
		System.out.println("The owner is" +this.owner);
		System.out.println("The color of this vehicle is" +this.color);
		System.out.println("This vehicles has" +this.NumberOfSeats+ "number of seats");
		
		
	} 	

}