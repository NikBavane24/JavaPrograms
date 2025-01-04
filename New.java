package Selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		Actions a1 =new Actions(driver);
		WebElement e1 = driver.findElement(By.xpath("//img[@id='drag4']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id='div2']"));
		WebElement e3 = driver.findElement(By.xpath("//div[@id='container-3']"));
		a1.dragAndDrop(e1, e2).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(e1, e3).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
