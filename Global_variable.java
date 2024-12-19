package Practice;

public class Global_variable {
	static int a=10;   // global variable
	int c=100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b=50; //local variable
		a=15;
		
		Global_variable g1=new Global_variable();
		g1.c=50;
		System.out.println(a);
		System.out.println(g1.c);

	}

}
