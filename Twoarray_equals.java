package assignments;

import java.util.Arrays;

public class Twoarray_equals {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		
		int[] arr2 = new int[3];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;
		boolean b=Arrays.equals(arr1, arr2);
		
		if(b==true)
		{
			System.out.println("Arrays are equals to each other");
		}
		else
		{
			System.out.println("Arrays are not equals to each other");
		}

	}

}
