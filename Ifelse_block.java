package Practice;

import java.util.Scanner;

public class Ifelse_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner (System.in);
		System.out.println("Give age here= ");
		int age=           s1.nextInt();
		if (age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not eligible to vote");
		}

	}

}
