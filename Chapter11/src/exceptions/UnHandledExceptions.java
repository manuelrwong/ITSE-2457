package exceptions;

/**
 * Demonstrates uncaught exceptions.
 * @author Qi Wang
 * @version 1.1
 */
import java.util.Scanner;

public class UnHandledExceptions {

	/**
	 * Demonstrates uncaught exceptions.
	 * @param args A string array that can hold command-line parameters
	 */
	public static void main (String[] args)	{
		Scanner input = new Scanner(System.in);
		int numerator = 10;
		int denominator = 0;
		char firstInitial = ' ';
		String firstName = "";
		
		//Division by zero exception
		//java.lang.ArithmeticException: / by zero
		System.out.println (numerator / denominator);
		System.out.println ("This text will not be printed.");
		
		System.out.println("Enter your first name");
	    //NoSuchElementException - if no line was found
	    //IllegalStateException - if this scanner is closed
		firstName = input.nextLine();
		//IndexOutOfBoundsException - if the index argument is negative or 
		// not less than the length of this string.
		firstInitial = firstName.charAt(10);
		System.out.println(firstInitial);
		input.close();
		
	}
}

