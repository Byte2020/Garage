import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class RegisteredCarsList {
	static Car[] cars = new Car[200];
	 static int nextVehicule = 0;
	
	public RegisteredCarsList() {
		
	}

	public void add(String name, String plate) {
		cars[nextVehicule]=new Car(name,plate);
		nextVehicule++;
	}


	public static Car findCar(String regPlate) {
		for (int i = 0; i < nextVehicule; i++) {
			if (cars[i].getPlate().equalsIgnoreCase(regPlate))return cars[i] ;
		}
		return null;
	}

	public void reccordRegistredCarsList() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("carRegister.txt");
		for (int i = 0; i < nextVehicule; i++) {
			
			out.println(cars[i].getInfo());
		}
		out.close();
	}





	
	
}
