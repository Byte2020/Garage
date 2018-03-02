import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Garage {

	private static final int maxCapacity = 10;
	private static Vehicle[] array = new Vehicle[maxCapacity];
	private static int nextVehicle;
	private static Vehicle[] moto= new Vehicle[maxCapacity];
	private static int nextMoto;
	

	// takes informatio reccorded in parkedCarList.txt
	public void readFromFile() throws FileNotFoundException {
		File text = new File("parkedCarList.txt");
		Scanner input = new Scanner(text);
		while (input.hasNext()) {
			String plate = input.next();
			String model = input.next();
			String owner = input.next();
			String color = input.next();
			String fuelType = input.next();

			Car carInList = new Car(plate, model, owner, color, fuelType);
			array[nextVehicle] = carInList;
			nextVehicle++;
		}
		input.close();
	}

	public int numberOfAvailableSpots() {
		return maxCapacity - nextVehicle;
	}

	// prints out cars currently parked in the garage
	public void printOutVehicleDetails() {
		System.out.println();
		System.out.println("cars currently parked in this garage");
		for (int i = 0; i < nextVehicle; i++) {
			System.out.println(array[i].getInfo());
		}
		System.out.println();
		System.out.println("and motorbikes");
		for (int i = 0; i < nextMoto; i++) {
			System.out.println(moto[i].getInfo());
		}
		System.out.println();
	}
	//  registers a car that just checked in
	public void addVehicles(Vehicle visitor) {
		switch (visitor.getType()) {
		case CAR:{
			if (numberOfAvailableSpots() > 0) {
			array[nextVehicle] = visitor;
			nextVehicle++;
			}

		else
			System.out.println("Parking Full");
			break;
		}
		case MOTORBIKE:{
			if (nextMoto< maxCapacity) {
			moto[nextMoto] = visitor;
			nextMoto++;
			}
		else
			System.out.println("Parking Full");
			break;
		}
		default:
			break;
		}
	
	}

	
	// unregisters a car that just did check out
	public void removeVehicle(String regPlate) {
		//cars
		for (int i = 0; i < nextVehicle; i++) {
			if (array[i].getPlate().equalsIgnoreCase(regPlate)) {

				for (int j = i; j < nextVehicle - 1; j++) {
					array[j] = array[j + 1];

				}
				--nextVehicle;
			}
		}
		// motorbikes
		for (int i = 0; i < nextMoto; i++) {
			if (moto[i].getPlate().equalsIgnoreCase(regPlate)) {

				for (int j = i; j < nextMoto - 1; j++) {
					moto[j] = moto[j + 1];

				}
				--nextMoto;
			}
		}

	}

	//  records historical of cars in garage for the next time the garage opens
	public void writeCarsInGaragetoList() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("parkedCarList.txt");
		for (int i = 0; i < nextVehicle; i++) {
			out.println(array[i].getInfo());
		}
		out.close();

	}
}