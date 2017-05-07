/*
 * 
 * Purpose: Displays information about a hotel that the user creates by choosing the number of rooms, and the number and size of beds in each room
 * @author Chris Hale
 * 
 */
import java.util.Scanner;

public class HotelConfigure {
	
	// method that provides user interface for the user to set the number of rooms, and size of each bed in each room of the hotel
	public static void Configure(Hotel myHotel){
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Please enter number of rooms");
		int numberOfRooms = sc.nextInt();
		
		for(int i = 0; i < numberOfRooms; i++){
			System.out.println("Please enter number of single beds for room " + (i + 1));
			int numberOfSmall = sc.nextInt();

			
			System.out.println("Please enter number of double beds for room " + (i + 1));
			int numberOfBig = sc.nextInt();
			
			System.out.println("Is this room vacant?");
			String isVacant = sc.next();
			if(!isVacant.equals("yes") && !isVacant.equals("no")){
				throw new IllegalArgumentException(isVacant + " is not a valid vacant value"); // exception check
			}
			
			// runs an if loop to set the vacancy of each room
			if(isVacant.equals("yes")){
				myHotel.addRoom(new Room(numberOfSmall, numberOfBig, true));
				
			}
			else{
				myHotel.addRoom(new Room(numberOfSmall, numberOfBig, false));
				
			}
			
		}
		sc.close();
	}

	public static void main(String[] args) {

		Hotel myHotel = new Hotel("Boomerang");
		Configure(myHotel);
		HotelReport myReport = new HotelReport();
		myReport.report(myHotel);
	}
}
