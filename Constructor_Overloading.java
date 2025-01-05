package firstassignment;

class a
{
a()
{
System.out.println("Without Parameter");	
}
a(int a)
{
System.out.println("With Parameter integer");	
}
a(double a)
{
System.out.println("With Parameter double");	
}
a(boolean a)
{
System.out.println("With Parameter boolean");	
}
}

public class Constructor_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new a(true);

	}

}
