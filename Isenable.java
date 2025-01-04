package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win-10/Downloads/grotechminds.html");
		//driver.switchTo().alert().accept();
		WebElement e1 = driver.findElement(By.id("3"));
		boolean b1 = e1.isDisplayed();
		boolean b2 = e1.isEnabled();
		if(b1==true && b2==true)
		{
			e1.sendKeys("Both are true");
		}
		driver.quit();
		
	}

}
