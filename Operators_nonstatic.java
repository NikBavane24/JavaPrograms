package assignments;
public class Operators_nonstatic {
	void addition ()
	{	int a = 100;
		int b = 50;
		int c= a+b;
		System.out.println("Addition of a and b = "+c);}
	void subtraction ()
	{	int a = 100;
		int b = 50;
		int c= a-b;
		System.out.println("Subtraction of a and b = "+c);}
	void multiplication ()
	{	int a = 100;
		int b = 50;
		int c= a*b;
		System.out.println("Multipication of a and b = "+c);}
	void division ()
	{	int a = 100;
		int b = 50;
		int c= a/b;
		System.out.println("Division of a and b = "+c);}
	void modulus ()
	{	int a = 100;
		int b = 50;
		int c= a%b;
		System.out.println("Modulus of a and b = "+c);}
	public static void main(String[] args) {
		Operators_nonstatic a1=new Operators_nonstatic();
		a1.addition();
		a1.subtraction();
		a1.multiplication();
		a1.division();
		a1.modulus();	
	}

}
