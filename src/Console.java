import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Console {

	public static void main(String[] args) throws FileNotFoundException {

		garageHandler garageHandler = new garageHandler();
		RegisteredVehiculesList vehicules = new RegisteredVehiculesList();

		vehicules = loadVehiclesFromFile(vehicules);

		boolean oppen = true; // the garage is open
		while (oppen) {
			// The mane menu asks you want to do and gives 5 choices gets a number the
			// choice as a number(num) to execute the correspondent code
			// 1 Check in, to register a vehicule comming to a garage
			// 2 Check ou, when a registered vehicule checcks out från the garage it is
			// registered
			// 3 Register a new vehicule as a potencial customer
			// 4 Get the vehicules parked historik for a garage
			// 5 Quits console

			Object[] options = { "Check in", "Check out", "register new vehicule", "print garage historic", "quit" }; //
			JOptionPane frame = new JOptionPane("GARAGE 1.0");

			int num = JOptionPane.showOptionDialog(frame, "What do you want?", "GARAGE 1.0", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

			switch (num + 1) {
			case 1: { // check in submenu
				String regPlate = JOptionPane.showInputDialog("what does the cars regiter plate say?");
				Vehicle visitor = RegisteredVehiculesList.findCar(regPlate);
				if (visitor == null) {
					System.out.println("You haven't registered yet");
				} else {
					garageHandler.checkIn(visitor);
				}
				break;
			}
			case 2: { // check out submenu
				String regPlate = JOptionPane.showInputDialog("what does the cars regiter plate say?");
				garageHandler.checkOut(regPlate);
				break;
			}
			case 3: { // register new vehicule submenu

				vehicules.add();
				break;
			}
			case 4: { // print lists submenu
				garageHandler.listParkedVehicles();
				break;
			}
			case 5: { // quit and reccord
				oppen = false;
				garageHandler.registerParkedVehicles();
				vehicules.reccordRegistredCarsList();
				break;
			}
			default:
				break;
			}
		}

	}

	// take registered cars from "carRegister.txt" and add to the vehicules list,
	// just cars
	private static RegisteredVehiculesList loadVehiclesFromFile(RegisteredVehiculesList vehicles)
			throws FileNotFoundException {
		File text = new File("carRegister.txt");
		Scanner input = new Scanner(text);

		while (input.hasNext()) {
			String plate = input.next();
			String model = input.next();
			String owner = input.next();
			String color = input.next();
			String fuelType = input.next();

			Car carInList = new Car(plate, model, owner, color, fuelType);
			vehicles.addFromList(carInList);
			System.out.println(plate + " " + model + " " + owner + " " + fuelType + " " + color);
		}
		input.close();
		return (vehicles);
	}

}