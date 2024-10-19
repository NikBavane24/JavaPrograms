package assignments;

import java.util.Arrays;

public class Check_datatypeno {
static int count_of_alphabet;
static int count_of_number;
static int count_of_spaces;
static int count_of_specialchar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="kv no 2 bangalore @!";
		char c1[]= a.toCharArray();
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
		boolean b3=Character.isWhitespace(c1[i]);
		if(b3==true)
		{
			count_of_spaces++;
		}
		
		}
		System.out.println(count_of_alphabet);
		System.out.println(count_of_number);
		System.out.println(count_of_spaces);
		int Count_of_specialchar= c1.length-(count_of_alphabet+count_of_number+count_of_spaces);
		System.out.println(Count_of_specialchar);
		
	}
	
}
