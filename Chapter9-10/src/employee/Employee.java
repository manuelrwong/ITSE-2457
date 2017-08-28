package employee;

/**
 * Represents an employee.
 * 
 * @author Qi Wang
 * @version 1.1
 */
public class Employee {

	/**
	 * The name of this employee
	 */
	private String name;
	/**
	 * The social security number of this employee
	 */
	private long id;
	/**
	 * The next id of this employee
	 */
	private static long nextID = 1000;
	
	/**
	 * Constructs an employee with empty name.
	 */
	public Employee(){
		this(null);
	}
	
	/**
	 * Constructs an employee with an name.
	 * @param name A reference to the name of this employee
	 */
	public Employee(String name){
		this.name = name;
		this.id = nextID;
		nextID++;
	}
	
	/**
	 * Returns the name of this employee.
	 * @return A string specifying the name of this employee
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Changes the name of this employee.
	 * @param name A reference to the name of this employee
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the id of this employee.
	 * @return An integer specifying the id of this employee
	 */
	public long getId() {
		return this.id;
	}



	/**
	 * Returns the next available id. 
	 * @return An integer specifying the next available id
	 */
	public static long getNextID() {
		return nextID;
	}
	
	/**
	 * Returns a string representation of this employees.
	 * @return A string representation of this employee
	 */
	public String toString(){
		return  this.getClass().getSimpleName() + "\t" +
				 "\nname : " + this.name + "\nid: : " + this.id;
	}
	
	/**
	 * Indicates if this employee is "equal to" some other object. This employee
	 * is equal to some other object if they are objects of employee type, and the ids 
	 * are equal.
	 * @param obj A reference to some other object
	 * @return A value specifying if this employee is equal to some other object
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof Employee)){
			return false;
		}
		
		Employee other = (Employee)obj;
		return this.id == other.id;
	}

}
