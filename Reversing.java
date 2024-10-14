package assignments;

public class Reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="ABCDEF";
		String output= "";
		for(int i=5;i>=0;i--)
		{
			char c1=    input.charAt(i);
			output=output+c1;
		}
		System.out.println(output);

	}

}
