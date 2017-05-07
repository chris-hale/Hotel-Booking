/*
 * 
 * Purpose: This should produce a textual report describing the name of the hotel, number of rooms and size of the beds in each room
 * @author Chris Hale
 * 
 */
import java.util.List;


public class HotelReport {

	// method that produces a textual report on a hotel
	public void report(Hotel hotel){
		
		List<Room> rooms = hotel.getRooms();
		
		// prints the name of the hotel and total number of rooms in the hotel
		System.out.println("Hotel Name:\t" + hotel.getName());
		System.out.println("Number of Rooms:\t" + hotel.getNumberOfRooms() + "\n");
		
		// checks to see if any of the rooms in the hotel are vacant
		if(hotel.hasVacancies()){
			System.out.println("Has Vacancies:\tYes\n");
		}
		else{
			System.out.println("Has Vacancies:\tNo\n");
		}
		
		// for loop that prints out the size of each bed in every room 
		for(int i = 0; i < rooms.size(); i++){
			System.out.println("Room " + (i + 1) + "\n");
			System.out.println("\tNumber of Beds:\t" + rooms.get(i).getNumberOfBeds());
			
			Room currentRoom = rooms.get(i);
			List<Bed> beds = currentRoom.getBeds();
			
			// second for loop that gets the size of each bed in each room of the hotel
			int smallBeds = 0;
			int bigBeds = 0;
			
			for(int x = 0; x < beds.size(); x++){
				Bed currentBed = beds.get(x);
				
				if(currentBed.getSize().equals("small")){
					smallBeds++;
				}
				
				if(currentBed.getSize().equals("big")){
					bigBeds++;
				}
			}
			// prints out the number of single and double beds in every room
			System.out.println("\tNumber of Single Beds:\t" + smallBeds);
			System.out.println("\tNumber of Double Beds:\t" + bigBeds);
			
			// checks each room and print whether the room is vacant or not
			if(currentRoom.getVacant()){
				System.out.println("\tIs the room Vacant:\tYes");
			}
			else{
				System.out.println("\tIs the room Vacant:\tNo");
			}
			
		}
	}
	
	// creates a new hotel object that stores rooms, the size of the beds inside each room and its vacancy
	public static void main(String[] args) {
		
		Hotel myHotel = new Hotel("Waikiki");
		
		Room myRoom1 = new Room(0, 1, false);
		myHotel.addRoom(myRoom1);
		
		Room myRoom2 = new Room(1, 1, false);
		myHotel.addRoom(myRoom2);
		
		Room myRoom3 = new Room(1, 2, false);
		myHotel.addRoom(myRoom3);
		
		Room myRoom4 = new Room(2, 2, true);
		myHotel.addRoom(myRoom4);
		
		Room myRoom5 = new Room(2, 10,false);
		myHotel.addRoom(myRoom5);
		
		HotelReport myReport = new HotelReport();
		myReport.report(myHotel);
		
	}
}
