

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import probatzeko.Car;
import probatzeko.Garage;

public class Console {

		
		 
		
		
		
	public static void main(String[] args) {
				//  initialice();				get garages list and vehicules registered from file , probably  from a main menu that later starts the console
				//  we create garages and a few vehicules here for the moment
		

		Garage garage=new Garage( "söder",20);
		
		Car[] cars = new Car[200];
		int nextVehicule = 0;
		cars[nextVehicule]=new Car("Peios Ferrari","1");
		nextVehicule++;
		cars[nextVehicule]=new Car("Miguels Masseratti","2");
		nextVehicule++;
		cars[nextVehicule]=new Car("Rogers Skoda","3");
		nextVehicule++;
		cars[nextVehicule]=new Car("Linus' Volvo","4");
		nextVehicule++;
		cars[nextVehicule]=new Car("Niklas' Hummer","5");
		nextVehicule++;
		
		boolean oppen=true;
		
		while (oppen)
		{
			//  The mane menu asks you want to do and gives 5 choices gets a number the choice as a number(num) to execute the correspondent code
		// 1 Check in, to register a vehicule comming to a garage
		// 2 Check ou, when a registered vehicule checcks out från the garage it is registered
		// 3 Register a new vehicule as a potencial customer
		// 4 Get the vehicules parked historik for a garage
		// 5 Quits console
		
			Object[] options = {  "Check in", "Check out", "register new vehicule", "print garage historic","quit" };  //
			JOptionPane frame = new JOptionPane("GARAGE 1.0");

			int num = JOptionPane.showOptionDialog(frame, "What do you want?", "GARAGE 1.0", JOptionPane.YES_NO_OPTION,
				JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		
			switch (num+1) {
			case 1:{		// check in submenu
				String regPlate= JOptionPane.showInputDialog("what does the cars regiter plate say?");
				for (int i = 0; i < nextVehicule; i++) {
					if (cars[i].getPlate().equalsIgnoreCase(regPlate))garage.checkIn(cars[i]) ;
				}
				break;
			}
			case 2:{		// check out submenu
				String regPlate= JOptionPane.showInputDialog("what does the cars regiter plate say?");
				garage.checkOut(regPlate);
				break;
			}
			case 3:{		// register new vehicule submenu
				String name= JOptionPane.showInputDialog("what is this new vehicule's name?");
				String regPlate= JOptionPane.showInputDialog("hitch is it's regiter plate?");
				cars[nextVehicule]= new Car(name,regPlate);
				nextVehicule++;
				break;
			}
			case 4:{		// print lists submenu
				garage.printVehiculesInGarage();
				break;
			}
			case 5:{			//quit and reccord
				oppen= false;
				garage.reccordGarageStatus();
				break;
			}	
			default:
				break;
			}
		}
		
	}



		
	

}
