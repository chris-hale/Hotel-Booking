/*
 * 
 * Purpose: To create a new hotel object and work out its maximum occupancy
 * @author Chris Hale
 * 
 */
public class HotelTest {

	// new hotel object
	public static void main(String[] args) {
		Hotel myHotel = new Hotel("President");
		
		Room myRoom1 = new Room(0, 1, true);
		myHotel.addRoom(myRoom1);
		
		Room myRoom2 = new Room(1, 1, true);
		myHotel.addRoom(myRoom2);
		
		Room myRoom3 = new Room(1, 2, false);
		myHotel.addRoom(myRoom3);
		
		Room myRoom4 = new Room(2, 2, false);
		myHotel.addRoom(myRoom4);
		
		Room myRoom5 = new Room(2, 2, false);
		myHotel.addRoom(myRoom5);
	
		
		// gets the getMaximumOccupancy method that works out what the maximum number of guests that can stay is
		int occupancy = myHotel.getMaximumOccupancy();
		System.out.println("Maximum Occupancy:\t" + occupancy + " guests");
	}
}
