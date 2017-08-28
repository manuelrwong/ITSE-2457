package petstore2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import dog4.Dog;

/**
 * Tests the pet store design. 
 * @author Qi Wang
 * @version 1.0
 */
public class PetStoreUtility {
	/**
	 * Test the pet store design. 
	 */
	public static void start() throws FileNotFoundException{
		PetStore store = new PetStore();
		
		//Create a pet store
		createAPetStore(store);
		//Display the information of the pet store
		displayPetStore(store);
	}
	/**
	 * Creates a pet store.
	 * @param dogs A reference to a pet store
	 */
	private static void createAPetStore(PetStore store) throws FileNotFoundException{
		//Create a list of dogs
		//Create a pet store with the list of dogs
		Scanner input = new Scanner(new File("dognames.txt"));
		
		while(input.hasNext()){
			store.addAPet(new Dog(input.next()));
		}
		
		input.close();
	}
	
	/**
	 * Displays pet store information.
	 * @param dogs A reference to a pet store
	 */
	private static void displayPetStore(PetStore store){
			System.out.println(store);
	}
}
