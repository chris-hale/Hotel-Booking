/*
 * 
 * Purpose: This should store the number of beds in a room
 * @author Chris Hale
 * 
 */
import java.util.ArrayList;
import java.util.List;


public class Room {

	//fields
	private int smallBeds;
	private int bigBeds;
	private boolean isVacant;
	private List<Bed> beds = new ArrayList<Bed>();
	
	
	// method that runs through an array of rooms and checks how many single or double beds there are in each room
	public Room(int smallBeds, int bigBeds, boolean isVacant) { 
		
		if(smallBeds == 0 && bigBeds == 0){
			throw new IllegalArgumentException("Room cannot have 0 beds"); // exception that initializes an error check to make sure there is at least one type of bed in each room
		}

		for(int i = 0; i < smallBeds; i ++){
			beds.add(new Bed("small"));
		}
		for(int i = 0; i < bigBeds; i ++){
			beds.add(new Bed("big"));
		}
		
		this.isVacant = isVacant;
		this.smallBeds = smallBeds;
		this.bigBeds = bigBeds;
	}

	
	// get and set methods
	public int getSmallBeds() {
		return smallBeds;
	}

	public int getBigBeds() {
		return bigBeds;
	}
	
	public boolean getVacant() {
		return isVacant;
	}

	public void setVacant(boolean isVacant) {
		this.isVacant =  isVacant;
	}

	public int getNumberOfBeds() {
		return beds.size();
	}
	
	public List<Bed> getBeds(){
		return beds;
	}
	
}