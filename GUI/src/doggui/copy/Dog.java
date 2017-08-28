package doggui.copy;

/**
 * Represents a generic dog with a name and an id.
 * @author Qi Wang
 * @version 1.0
 */
public abstract class Dog {
	/**
	 * The name of this dog.
	 */
	private String name;
	/**
	 * The id of this dog
	 */
	private int id;
	/**
	 * The next id 
	 */
	private static int nextID = 1;
	
	/**
	 * Constructs a dog with an empty name.
	 */
	protected Dog(){
		this("");
	}
	
	/**
	 * Constructs a dog with a name.
	 */
	protected Dog(String name){
		this.name = name;
		this.id = nextID;
		nextID++;
	}
	
	/**
	 * Returns the name of this dog.
	 * @return The name of this dog
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Changes the name of this dog.
	 * @param name A reference to a dog name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Returns the id of this dog.
	 * @return The id of this dog
	 */
	public int getID(){
		return this.id;
	}
	
	
	/**
	 * Returns the next id.
	 * @return The next id
	 */
	public static int getNextID(){
		return nextID;
	}
	
	/**
	 * Returns a sound of this dog.
	 * @return A string presentation of a dog sound
	 */
	public String speak(){
		return "Woof!";
	}
	
	/**
	 * Returns the average breed weight of this dog.
	 * @return The average breed weight
	 */
	public abstract int getBreedWeight();
	
	/**
	 * Returns a string representation of this dog. The string contains the type of this dog and the id of this dog.
	 * @return A a string representation of this dog
	 */
	public String toString(){
		return this.getClass().getSimpleName() + "\n" +
				"name: " + this.name + "\n" +
				"id: " + this.id;
	}
	
	/**
	 * Indicates if this dog is "equal to" some other object. This dog is equal to some other object if they are both objects 
	 * of the same type and have the same ids. 
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if this dog is "equal to" some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Dog)){
			return false;
		}
		
		Dog other = (Dog)obj;
		return this.id == other.id;
	}
}
