package assignments;
class Eight
{
	Eight ()
	{
		super();
		System.out.println("eight");
	}
}
class Nine extends Eight
{
	Nine ()
	{
		super();
		System.out.println("Nine");
	}
}
class Ten extends Nine
{
	Ten ()
	{
		super();
		System.out.println("Ten");	
	}
}

public class SuperNonpara extends Ten{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SuperNonpara();
	}

}
