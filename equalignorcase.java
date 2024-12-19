package assignments;

public class equalignorcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  a ="Nikhil Bavane";
		boolean b1=a.equalsIgnoreCase("nikhil bavane");
		System.out.println(b1);
		
		String b= "Kv no 2";
		String b3=b.replace("K", "T");
		System.out.println(b3);
		
		String c= "I'm in Gurgaon";
		String c1=c.replace("Gurgaon", "Delhi");
		System.out.println(c1);
		
		String d= "Kv no 2";
		String d1=b.replace("2", "");
		System.out.println(d1);
		
		String e= "kv no 2";
		String e1=e.replaceAll("[a-z]", "");
		System.out.println(e1);

		String f= "Kv no 2";
		String f1=f.replaceAll("[A-Z]", "");
		System.out.println(f1);
		
		String g= "Kv no 2";
		String g1=g.replaceAll("[0-9]", "");
		System.out.println(g1);
		
		String h= "kv no 2";
		String h1=h.replace(" ", "_");
		System.out.println(h1);

	}

}
