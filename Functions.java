package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Functions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a1 =new Actions(driver);
		WebElement e1 = driver.findElement(By.xpath("//span[.='Fashion']"));
		a1.moveToElement(e1).perform();
		
		WebElement e2 = driver.findElement(By.xpath("(//object/a)[4]"));
		a1.moveToElement(e2).perform();
		WebElement e3 = driver.findElement(By.linkText("Men's Sports Shoes"));
		e3.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

	private static Actions Actions(ChromeDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
}
