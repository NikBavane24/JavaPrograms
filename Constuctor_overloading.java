package Practice;

public class Constuctor_overloading 
{
	Constuctor_overloading ()
	{
		System.out.println("Constuctor");
	}
	Constuctor_overloading (int a)
	{
		System.out.println(a);
	}
	Constuctor_overloading (boolean a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constuctor_overloading c1=new Constuctor_overloading ();
		new Constuctor_overloading (100);
		new Constuctor_overloading (false);

	}

}
