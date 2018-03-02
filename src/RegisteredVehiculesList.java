import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

import utilities.VehicleType;


public class RegisteredVehiculesList {
	static Vehicle[] vehicles =new Vehicle[200];
	 static int nextVehicule = 0;
	
	public RegisteredVehiculesList() {
		
	}

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


	public static Vehicle findCar(String regPlate) {
		for (int i = 0; i < nextVehicule; i++) {
			if (vehicles[i].getPlate().equalsIgnoreCase(regPlate))return vehicles[i] ;
		}
		return null;
	}

	public void reccordRegistredCarsList() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("carRegister.txt");
		for (int i = 0; i < nextVehicule; i++) {
			if (vehicles[i].getType()==VehicleType.CAR) {
			out.println(vehicles[i].getInfo());
			}
		}
		out.close();
	}

	public void addFromList(Car carInList) {
		vehicles[nextVehicule]=carInList;
		nextVehicule++;
	}





	
	
}
