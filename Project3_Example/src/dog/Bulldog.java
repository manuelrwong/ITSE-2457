package dog;

public class Bulldog extends Dog{
	
	private final int WEIGHT = 12;
	
	public Bulldog()
	{
		super();
	}
	
	public Bulldog( String name )
	{
		super( name );
	}
	
	public String toString()
	{
		return "Bulldog:\nName: " + this.name + "\nid: " + this.id + "\nWeight: " + WEIGHT;
	}

	@Override
	public int getBreedWeight() {
		// TODO Auto-generated method stub
		return 0;
	}
}
