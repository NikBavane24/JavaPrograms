package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s1=new HashSet();
		s1.add(34);
		s1.add(21);
		s1.add(93);
		s1.add(8/4);
		Iterator li=s1.iterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
