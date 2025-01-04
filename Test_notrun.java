package testng_Package;

import org.testng.annotations.Test;

public class Test_notrun 
{
	@Test (enabled=true)
	public void regestration()
	{
		System.out.println("regestration");
	}
	@Test (enabled=false)
	public void login()
	{
		System.out.println("login");
	}
	@Test (enabled=true)
	public void homepage()
	{
		System.out.println("homepage");
	}
}
