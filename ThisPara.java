package assignments;

public class ThisPara 
{
	ThisPara()
	{
	System.out.println("One");	
	}
	ThisPara(int a)
	{
		this();
	System.out.println("Two");	
	}
public static void main(String[] args) {
	new ThisPara(1);
}
}
