package dogwithexceptionspropagation;

/**
 * Reprepents an exception object that is thrown when the name of this dog contains
 * more than 10 characters. 
 * @author Qi Wang
 * @version 1.0
 */
public class DogNameTooLongException extends RuntimeException{
	/**
	 * Constructs an exception object with a specific message.
	 * @param message A reference to a specific message
	 */
	public DogNameTooLongException(String message){
		super(message);
	}
}
