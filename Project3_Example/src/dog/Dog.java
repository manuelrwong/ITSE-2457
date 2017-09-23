package dog;

public abstract class Dog {
	
	protected String name;
	protected int id;
	
	protected static int nextID = 1000;

	public Dog()
	{
		this.name = "";
		this.id = nextID;
		nextID++;
	}
	
	public Dog( String name )
	{
		this.name = name;
		this.id = nextID;
		nextID++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public static int getNextID()
	{
		return nextID;
	}
	
	public String speak()
	{
		return "woof";
	}
	
	public abstract int getBreedWeight();
	
	public String toString()
	{
		return "Dog:\nName: " + this.name + " \nid: " + this.id;
	}
	
	public boolean equals( Object obj )
	{
		if( !(obj instanceof Dog) )
		{
			return false;
		}
		
		Dog other = (Dog)obj;
		
		return this.name.equals(other.name) && this.id == other.id;
	}
}
