package assignments;

public class Static_nonstatic_Method {
	static void M1()
	{
		System.out.println("M1");
	}
	static void M2()
	{
		System.out.println("M2");
	}
	static void M3()
	{
		System.out.println("M3");
	}
	void M4()
	{
		System.out.println("M4");
	}
	void M5()
	{
		System.out.println("M5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M1();
		M2();
		M3();
		Static_nonstatic_Method s1=new Static_nonstatic_Method();
		s1.M4();
		s1.M5();

	}

}

