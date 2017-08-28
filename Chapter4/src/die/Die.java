package die;

/**
 * Represents one die (singular of dice) with faces showing values
 * between 1 and 6.
 * 
 * @author Qi Wang
 * @version 1.1
 */

public class Die{
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
	public Die()	{
	  this.faceValue = 1;
	}
	
	
	/**
	 *  Changes the face value of this die to be a random value between 1 and 6.
	 */
	public void roll()	{
	  this.faceValue = (int)(Math.random() * MAX) + 1;
	
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
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if some other object is "equal to" this die.
	 */
	public boolean equals(Object obj)	{
		if (!(obj instanceof Die)){
		    return false;
		}
		Die other = (Die)obj;
		return this.faceValue == other.faceValue;
	}
}

