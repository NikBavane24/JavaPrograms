package Practice;
abstract class Class3
{
	abstract void Method1();
	abstract void Method2();
	void method4()
	{
		System.out.println("Login for logout");
	}
}
abstract class Class2 extends Class3
{
	abstract void Method3();
	abstract void Method5();
}

public class Class1 extends Class2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	void Method3() {	
	}

	@Override
	void Method5() {	
	}

	@Override
	void Method1() {	
	}

	@Override
	void Method2() {	
	}

}
