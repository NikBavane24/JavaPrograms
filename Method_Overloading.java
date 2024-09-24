package Practice;

public class Method_Overloading 
{
static void Method()
{
System.out.println("Method1");
}
static void Method(int a)
{
System.out.println("Method2");	
}
void Method(int a,int b)
{
System.out.println("Method3");	
}
	public static void main(String[] args) 
	{
		Method();
		Method(1);
		Method_Overloading m1=new Method_Overloading(); 
		m1.Method(1,2);

	}

}
