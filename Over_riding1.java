package assignments;
class shape
{
	void draw()
	{
		System.out.println("Any shape possible");
	}
}
class square extends shape
{
	@Override
	void draw()
	{
		System.out.println("Square shape");
	}
}

public class Over_riding1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s1=new square();
		shape s=new shape();
		s1.draw();
		s.draw();
		

	}

}
