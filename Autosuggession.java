package selenium_package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apollopharmacy.in/");
		driver.findElement(By.xpath("//p[.=\"Palghar 401207\"]")).click();
		driver.findElement(By.xpath("//p[.=\"Update Pincode (401207)\"]")).click();
		Set<String> a=driver.getWindowHandles();
		System.out.println(a);
		driver.findElement(By.xpath("//input[@maxlength=\"6\"]")).sendKeys("416005");
		//driver.findElement(By.xpath("//div[@data-placeholder=\"Search Medicines")).sendKeys("Paracet");
		

	}

}
