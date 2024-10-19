package assignments;

import java.util.Arrays;

public class Array_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark[]=new int[4];
		mark[0]=87;
		mark[1]=83;
		mark[2]=76;
		mark[3]=62;
		int mark1[]=new int[4];
		for(int i=0,k=3;i<4;i++,k--)
		{
			mark1[k]=mark[i];
		}
		System.out.println(Arrays.toString(mark1));
	}

}
