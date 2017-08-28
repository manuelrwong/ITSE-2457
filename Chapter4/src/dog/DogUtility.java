package dog;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Test program of dog design. 
 * @author Qi Wang
 * @version 1.0
 */
public class DogUtility {

	/**
	 * Starts the dog application.
	 */
	public static void start() throws FileNotFoundException{
		
		Dog[] dogs = new Dog[10];
		
		// create a list of dogs
		createAList(dogs);
		
		
		// display a list of dogs
		displayAList(dogs);
	}
	
	/**
	 * Creates a list of dogs.
	 * @param dogs A reference to a list of dogs
	 */
	public static void createAList(Dog[] dogs) throws FileNotFoundException{
		Scanner input = new Scanner(new File("dognames.txt"));
		int i = 0;
		while(i < dogs.length && input.hasNext()){
			dogs[i] = new Dog(input.next());
			i++;
	     }
		input.close();
	}
	
	/**
	 * Displays a list of dogs.
	 * @param dogs A reference to a list of dogs
	 */
	public static void displayAList(Dog[] dogs){
		for(int j = 0; j < dogs.length && dogs[j] != null; j++){
			System.out.println(dogs[j]);
		}
	}
}
