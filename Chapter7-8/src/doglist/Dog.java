package doglist;

/**
 * Defines a dog that holds a dog's name and can make it speak.
 */
public class Dog{
	/**
	 * The name of this dog
	 */
	private String name;
	
	/**
	 * Constructs a dog with a name.
	 * @param name This dog's name
	 */
	public Dog(String name)	{
		this.name = name;
	}
	/**
	 * Constructs a dog with default name.
	 */
	public Dog(){
		this.name = "";
	}
	
	/**
	 * Changes the name of this dog.
	 * 
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Returns this dog's name.
	 * @return A string specifying this dog's name
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * Returns a String with this Dog's comments.
	 * @return A string specifying this dog's comments
	 */
	public String speak(){
		return "Woof";
	}
	
	
	/**
	 * Compares this dog with the other dog.
	 * @return A boolean value specifying whether this dog is
	 *         the same as the other dog
	 * @param obj The reference to the other dog
	 */
	public boolean equals(Object obj){
		if (!(obj instanceof Dog)){
			return false;
		}
		
		Dog other = (Dog)obj;
		return this.name.equals(other.name);
	}
	
	/**
	 * Returns a String representation of this dog.
	 * @return A string specifying this dog's details
	 */
	public String toString(){
		//return "Dog" + " [" + name  + "]";
		return getClass().getName() + " [" + this.name  + "]";
	}
}




