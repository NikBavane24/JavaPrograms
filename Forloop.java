package assignments;

public class Forloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int a;
		
		for(int i=1;i<=10;i++)
		{
			Thread.sleep(3000);
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}

	}

}
