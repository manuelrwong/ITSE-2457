package die2;

/**
 * Represents one die (singular of dice) with faces showing values
 * between 1 and 6.
 * 
 * @author Qi Wang
 * @version 1.1
 */

public class Die2{
	/**
	 * Maximum face value of this die
	 */
	private final int MAX = 6; 
	
	/**
	 * The face value of this die
	 */
	private int faceValue;  
	
	
	/**
	 * DONT turn a local variable into an instance variable.
	 * A die is created with a face value, not also a result value.
	 */
	private String result;
	
	/**
	 * Constructs a new die with default face value 1.
	 */
	public Die2(){
	  this.faceValue = 1;
	}
		
	/**
	 *  Changes the face value of this die to be a random value between 1 and 6.
	 *  
	 *  @return An integer specifying the face value of this die
	 */
	public void roll(){
	  this.faceValue = (int)(Math.random() * MAX) + 1;
	}
	
	/**
	 *  Changes the face value of this die.
	 *  
	 *  @param faceValue An integer specifying the face value of this die
	 */ 
	public void setFaceValue (int faceValue){
		if ( faceValue >= 1 && faceValue <= MAX)
	        this.faceValue = faceValue;
	}
	
	/**
	 *  Returns the face value of this die.
	 *  
	 *  @return An integer specifying the face value of this die
     */
	public int getFaceValue(){
	  return this.faceValue;
	}
	
	/**
	 *  Returns a string representation of this die.
	 *  
	 *  @return A String representation of this die
	 */
	public String toString(){
		/* 
		 * Note: if a value is made to be returned from this method, there is no need to store it in a local variable. 
		 * The value should be included in a return statement, and returned directly. Readability must be ensure as well.
		 */
		result = "";
		result = getClass().getSimpleName() + "\t" + this.faceValue; 
		return result;
		
		//return getClass().getSimpleName() + "\t" + this.faceValue; 
	}
	
	/**
	 * Indicates if some other object is "equal to" this die. Two dice are equal if their face values
	 * are equal. 
	 * 
	 * @return A boolean value specifying if some other object is "equal to" this die.
	 */
	public boolean equals(Object obj){
		if (!(obj instanceof Die2)){
		    return false;
		}
		Die2 other = (Die2)obj;
		return this.faceValue == other.faceValue;
	}
}

