package dogwithexceptions;



/**
 * Representing a dog with a name. 
 * @author Qi Wang 
 * @version 1.0
 */
public class Dog {
	
	
	/**
	 * The name of this dog
	 */
	private String name; 
	
	/**
	 * Constructs a newly created Dog object that represents a dog with an empty name.
	 */
	public Dog(){
		//this.name = "";
		//invoke the other constructor
		this("");
	}
	
	/**
	 * Constructs a newly created Dog object that represents a dog with a name.
	 * The length of the name of this dog can be 10 at most.
	 * @param name The name of this dog
	 * @throws DogNameTooLongException if the name has more than 10 characters
	 */
	public Dog(String name){
		try{
			if(name.length() <= 10){
				this.name = name;
			}else{
				//throw an exception object
				throw new DogNameTooLongException("The length of a name cannot be more than 10.");
			}
		}catch(DogNameTooLongException ex){
			ex.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
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
	 * @param name The name of this dog
	 * @throws DogNameTooLongException if the name has more than 10 characters
	 */
	public void setName(String name){
		try{
			if(name.length() <= 10){
				this.name = name;
			}else{
				//throw an exception object
				throw new DogNameTooLongException("The length of a name cannot be more than 10.");
			}
		}catch(DogNameTooLongException ex){
			ex.printStackTrace();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	/**
	 * Returns a string representation of this dog. The returned string contains the type of this
	 * dog and the name of this dog.
	 * @return A string representation of this dog
	 */
	public String toString(){
		return this.getClass().getSimpleName() + ": " + this.name;
	}
	
	/**
	 * Indicates if this dog is "equal to" some other object. If the other object is a dog, this dog is equal to the other
	 * dog if they have the same names. If the other object is not a dog, this dog is not equal to the other object. 
	 * @param obj A reference to some other object
	 * @return A boolean value specifying if this dog is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Dog)){
			return false;
		}
		
		Dog other = (Dog)obj;
		return this.name.equalsIgnoreCase(other.name);
	}
	
	
	
	
	
	
	
	
}
