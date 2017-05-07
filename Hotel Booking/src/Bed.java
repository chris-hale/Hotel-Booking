/*
 * 
 * Purpose: This should store the size of a bed (i.e. single or double)
 * @author Chris Hale
 * 
 */

public class Bed {
	
	//fields
	private String size;

	
	// method that sets the bed size after it checks the size of the bed is valid
	public Bed(String size){
		
		if(!size.equals("small") && !size.equals("big")){
			throw new IllegalArgumentException(size + " is not a valid bed size. Size must be \"small\" or \"big\""); // exception to check string denotes a valid size
		}
		this.size = size;
	
	}
	
	// get and set methods
	public void setBed(String size) {
		this.size = size;
	}


	public String getSize() {
		return size;
	}
}
