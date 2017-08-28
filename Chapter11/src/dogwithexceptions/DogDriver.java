package dogwithexceptions;

import java.io.FileNotFoundException;

/**
 * Tests the design of Dog.
 * @author Qi Wang
 * @version 1.0
 */
public class DogDriver {
	/**
	 * Creates a list of dogs, and display them.
	 * @param args A reference to a string array containing command-line arguments
	 * @throws FileNotFoundException If a file can't be found
	 */
	public static void main(String[] args)throws FileNotFoundException{
		DogUtility.start();
	}
	
	
}
