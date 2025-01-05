package firstassignment;

import java.util.Scanner;

public class Areaof_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Pi=Math.PI;
		Scanner s1=new Scanner(System.in);
		System.out.println("Redius of Circle r=");
		double r=   s1.nextDouble();
		double A= Pi*r*r;
		System.out.println("Area of circle="+ A);

	}

}
