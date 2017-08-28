package doggui.copy;

/**
 * Represents a labrador with a name, an id, a color, and an average breed weight of 75.
 * @author Qi Wang
 * @version 1.0
 */
public class Labrador extends Dog{
	/**
	 * The color of this Labrador.
	 */
	private String color;
	
	/**
	 * The average breed weight of this labrador.
	 */
	private int breedWeight = 75;
	
	/**
	 * Constructs a Labrador with an empty name, an empty color, and a default breed weight.
	 */
	public Labrador(){
		this("", "");
	}
	
	/**
	 * Constructs a Labrador with a name, a color, and a default breed weight.
	 */
	public Labrador(String name,String color){
		super(name);
		this.color = color;
	}
	
	/**
	 * Returns the color of this labrador.
	 * @return The color of this labrador
	 */
	public String getColor(){
		return this.color;
	}
	
	/**
	 * Changes the color of this labrador.
	 * @param color A reference to a labrador color
	 */
	public void setColor(String color){
		this.color = color;
	}
	
	
	
	/**
	 * Returns a sound of this labrador.
	 * @return A string presentation of a labrador sound
	 */
	public String speak(){
		return "Labrador Woof!";
	}
	
	/**
	 * Returns the average breed weight of this labrador.
	 * @return The average breed weight
	 */
	public int getBreedWeight(){
		return this.breedWeight;
	}
	
	/**
	 * Returns a string representation of this dog. The string contains the type of this labrador and the id of this labrador, a color of
	 * this labrador and an average breed weight.
	 * @return A a string representation of this dog
	 */
	public String toString(){
		return super.toString() + "\n" +
				"color: " + this.color + "\n" +
				"breed weight: " + this.breedWeight + "\n";
	}
	
	/**
	 * Indicates if this labrador is "equal to" some other object. This dog is equal to some other object if they are both objects 
	 * of the same type and have the same ids. 
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if this dog is "equal to" some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Labrador)){
			return false;
		}
		
		Labrador other = (Labrador)obj;
		return super.equals(other);
	}
}
