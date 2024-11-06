package assignments;

import java.util.ArrayList;
import java.util.Collection;

public class Collections_interface {

	public static void main(String[] args) {
	Collection c1=new ArrayList();
	c1.add(45);
	c1.add("Nikhil");
	c1.add(1.71);
	c1.add(true);
	c1.add('B');
	//System.out.println(c1);
	c1.add(997073697);
	System.out.println(c1);
	Collection c2=new ArrayList();
	
c2.addAll(c1);
c2.add(123);
	System.out.println(c2);
	boolean b1=c1.equals(c2);
	boolean b2=c2.containsAll(c1);
	System.out.println(b1);
	System.out.println(b2);
	
	}

}
