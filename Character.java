package Practice;

import java.util.Arrays;

public class Character {
	static int count_of_alphabet;
	static int count_of_number;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Nikhil456";
		
		char [] c1= a.toCharArray();
		//System.out.println(Arrays.toString(c1));
		for(int i=0;i<a.length();i++)
		{
		boolean b1=Character.isAlphabetic(c1[i]);
		if(b1==true)
		{
			count_of_alphabet++;
		}
		boolean b2=Character.isDigit(c1[i]);
		if(b2==true)
		{
			count_of_number++;
		}
	}
		System.out.println("Alphabets= "+count_of_alphabet);
		System.out.println("Numbers= "+count_of_number);

}


	private static boolean isDigit(char c) {
		// TODO Auto-generated method stub
		return false;
	}


	static boolean isAlphabetic(char c) {
		// TODO Auto-generated method stub
		return false;
	}

}
