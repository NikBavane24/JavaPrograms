package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_Popups2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.findElement(By.xpath("//button[.=\"Click \"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		driver.quit();

	}

}
