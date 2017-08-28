package doggui.copy;

import javax.swing.JFrame;
/**
 * Creates an instance of graphical user interface for dog creation. 
 * @author Qi Wang
 * @version 1.0
 */
public class DogDriver {
	/**
	 * Creates and displays a dog creation user interface.
	 * @param args A reference to a string array containing command-line arguments
	 */
	public static void main(String[] args){
		JFrame frame = new DogFrame("Dog Creator");
	}
}
