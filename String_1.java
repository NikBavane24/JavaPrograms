package Practice;

import java.util.Arrays;

public class String_1 {
	static int count_of_alphabets;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="nikhil1234";
		char [] c1= a.toCharArray();
		//System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<9;i++)
		{
		boolean b1=Character.isAlphabetic(c1[i]);
		if(b1==true)
		{
			count_of_alphabets++;
		}
		}
		System.out.println(count_of_alphabets);
	}

}
