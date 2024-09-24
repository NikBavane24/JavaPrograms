package Practice;

import java.util.Scanner;

public class Scannermethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1= new Scanner (System.in);
		System.out.println("Enter your name=");
		String Firstname=         s1.next();
		System.out.println("Enter your age=");
		int age=         s1.nextByte();
		System.out.println("Enter Bday month=");
		short month=         s1.nextShort();
		System.out.println("Enter your Mobnumber=");
		long Mnumber=         s1.nextLong();
		System.out.println("Enter NO=");
		float No=         s1.nextFloat();
		System.out.println("Enter your Wt=");
		double Wt=         s1.nextDouble();
		s1.close();
	}

}
