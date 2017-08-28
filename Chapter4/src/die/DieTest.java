package die;

public class DieTest {
	public static void main(String[] args)
	{
		Die d1 = new Die(); 
		Die d2 = new Die();
		d1.setFaceValue(4);
		System.out.println(d1.getFaceValue());
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.equals(d2));
	}

}
