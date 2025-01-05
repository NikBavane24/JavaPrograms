package firstassignment;

public class Static_nonstaticmethod 
{
	static void Method1()
	{
		System.out.println("Method1");
	}
	static void Method2()
	{
		System.out.println("Method2");
	}
	static void Method3()
	{
		System.out.println("Method3");
	}
	void Method4()
	{
		System.out.println("Method4");
	}
	void Method5()
	{
		System.out.println("Method5");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method1();
		Method2();
		Method3();
		Static_nonstaticmethod ns=new Static_nonstaticmethod();
		ns.Method4();
		ns.Method5();

	}

}
