package assignments;

import java.util.Arrays;

public class Array_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		array[0]=55;
		array[1]=62;
		array[2]=78;
		array[3]=84;
		array[4]=55;
		System.out.println(Arrays.toString(array));
		
		int[] array2=new int[5];
		for(int i=0; i < 5;i++)
		{
			array2 [i]=array[i];
		}
		System.out.println(Arrays.toString(array2));
	}

}
