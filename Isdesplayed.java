package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdesplayed {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win-10/Downloads/grotechminds.html");
		WebElement e1 = driver.findElement(By.id("121"));
		boolean b1 = e1.isDisplayed();
		boolean b2 = e1.isEnabled();
		if(b1==true && b2==true)
		{
			e1.sendKeys("Both are true");
		}
		System.out.println(b1);
		System.out.println(b2);
		driver.quit();
	}

}
