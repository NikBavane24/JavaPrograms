package assignments;

public class Class1()
{
	System.out.println("Class1");
}

public class Upcasting2 extends Class1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		Upcasting2 a=(Upcasting2) new Class1();
		System.out.println();
	}

}
