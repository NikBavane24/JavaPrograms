package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Movechild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe"+ Keys.ENTER);
		WebElement e2 = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
		e2.click();
		System.out.println(driver.getWindowHandles());
		
		}

}
