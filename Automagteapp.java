package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automagteapp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win-10/Downloads/grotechminds.html");
		driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Nikhil");
		driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("Hello");
		driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("Test@1290");
		driver.findElement(By.xpath("(/html/body/form/input)[1]")).sendKeys("Hi");
		//driver.findElement(By.xpath("(/html/body/form/input)[2]")).sendKeys("Everyone");
		driver.findElement(By.xpath("(/html/body/form/input)[4]")).click();
		driver.findElement(By.xpath("(/html/body/input)[4]")).click();
		
		driver.findElement(By.xpath("(/html/body/input)[6]")).click();
		WebElement e1 = driver.findElement(By.xpath("(/html/body/select)"));
		Select s1 =new Select(e1);
		e1.click();
		s1.selectByIndex(1);
		e1.click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click to know about us")).click();
		driver.quit();
		
	}

}
