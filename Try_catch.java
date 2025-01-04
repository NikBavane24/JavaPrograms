package assignments;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		try
		{
			//int a=1/0;
			int a1 []=new int[3];
			a1[0]=0;
			a1[1]=0;
			a1[2]=0;
			a1[3]=0;
			a1[4]=0;
		}
		catch(ArithmeticException a)
		{
			System.out.println("Exception handled");
		}
		catch (ArrayIndexOutOfBoundsException b)
		{
			System.out.println("Exception of ArrayIndexOutOfBoundsException handled");
		}
	}

}
