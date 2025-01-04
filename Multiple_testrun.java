package testng_Package;

import org.testng.annotations.Test;

public class Multiple_testrun 
{
	@Test (invocationCount=2)
	public void regestration()
	{
		System.out.println("regestration");
	}
	@Test (invocationCount=3)
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
