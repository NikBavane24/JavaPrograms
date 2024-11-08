package SeleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		//FirefoxDriver driver1= new FirefoxDriver();
		//EdgeDriver driver2= new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.get("https://www.facebook.com/login/?next=https%3A%2F%2Fwww.facebook.com%2F");
		
		//driver1.get("https://www.google.co.in/");
		//driver2.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.quit();
		//driver1.quit();
		//driver2.quit();
	}

}
