public class MyGarage {

	private static final int maxCapacity = 300;
	private ArrayList<Vehicles> CarParkingArray;

	// constructor
	public abstract MyGarage();

	{

		this.CarParkingArray = new ArrayList<Vehicles>(maxCapacity);
	}

	public static int getMaxCapacity() {
		return maxCapacity;
	}

}