package assignments;
class One1
{
	One1 (int a)
	{
		super();
		System.out.println("One1");
	}
}
class Two2 extends One1
{
	Two2 (char a)
	{
		super(100);
		System.out.println("Two2");
	}
}
class Three3 extends Two2
{
	Three3 ()
	{
		super('B');
		System.out.println("Three3");	
	}
}
public class Superparameterized extends Three3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new Superparameterized();
	}

}
