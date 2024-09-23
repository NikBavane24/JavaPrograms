package myfirstpackage;

public class Nonstaticmethod {
	
	void name()
	{
		System.out.println("Nikhil");
	}
	public void age()
	{
		System.out.println(32);
	}
	public void mobileno()
	{
		System.out.println(997073);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstaticmethod n1= new Nonstaticmethod();
		n1.name();
		n1.age();
		n1.mobileno();
	}

}
