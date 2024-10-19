package assignments;

import java.util.Arrays;

public class Value_partofArray {

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		arr1[0]=55;
		arr1[1]=78;
		arr1[2]=80;
		arr1[3]=86;
		int notcheck=78;
		for(int i=0;i<4;i++)
		{	
		if(notcheck==arr1[i])
		{
			System.out.println(notcheck+ " is part of Array at index= " + i);
		}
	
		}
	}

}
