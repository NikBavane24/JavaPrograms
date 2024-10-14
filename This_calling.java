package Practice;

public class This_calling {
	This_calling()
	{
		this(1);
		System.out.println("Constructer");
	}
	This_calling(int a,int b)
	{
		System.out.println("Constructer parameterized int2");
	}
		
	This_calling(int a)
	{
		this(2,4);
		System.out.println("Constructer parameterized");
	}
		
		public static void main(String[] args) {

	new This_calling();
}
}
