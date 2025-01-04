package selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggetion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.className("Pke_EE")).sendKeys("mobile");
		Thread.sleep(2000);
		List <WebElement> Auto=driver.findElements(By.xpath("//div[@class=\"_2L0uxW\"]/div/div"));
		Auto.get(1).click();

	}

}
