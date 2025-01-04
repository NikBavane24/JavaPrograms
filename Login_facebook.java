package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("nikhilbavane24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9595745668");
		driver.findElement(By.id("loginbutton")).click();

	}

}
