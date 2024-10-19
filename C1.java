package Practice;
class C4
{
	void m1()
	{System.out.println("m1");}
	void m2()
	{System.out.println("m2");}
}
abstract class C3 extends C4
{
	abstract void m3();
	abstract void m4();
	void m5()
	{System.out.println("m5");}
	void m6()
	{System.out.println("m6");}
}
class C2 extends C3
{
	void m7()
	{System.out.println("m7");}
	void m8()
	{System.out.println("m8");}
	@Override
	void m3() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void m4() {
		// TODO Auto-generated method stub
		
	}
}

public class C1 extends C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 obj=new C1();
		obj.m1();
	}

}
