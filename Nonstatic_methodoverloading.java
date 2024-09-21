package assignments;

public class Nonstatic_methodoverloading {
	void method()
	{  
		System.out.println("Addition");
	}
	void method(int a)
	{ 
		System.out.println("Subtraction");
	}
	void method(int a,int b)
	{ 
		System.out.println("Multiplication");
	}
	static void method(int c,double d)
	{ 
		System.out.println("Division");
	}
	public static void main(String[] args) {
		Nonstatic_methodoverloading n1=new Nonstatic_methodoverloading();
		n1.method();
		n1.method(1);
		n1.method(1, 2);
		n1.method(3, 5.12);
	}

}
