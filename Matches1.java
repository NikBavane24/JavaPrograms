package assignments;

public class Matches1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Cat";
		boolean a1=a.matches("...");
		System.out.println(a1);
		
		boolean a2=a.matches("C(.*)");
		System.out.println(a2);

		boolean a3=a.matches("(.*)t");
		System.out.println(a3);
		
		String b="nikhil";
		boolean a4=b.matches("(.*)k(.*)");
		System.out.println(a4);
	}

}
