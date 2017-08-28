package petstore;

import dog4.Dog;
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
    private Dog[] pets;
    
    /**
     * The count of this list of dogs
     */
    private int count;
    
    /**
     * Constructs an empty pet store.
     */
    public PetStore(){
      	this(new Dog[5]);
    }
    
    /**
     * Constructs a pet store with a list dogs.
     * @param pets A reference to a list of dogs
     */
    public PetStore(Dog[] pets){
    	this.pets = pets;
    	
    	int numberOfDog = 0;
    	for(int i = 0; i < pets.length && pets[i] != null; i++){
    		numberOfDog++;
    	}
  
    	this.count = numberOfDog;
    }
    
    /**
     * Returns the reference to the list of dogs.
     * @return A reference to list of dogs
     */
    public Dog[] getPets(){
    	return this.pets;
    }
    
    /**
     * Returns the count of the list of dogs of this store.
     * @return An integer specifying the count of ths dogs in this store
     */
    public int getCount(){
    	return this.count;
    }
    
    
    /**
     * Adds a new dog to the list of dogs this store. 
     * @param dog A reference to a dog 
     */
    public void addAPet(Dog dog){
    	//This pet store is full.
    	if(this.count >= this.pets.length){
    		increaseSize();
    	}
    	
    	this.pets[this.count]  =  dog;
		this.count++;
    }
    
    /**
     * Adjusts the size of the list of the dogs.
     */
    private void increaseSize(){
    	//Create a bigger array
    	Dog[] pets = new Dog[this.pets.length + 3];
    	//copy references to the bigger array
    	for(int i = 0; i < this.count; i++){
    		pets[i] = this.pets[i];
    	}
    	//set the reference of this.pets
    	this.pets = pets;
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
	
		for(int i = 0; i < this.count; i++){
			report = report +  this.pets[i].toString() + "\n";
		}
	
		return  report + "\nThere are " + this.count + " dogs.";
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
		if(this.count != other.count){
			return false;
		}
		//Compare dogs
		// - sort both lists
		// - compare for equal lists 
		Arrays.sort(this.pets, 0, this.count); // add from Index and toIndex
		Arrays.sort(other.pets, 0, this.count); // add from Index and toIndex
		
		return Arrays.equals(this.pets, other.pets);
	}
	
}
