package assignments;

import java.util.Arrays;

public class Update_arrayvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		array[0]=55;
		array[1]=62;
		array[2]=78;
		array[3]=84;
		array[4]=55;
		System.out.println(Arrays.toString(array));
		array[4]=90;
		System.out.println(Arrays.toString(array));
	}

}
