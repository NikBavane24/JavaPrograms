package assignments;

import java.util.Date;

public class Current_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date();
		long a=d1.getTime();
		System.out.println(a);

		Date d2=new Date(d1.getTime());
		System.out.println(d2);
		
		String d3=d2.toString();
		String month=d3.substring(4, 7);
		System.out.println(month);
		
		//String d3=d2.toString();
		String date=d3.substring(8, 10);
		System.out.println(date);
		
		String year=d3.substring(d3.length()-4);
		System.out.println(year);
	}

}
