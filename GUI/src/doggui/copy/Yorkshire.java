package doggui.copy;

/**
 * Represents a yorkshire with a name, an id, and an average breed weight of 6.
 * @author Qi Wang
 * @version 1.0
 */
public class Yorkshire extends Dog{	
	/**
	 * The average breed weight of this yorkshire.
	 */
	private int breedWeight = 75;
	
	/**
	 * Constructs a yorkshire with an empty name and a default breed weight.
	 */
	public Yorkshire(){
		this("");
	}
	
	/**
	 * Constructs a dog with a name and a default breed weight.
	 */
	public Yorkshire(String name){
		super(name);
	}
	
	
	/**
	 * Returns a sound of this yorkshire.
	 * @return A string presentation of a yorkshire sound
	 */
	public String speak(){
		return "Yorkshire Woof!";
	}
	
	/**
	 * Returns the average breed weight of this yorkshire.
	 * @return The average breed weight
	 */
	public int getBreedWeight(){
		return this.breedWeight;
	}
	
	/**
	 * Returns a string representation of this yorkshire. The string contains the type of this yorkshire and the id of this yorkshire, and
	 * an average breed weight..
	 * @return A a string representation of this yorkshire
	 */
	public String toString(){
		return super.toString() + "\n" +
				"breed weight: " + this.breedWeight + "\n";
	}
	
	/**
	 * Indicates if this yorkshire is "equal to" some other object. This dog is equal to some other object if they are both objects 
	 * of the same type and have the same ids. 
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if this dog is "equal to" some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Yorkshire)){
			return false;
		}
		
		Yorkshire other = (Yorkshire)obj;
		return super.equals(other);
	}
}
