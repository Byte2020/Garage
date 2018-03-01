import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Console {

	public static void main(String[] args) throws FileNotFoundException {
		// initialice(); get garages list and vehicules registered from file , probably
		// from a main menu that later starts the console
		// we create garages and a few vehicules here for the moment

		Garage garage = new Garage();

		RegisteredCarsList cars = new RegisteredCarsList();
		cars = loadCarsFromFile(cars);

		boolean oppen = true;

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
				Car visitor = RegisteredCarsList.findCar(regPlate);

				break;
			}
			case 2: { // check out submenu
				String regPlate = JOptionPane.showInputDialog("what does the cars regiter plate say?");
				garage.checkOut(regPlate);
				break;
			}
			case 3: { // register new vehicule submenu
				String name = JOptionPane.showInputDialog("what is this new vehicule's name?");
				String regPlate = JOptionPane.showInputDialog("Whitch is it's regiter plate?");
				cars.add(name, regPlate);
				break;
			}
			case 4: { // print lists submenu
				garage.printVehiculesInGarage();
				break;
			}
			case 5: { // quit and reccord
				oppen = false;
				garage.reccordGarageStatus();
				cars.reccordRegistredCarsList();
				break;
			}
			default:
				break;
			}
		}

	}

	private static RegisteredCarsList loadCarsFromFile(RegisteredCarsList cars) throws FileNotFoundException {
		File text = new File("carRegister.txt");
		Scanner input = new Scanner(text);

		while (input.hasNext()) {
			String plate = input.next();
			if (input.hasNext()) {
				String name = input.nextLine();
				cars.add(name, plate);
			}
		}

		input.close();
		return (cars);
	}

}
