package assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1="cafe";
		String a2="face";
		if(a1.length()!=a2.length())
		{
			System.out.println("Both string is not anagram");
		}
		else
		{
		char c1[]=         a1.toCharArray();
		char c2[]=         a2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean b1=Arrays.equals(c1, c2);
		if(b1==true)
		{
			System.out.println("Both string is anagram");
		}
		else
		{
			System.out.println("Both string is not anagram");
		}
		}

	}

}
