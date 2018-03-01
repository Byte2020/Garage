
public class RegisteredCarsList {
	static Car[] cars = new Car[200];
	 static int nextVehicule = 0;
	
	public RegisteredCarsList() {
		loadCarsFromFile();
		
	}

	public void add(String string, String string2) {
		cars[nextVehicule]=new Car("Niklas' Hummer","5");
		nextVehicule++;
	}


	public static Car findCar(String regPlate) {
		for (int i = 0; i < nextVehicule; i++) {
			if (cars[i].getPlate().equalsIgnoreCase(regPlate))return cars[i] ;
		}
		return null;
	}


	public void reccordRegistredCarsList() {
		// TODO Auto-generated method stub
		
	}
	
		private void loadCarsFromFile() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
