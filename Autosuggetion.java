package selenium_package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1 = driver.findElement(By.id("input"));
		driver.findElement(By.xpath("//button[@class='M6CB1c rr4y5c']")).click();
		e1.sendKeys("Kolhapur");
		List <WebElement> e2 = (List<WebElement>) driver.findElement(By.xpath("//div/ul/li"));
		int Length = e2.size();
		System.out.println(Length);
		
		for(int i=0; i<Length; i++)
		{
			WebElement a1 = e2.get(i);
			String a= a1.getText();
			System.out.println(a);
		}
	}

}
