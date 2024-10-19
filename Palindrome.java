package assignments;

public class Palindrome {

	public static void main(String[] args) {
		String input="madaq";
		String output= "";
		
		for(int i=4;i>=0;i--)
		{
			char c1=    input.charAt(i);
			output=output+c1;
		}
		//System.out.println(output);
		
		boolean b1=input.equals(output);
		
		if(b1==true)
		{
			System.out.println("String is palindrom");
		}
		else
		{
			System.out.println("String is not palindrom");
		}
}
}