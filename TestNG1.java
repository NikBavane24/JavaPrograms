package testng_Package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 
{
	@BeforeSuite
	public void Bs()
	{
		System.out.println("BeforeSuite");
	}
	@BeforeTest
	public void Bt()
	{
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void Bc()
	{
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void Bm()
	{
		System.out.println("BeforeMethod");
	}
	@Test 
	public void testcase1()
	{
		System.out.println("Test");
	}
	@AfterSuite
	public void As()
	{
		System.out.println("AfterSuite");
	}
	@AfterTest
	public void At()
	{
		System.out.println("AfterTest");
	}
	@AfterClass
	public void Ac()
	{
		System.out.println("AfterClass");
	}
	@AfterMethod
	public void Am()
	{
		System.out.println("AfterMethod");
	}
}
