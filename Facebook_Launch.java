package SeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Launch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php/");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Abc@12345");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
