package assignments;

import java.util.Arrays;

public class Iteration {

	public static void main(String[] args) {
		int mark[]=new int[4];
		mark[0]=87;
		mark[1]=83;
		mark[2]=76;
		mark[3]=62;
		
		int mark1[]=new int[4];
		for(int i=0;i<4;i++)
		{
			mark1[i]=mark[i];
		}
		System.out.println(Arrays.toString(mark));
		System.out.println(Arrays.toString(mark1));
	}

}
