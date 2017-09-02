package Employee;

public class Employee {
	
	private Name name;
	private Address homeAddress;
	
	public Employee()
	{
		this.name = new Name();
		this.homeAddress = new Address();
	}
	
	public Employee( String first, String middle, String last, String address, String city, String state, long zipcode )
	{
		this.name = new Name( first, middle, last );
		this.homeAddress = new Address( address, city, state, zipcode );
	}
	
	public Name getName()
	{
		return this.name;
	}
	
	public void setName( Name name )
	{
		this.name = name;
	}
	
	public Address getAddress()
	{
		return this.homeAddress;
	}
	
	public void setAddress( Address address )
	{
		this.homeAddress = address;
	}
	
	public String toString()
	{
		return this.name.toString() + "\n" + homeAddress.toString();
	}
	
	public boolean equals( Object obj )
	{
		if( !(obj instanceof Employee) )
		{
			return false;
		}
		
		Employee other = (Employee)obj;
		
		return this.name.equals( other.name ) && this.homeAddress.equals( other.homeAddress );
	}
}