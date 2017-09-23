package dog;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DogUtility
{
	public static void start()
	{
//		Yorkshire york1 = new Yorkshire( "Robert" );
//		Dog dog1 = york1;
//		Bulldog bull1 = new Bulldog( "Tom" );
//		
//		System.out.println( york1 );
//		System.out.println( dog1 );
//		
//		dog1 = bull1;
//		
//		System.out.println( dog1 );
//		
//		System.out.println("Testing array");
//		
//		ArrayList<Dog> dogs = new ArrayList<Dog>();
//		
//		dogs.add( york1 );
//		dogs.add( bull1 );
//		
//		for( int i = 0 ; i < dogs.size() ; i++ )
//		{
//			System.out.println( dogs.get(i) );
//		}
		
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		createList(dogs);
		displayList(dogs);
	}
	
	public static void createList(ArrayList<Dog> dogs){
		
		//Open Yorkshire file
		Scanner input = null;
		try {
			input = new Scanner( new File( "Yorkshire.txt" ) );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		//Read Yorkshire file
		while( input.hasNext() )
		{
			String name = input.nextLine();
			dogs.add( new Yorkshire( name ) );
		}
		
		//TODO
		//Open labrador file
		
		//TODO
		//Read Labrador file
	}
	
	public static void displayList(ArrayList<Dog> dogs){
		for( Dog d : dogs )
		{
			System.out.println( d + "\n" );
		}
	}

}
