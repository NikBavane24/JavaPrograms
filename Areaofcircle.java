package assignments;

import java.util.Scanner;

public class Areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14;
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter the value of redius=");
		int r=               s1.nextInt();
		double areaofcircle =pi*r*r;
		System.out.println("Area of Circle = "+areaofcircle);
	}

}
