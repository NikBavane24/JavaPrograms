package firstassignment;

public class Grade_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50;
		if(a>=90)
		{
			System.out.println("Grade is A+");
		}
		else if(a>=80 && a<90)
		{
			System.out.println("Grade is A");
		}
		else if (a>=70 && a<80)
		{
			System.out.println("Grade is B");
		}
		else if (a>=60 && a<70)
		{
			System.out.println("Grade is C");
		}
		else if (a>=50 && a<60)
		{
			System.out.println("Grade is D");
		}
		else
		{
			System.out.println("Fail");
		}
	
	}

}
