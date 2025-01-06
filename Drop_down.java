package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement e1=driver.findElement(By.id("Skills"));
		Select s1=new Select(e1);
		s1.selectByIndex(2);
		
		WebElement e2=driver.findElement(By.id("Country"));
		Select s2=new Select(e2);
		s2.selectByValue("India");
		
		WebElement e3=driver.findElement(By.id("Relegion"));
		Select s3=new Select(e3);
		s3.selectByVisibleText("Hindu");
		
		WebElement e4=driver.findElement(By.id("nontechnicalskills"));
		Select s4=new Select(e4);
		s4.selectByIndex(3);
		driver.close();
	}

}
