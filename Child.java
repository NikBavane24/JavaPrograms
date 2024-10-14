package assignments;
class GradParent
{
void add(int a)
{
	System.out.println("GradParent");
}
}

class Parent extends GradParent
{
void add()
{
	super.add(1);
	System.out.println("Parent");
}
}

public class Child extends Parent {
	void add()
	{
		super.add();
		System.out.println("Child");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		c1.add();

	}

}
