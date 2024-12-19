package Practice;
class a
{
private int mob=1234567;

public int getMob() {
	return mob;
}

public void setMob(int mob) {
	this.mob = mob;
}
}
public class Encap {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a a1=new a();
		a1.setMob(7654321);
		System.out.println(a1.getMob());
		
		


	}

}
