package selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Autosuggetion {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("Shoe");
		Thread.sleep(2000);
		List <WebElement> Auto=driver.findElements(By.xpath("//div[@class=\"OBMEnb\"]/ul/li"));
		int length =Auto.size();
		System.out.println(length);
		
		for(int i=0;i<length;i++)
		{
		WebElement e1=Auto.get(i);
		String Autosuggetion=e1.getText();
		System.out.println(Autosuggetion);
		}
		
		Auto.get(0).click();
		

	}

}
