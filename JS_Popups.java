package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win-10/Downloads/grotechminds.html");
		driver.switchTo().alert().accept();
		driver.findElement(By.id("1")).sendKeys("Nikhil1234");
		driver.quit();

	}

}
