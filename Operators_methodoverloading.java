package assignments;
public class Operators_methodoverloading {
	static void method()
	{  
		System.out.println("Method");
	}
	static void method(int a)
	{ 
		System.out.println("Value of a");
	}
	static void method(int a,int b)
	{ 
		System.out.println("Addition a and b");
	}
	static void method(int c,double d)
	{ 
		System.out.println("Subtraction a and b");
	}
	public static void main(String[] args) {
		method();
		method(10);
		method(10,20);
		method(1,1.23);

	}

}
