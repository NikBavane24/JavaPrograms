package firstassignment;

public class Overloading_nonstaticmethods 
{
	void m()
	{
		System.out.println("Non Parameterized Method");
	}
	void m(int a)
	{
		System.out.println("Value of a="+a);
	}
	void m(int a, int b)
	{
		System.out.println("Addition of a&b="+(a+b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_nonstaticmethods o1=new Overloading_nonstaticmethods();
		o1.m();
		o1.m(1);
		o1.m(10,20);

	}

}
