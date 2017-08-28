package dogwithexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DogUtility {
	/**
	 * Starts ....
	 */
	public static void start() throws FileNotFoundException{
		Dog[] dogs = new Dog[10];
		
		//Create a list of dogs
		createAList(dogs);
		//Display a list of dogs
		displayAList(dogs);
	}
	/**
	 * Creates a list of dogs.
	 * @param dogs A reference to a list of dogs
	 */
	private static void createAList(Dog[] dogs) throws FileNotFoundException{
		Scanner input = new Scanner(new File("dognames.txt"));
		int i = 0;
		while(input.hasNext()){
			dogs[i] = new Dog(input.next());
			i++;
		}
		input.close();
	}
	
	/**
	 * Displays a list of dogs.
	 * @param dogs A reference to a list of dogs
	 */
	private static void displayAList(Dog[] dogs){
		for(int j = 0; j < dogs.length; j++){
			System.out.println(dogs[j]);
		}
		
	}
}
