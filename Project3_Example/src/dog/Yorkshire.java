package dog;

public class Yorkshire extends Dog {
	
	private final int WEIGHT = 6;

	public Yorkshire()
	{
		super();
	}
	
	public Yorkshire( String name )
	{
		super( name );
	}
	
	@Override
	public int getBreedWeight() {
		return WEIGHT;
	}
	
	public String toString()
	{
		return "Yorkshire:\nName: " + this.name + "\nid: " + this.id + "\nWeight: " + WEIGHT;
	}
	
	public boolean equals( Object obj )
	{
		if( !(obj instanceof Yorkshire) )
		{
			return false;
		}
		
		Yorkshire other = (Yorkshire)obj;
		return this.name.equals( other.name ) && this.id == other.id;
	}
}
