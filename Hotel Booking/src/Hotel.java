/*
 * 
 * Purpose: This should store all the essential information about a hotel, including a name and some rooms.
 * @author Chris Hale
 * 
 */
import java.util.List;
import java.util.ArrayList;


public class Hotel {

	//fields
	private String name;
	private List<Room> rooms = new ArrayList<Room>();
	
	// method that adds all small and big beds together to calculate the maximum occupancy
	private int MaximumOccupancy(){
		
		int occupancy = 0;
		
		for(int i = 0; i < rooms.size(); i++){
			occupancy = occupancy + rooms.get(i).getSmallBeds();
			occupancy = occupancy + rooms.get(i).getBigBeds() * 2;
		}
		
		return occupancy;
	}
	
	// method that adds rooms to a hotel
	public void addRoom(Room room){
		rooms.add(room);
	}
	
	// method that runs through room to see if there are vacancies
	public boolean hasVacancies(){
		
		boolean hasVacancies = false;
		for(int i = 0; i < rooms.size(); i++){
			if(rooms.get(i).getVacant()){
				return true;
			}
			else{
				hasVacancies = false;
			}
		}
		return hasVacancies;
	}
	
	// get and set methods for names, rooms and occupancy
	public Hotel(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public List<Room> getRooms() {
		return rooms;
	}
	
	
	public int getNumberOfRooms() {
		return rooms.size();
	}
	
	
	public int getMaximumOccupancy() {
		return MaximumOccupancy();
	}
		
}