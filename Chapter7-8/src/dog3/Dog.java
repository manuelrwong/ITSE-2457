package dog3;

/**
 * Representation of a dog object. A dog is created with a name. 
 * @author Qi Wang
 * @version 1.0
 */
public class Dog {
	/**
	 * The name of this dog
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
	 * Constructs a dog.
	 */
	public Dog(){
		this("");
	}
	
	/**
	 * Constructs a dog with a name.
	 * @param name A reference to dog name
	 */
	public Dog(String name){
		this.name = name;
		this.id = nextID;
		nextID++;
	}
	
	/**
	 * Returns the name of this dog.
	 * @return A string literal specifying the name of this dog
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
	 * @return An integer specifying the id of this dog
	 */
	public int getID(){
		return this.id;
	}
	
	/**
	 * Returns the next id.
	 * @return An integer specifying the next id
	 */
	public static int getNextID(){
		return nextID;
	}
	/**
	 * Returns a string representation of this dog. The string literals includes
	 * the type of this dog, and the name of this dog.
	 * @return A string representation of this dog
	 */
	public String toString(){
		return this.getClass().getSimpleName() + " id: " + this.id + " name: " + this.name;
	}
	
	/**
	 * Indicates if this dog is equal to some other object. This dog is equal to some other object
	 * if the other object is also a dog, and has the same name. If the other object is not a dog,
	 * returns false.
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if this dog is equal to some other object 
	 */
	public boolean equals(Object obj){
		// compare with something that is not a dog
		if(!(obj instanceof Dog)){
			return false;
		}
		// compare with another dog
		Dog other = (Dog)obj;
		return this.id == other.id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
