package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Listofiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add(76);
		l1.add(7);
		l1.add(6);
		l1.add(47);
		l1.add(76);
		
		ListIterator li=l1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("***************************************************");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
