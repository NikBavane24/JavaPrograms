package assignments;
class Secondclass1
{
	void add()
	{
		System.out.println("add");
	}
	void sub()
	{
		System.out.println("sub");
	}
}

public class Singleinheritancenonstatic extends Secondclass1 {
	void mul()
	{
		System.out.println("mul");
	}
	void div()
	{
		System.out.println("div");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleinheritancenonstatic s1=new Singleinheritancenonstatic();
		s1.add();
		s1.sub();
		s1.mul();
		s1.div();
	}

}
