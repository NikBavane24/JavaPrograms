package assignments;
class one
{
 static void add()
 {
	 System.out.println("add");
 }
}
class two extends one
{
	 static void sub()
	 {
		 System.out.println("sub");
	 }
}
class three extends two
{
	 void mul()
	 {
		 System.out.println("mul");
	 }
}
class four extends three
{
	 void div()
	 {
		 System.out.println("div");
	 }
}
public class Multiinheritancestatic extends four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		Multiinheritancestatic m1=new Multiinheritancestatic();
		m1.mul();
		m1.div();

	}

}
