package die3;

/**
 * Represents one die (singular of dice) with faces showing values
 * between 1 and 6.
 * 
 * @author Qi Wang
 * @version 1.1
 */

public class Die3{
	/**
	 * Maximum face value of this die
	 */
	private final int MAX = 6; 
	
	/**
	 * The face value of this die
	 */
	private int faceValue;
	
	
	/**
	 * Constructs a new die with default face value 1.
	 */
	public Die3()	{
	  this.faceValue = 1;
	}
	
	
	/**
	 *  Changes the face value of this die to be a random value between 1 and 6.
	 *  
	 *  @return An integer specifying the face value of this die
	 */
	public void roll(){
		/*
		 * Note: When a method calls another method in the same class or not, the method relies on the second method.
		 * For example, roll method relies on setFaceValue method. When setFaceValue is modified, roll method has to be 
		 * tested to make sure it is not affected.
		 */
	  this.setFaceValue((int)(Math.random() * MAX) + 1);
	  //this.faceValue = (int)(Math.random() * MAX) + 1;
	
	}
	
	/**
	 *  Changes the face value of this die.
	 *  
	 *  @param faceValue An integer specifying the face value of this die
	 */ 
	public void setFaceValue (int faceValue)	{
		if ( faceValue >= 1 && faceValue <= MAX){
	        this.faceValue = faceValue;
		}
	}
	
	/**
	 *  Returns the face value of this die.
	 *  
	 *  @return An integer specifying the face value of this die
     */
	public int getFaceValue()	{
	  return this.faceValue;
	}
	
	/**
	 *  Returns a string representation of this die.
	 *  
	 *  @return A String representation of this die
	 */
	public String toString(){
	  return getClass().getSimpleName() + "\t" + this.faceValue; 
	  //return "Die: " + this.faceValue;
	}
	
	/**
	 * Indicates if some other object is "equal to" this die. Two dice are equal if their face values
	 * are equal. 
	 * 
	 * @return A boolean value specifying if some other object is "equal to" this die.
	 */
	public boolean equals(Object obj)	{
		if (!(obj instanceof Die3)){
		    return false;
		}
		Die3 other = (Die3)obj;
		return this.faceValue == other.faceValue;
	}
}

