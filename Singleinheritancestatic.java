package assignments;
class Secondclass
{
	static void add()
	{
		System.out.println("add");
	}
	static void sub()
	{
		System.out.println("sub");
	}
}
public class Singleinheritancestatic extends Secondclass {
	static void mul()
	{
		System.out.println("mul");
	}
	static void div()
	{
		System.out.println("div");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		mul();
		div();
	}

}
