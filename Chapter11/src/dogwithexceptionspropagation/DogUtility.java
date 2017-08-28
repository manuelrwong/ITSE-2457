package dogwithexceptionspropagation;

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
		//Handle DogNameTooLongException here.
		Scanner input = new Scanner(new File("dognames.txt"));
		int i = 0;
		try{
			while(input.hasNext()){
				dogs[i] = new Dog(input.next());
				i++;
			}
		}catch(DogNameTooLongException ex){
			ex.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			input.close();
		}
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
