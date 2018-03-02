import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import utilities.VehicleType;


//			our system has a list of cars registered in our system so customers don't have to register everytime they want to check in
//			the list gets written in the file "carRegister.txt" when we quit the system


public class RegisteredVehiculesList {
	static Vehicle[] vehicles =new Vehicle[200];
	 static int nextVehicule = 0;
	
	 

		// add a new potencial customer
	public void add() {
		Object[] options = {  "Car", "Bus", "Airplane ", "Motorbike" };  //
		JOptionPane frame = new JOptionPane("GARAGE 1.0");
		int num = JOptionPane.showOptionDialog(frame, "What kind of vehicle do you own?", "GARAGE 1.0", JOptionPane.YES_NO_OPTION,
			JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		switch (num) {
		case 0:{
			vehicles[nextVehicule]=new Car();
			break;
		}
		case 1:{
			vehicles[nextVehicule]=new Bus();
			break;
		}
		case 2:{
			vehicles[nextVehicule]=new Airplane();
			break;
		}
		case 3:{
			vehicles[nextVehicule]=new Motorbike();
			break;
		}
		default:
			break;
		}
		
		
		nextVehicule++;
	}

	// findCar
	public static Vehicle findCar(String regPlate) {
		for (int i = 0; i < nextVehicule; i++) {
			if (vehicles[i].getPlate().equalsIgnoreCase(regPlate))return vehicles[i] ;
		}
		return null;
	}

	
	// write list to file,  just cars but we could make other files if our garage accepted other vehicles
	
	public void reccordRegistredCarsList() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("carRegister.txt");
		for (int i = 0; i < nextVehicule; i++) {
			if (vehicles[i].getType()==VehicleType.CAR) {
			out.println(vehicles[i].getInfo());
			}
		}
		out.close();
	}

	// add car to list,  used to add old customers registered in a file
	
	
	public void addFromList(Car carInList) {
		vehicles[nextVehicule]=carInList;
		nextVehicule++;
	}





	
	
}
