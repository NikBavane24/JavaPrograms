package firstassignment;

import java.util.Scanner;

public class Largest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter value of a=");
		int a= s1.nextInt();
		System.out.println("Enter value of b=");
		int b=s1.nextInt();
		if(a>b)
		{
			System.out.println("Largest value="+a);
		}
		else
		{
			System.out.println("Largest value="+b);
		}

	}

}
