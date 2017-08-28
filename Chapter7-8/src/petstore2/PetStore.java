package petstore2;

import dog4.Dog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/**
 * Represents a pet store that has dogs only.
 * @author Qi Wang
 * @version 1.0
 */
public class PetStore {

	/**
	 * A reference to the list of dogs
	 */
    private ArrayList<Dog> pets;
    
    
    /**
     * Constructs an empty pet store.
     */
    public PetStore(){
      	this(new ArrayList<Dog>());
    }
    
    /**
     * Constructs a pet store with a list dogs.
     * @param pets A reference to a list of dogs
     */
    public PetStore(ArrayList<Dog> pets){
    	this.pets = pets;
    }
    
    /**
     * Returns the reference to the list of dogs.
     * @return A reference to list of dogs
     */
    public ArrayList<Dog> getPets(){
    	return this.pets;
    }
   
    
    /**
     * Adds a new dog to the list of dogs this store. 
     * @param dog A reference to a dog 
     */
    public void addAPet(Dog dog){
    	this.pets.add(dog);
    }
    
   
    /**
     * Returns a string representation of this store. The return string contains
     * the type of this store, and every dog of this store. 
     * @return A string representation of this store
     */
	public String toString(){
		
		//The type of this object
		//The list of dog
		//The number of dogs
		String report = "";
		
		report = report + this.getClass().getSimpleName() + ": \n"; 
	
		for(int i = 0; i < this.pets.size(); i++){
			report = report +  this.pets.get(i).toString() + "\n";
		}
	
		return  report + "\nThere are " + this.pets.size() + " dogs.";
	}
	
	/**
	 * Indicates if this store is "equal to" some other object. If the other object is also a pet store,
	 * this store is "equal to" the other one if the have the same list of dogs. Otherwise, this store'
	 * is not "equal to" the other object. 
	 * @param obj A reference to a specific object
	 * @return A boolean value specifying if this store is "equal to" some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof PetStore)){
			return false;
		}
		
		PetStore other = (PetStore)obj;
		
		//compare counts
		if(this.pets.size() != other.pets.size()){
			return false;
		}
		
		// Trim the capacity of a list size
		this.pets.trimToSize();
		other.pets.trimToSize();
		//Compare dogs
		// - sort both lists
		// - compare for equal lists 
		Collections.sort(this.pets); // add from Index and toIndex
		Collections.sort(other.pets); // add from Index and toIndex
		
		return Arrays.equals(this.pets.toArray(), other.pets.toArray());
	}
	
}
