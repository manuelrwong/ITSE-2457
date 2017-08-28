package twodimensionalarray;

/**
 * Demonstration of data structure 2D Array.
 * @author Qi Wang
 * @version 1.0
 */
public class TwoDimensionalArrayOfIntegers {

	/**
	 * Stores a list of integers into a 2D array, and displays them.
	 * @param args A reference to a string array containing command-line arguments.
	 */
	public static void main(String[] args) {
		int[][] numbers = new int[2][3];
		
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col <numbers[0].length ; col++){
				numbers[row][col] = row + col;
			}
		}
		
		for(int row = 0; row < numbers.length; row++){
			for(int col = 0; col <numbers[0].length ; col++){
				System.out.print(numbers[row][col] + " ");
			}
			System.out.println();
		}

	}

}
