package assignments;

public class ThisNonandpara 
{
	ThisNonandpara(int a)
	{
		System.out.println(a);
	}
	ThisNonandpara()
	{
		this(100);
		System.out.println("Non Parameterized");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisNonandpara();

	}

}
