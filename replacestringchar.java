package assignments;

public class replacestringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="kv no 2 bangalore @!";
		boolean b1= a.equalsIgnoreCase("Kv no 2 Bangalore @!");
		System.out.println(b1);
		
		String b=a.replace("k", "T");
		System.out.println(b);
		
		String c=a.replaceAll("bangalore", "Pune");
		System.out.println(c);
		
		String d=a.replaceAll("2", "");
		System.out.println(d);
		
		String e=a.replaceAll("[a-z]", "");
		System.out.println(e);
		
		String f=a.replaceAll("[0-9]", "");
		System.out.println(f);

	}

}
