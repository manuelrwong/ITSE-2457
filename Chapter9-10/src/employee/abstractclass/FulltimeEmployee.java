package employee.abstractclass;

/**
 * Represents a fulltime employee.
 * 
 * @author Qi Wang
 * @version 1.1
 */

public class FulltimeEmployee extends Employee{
	
	/**
	 * The pay rate of this employee
	 */
	private double payRate;
	
	/**
	 * The bonus of this employee
	 */
	private double bonus;
	/**
	 * Constructs an employee with default name and pay rate.
	 */
	public FulltimeEmployee(){
		this(null, 0.0);
	}
	
	/**
	 * Constructs an employee with the specified information.
	 * @param name The name of this employee
	 * @param payRate The pay rate of this employee
	 */
	public FulltimeEmployee (String name,double payRate){
		//parent responsibility
		super(name);
		//child responsibility
		this.payRate = payRate;
		this.bonus = 1000.0;
		count++;
	}
	

	/**
	 * Returns the bonus of this employee.
	 * @return A value specifying the bonus of this employee
	 */
	public double getBonus(){
		return this.bonus;
	}
	/**
	 * Calculates the pay of this employee. 
	 * @return A value specifying the pay rate of this employee
	 */
	public double pay(){
        return this.payRate + this.bonus;
	}
	
		
	/**
	 * Returns information about this employee as a string.
	 * 
	 * @return A String literal specifying the details of this employee
	 */
	public String toString(){
		return super.toString() + //parent responsibility
					"\npay rate : " + this.payRate + //child responsibility
					"\nbonus : " + this.bonus;
	}
	
	/**
	 * Compare this employee with the other one and returns true if this staff is the same as the other,
	 * false, otherwise.
	 * @param obj A reference to the other employee
	 * @return A boolean value specifying whether this employee is the same as the other employee
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof FulltimeEmployee))
			return false;
		FulltimeEmployee other = (FulltimeEmployee)obj;
		return super.equals(other);
	}
}
