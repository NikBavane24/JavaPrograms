package testng_Package;

import org.testng.annotations.Test;


public class Multiple_Test 
{
	@Test (priority=1)
	public void regestration()
	{
		System.out.println("regestration");
	}
	@Test (priority=2)
	public void login()
	{
		System.out.println("login");
	}
	@Test
	public void homepage()
	{
		System.out.println("homepage");
	}
}
