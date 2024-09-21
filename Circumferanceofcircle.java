package assignments;

import java.util.Scanner;

public class Circumferanceofcircle {
	static final double pi=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of r=");
		int r=        s1.nextInt();
		double Circumferanceofcircle= 2*pi*r;
		System.out.println("Circumferance of circle = "+Circumferanceofcircle);
	}

}
