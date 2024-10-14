package Practice;
class b1
{
	b1(String c1)
	{
	System.out.println("1");
	}
}
class b11 extends b1
{
	b11(int z)
	{
		super("NUB");
		System.out.println("2");
	}
	
}
class b112 extends b11
{
	b112()
	{
		super(1);
		System.out.println("3");
	}
	
}

public class Supercalling1 {

	public static void main(String[] args) {
		
		new b112();
		

	}

}
