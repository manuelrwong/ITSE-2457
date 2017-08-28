package dog4;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

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
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		
		// create a list of dogs
		createAList(dogs);
		
		// sort list of dogs
		Collections.sort(dogs);
		
		// display a list of dogs
		displayAList(dogs);
	}
	
	/**
	 * Creates a list of dogs.
	 * @param dogs A reference to a list of dogs
	 */
	public static void createAList(ArrayList<Dog> dogs) throws FileNotFoundException{
		Scanner input = new Scanner(new File("dognames.txt"));
	
		while(input.hasNext()){
			dogs.add(new Dog(input.next()));
	     }
		input.close();
	}
	
	/**
	 * Displays a list of dogs.
	 * @param dogs A reference to a list of dogs
	 */
	public static void displayAList(ArrayList<Dog> dogs){
		for(int j = 0; j < dogs.size() && dogs.get(j) != null; j++){
			System.out.println(dogs.get(j));
		}
	}
}

