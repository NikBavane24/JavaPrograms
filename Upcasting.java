package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;


public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l1=new ArrayList();
		l1.add(76);
		l1.add(7);
		l1.add(6);
		l1.add(47);
		l1.add(76);
		//l1.add(null);
		//l1.add(2.45);
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
		Iterator i=l1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
