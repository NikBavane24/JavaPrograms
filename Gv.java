package Practice;

import java.util.Scanner;

public class Gv {
	static int a;
	static int b;
	static void add()
	{
		int sum= a+b;
	System.out.println(sum);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		a=         s1.nextInt();
		b=         s1.nextInt();
		add();
	}

}
