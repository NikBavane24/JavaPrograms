package Practice;
class a1
{
	a1(String a)
	{
	System.out.println("1");
	}
}
class a2 extends a1
{
	a2(int a)
	{
		super("NUB");
		System.out.println("2");
	}
	
}
class a3 extends a2
{
	a3()
	{
		super(1);
		System.out.println("3");
	}
	
}

public class Supercalling {

	public static void main(String[] args) {
		
		a3 a=new a3();
	
		

	}

}
