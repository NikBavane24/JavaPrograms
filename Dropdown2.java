package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win-10/Downloads/grotechminds.html");
		driver.findElement(By.id("1")).sendKeys("Nikhil");
		WebElement e1 = driver.findElement(By.id("Relegion"));
		Select s1 = new Select(e1);
		s1.selectByValue("Christian");
		e1.sendKeys(Keys.ARROW_DOWN);
		driver.quit();
	}

}
