package employee.abstractclass;

/**
 * Represents a parttime employee.
 * 
 * @author Qi Wang
 * @version 1.1
 */
public class ParttimeEmployee extends Employee{
		
	/**
	 * The pay rate of this employee
	 */
	private double hourlyRate;
	
	/**
	 * The work hours of this employee
	 */
	private double workedHours;
	
	
	/**
	 * Constructs an employee with default name and pay rate.
	 */
	public ParttimeEmployee(){
		this(null, 0.0, 0.0);
	}
	
	/**
	 * Constructs an employee with the specified information.
	 * @param name The name of this employee
	 * @param hourlyRate The pay rate of this employee
	 * @param workedHours The worked hours of this employee
	 */
	public ParttimeEmployee (String name,double hourlyRate, double workedHours){
		super(name);
		this.hourlyRate = hourlyRate;
		this.workedHours = workedHours;
		count++;
	}
	
	
	/**
	 * Calculates the pay of this employee. 
	 * @return A value specifying the pay rate of this employee
	 */
	public double pay(){
		if(this.workedHours > 40){
			return this.hourlyRate * 40 + 1.5 * this.hourlyRate * (this.workedHours - 40);
		}else{
			return this.hourlyRate * this.workedHours;
		}
	}
	/**
	 * Returns information about this employee as a string.
	 * 
	 * @return A String literal specifying the details of this employee
	 */
	public String toString(){
		return super.toString() +
				"\nhourly rate: " + this.hourlyRate +
				"\nworked hours: " + this.workedHours;
	}
	
	
	/**
	 * Compare this employee with the other one and returns true if this staff is the same as the other,
	 * false, otherwise.
	 * @param obj A reference to the other employee
	 * @return A boolean value specifying whether this employee is the same as the other employee
	 */
	public boolean equals(Object obj){
		if(!(obj instanceof ParttimeEmployee))
			return false;
		ParttimeEmployee other = (ParttimeEmployee)obj;
		return super.equals(other);
	}
}
