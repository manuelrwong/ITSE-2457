package petstore;

import java.io.FileNotFoundException;

/**
 * Tests the design of Pet store.
 * @author Qi Wang
 * @version 1.0
 */
public class Driver {
	/**
	 * Creates a pet store, and display its information.
	 * @param args A reference to a string array containing command-line arguments
	 * @throws FileNotFoundException If a file can't be found
	 */
	public static void main(String[] args)throws FileNotFoundException{
		PetStoreUtility.start();
	}
	
}
