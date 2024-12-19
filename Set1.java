package Practice;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
	
	public static void main(String[] args) {
		
		Set s1=new HashSet();
		s1.add(34);
		s1.add(21);
		s1.add(93);
		s1.add("NUB");
		s1.add('A');
		s1.add(null);
		s1.add(34);
		System.out.println(s1);
	}

}
