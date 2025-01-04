package selenium_package;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_childwindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoe");
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		List <WebElement> s=driver.findElements(By.xpath("//div[@class=\"a-section aok-relative s-image-tall-aspect\"]"));
		Thread.sleep(2000);
		s.get(2).click();
		Set<String> id=driver.getWindowHandles();
		System.out.println(id);
		Iterator<String> l1=id.iterator();
		String Parent=(String) l1.next();
		String Child=(String) l1.next();
		driver.switchTo().window(Child);
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-button")).click();
		driver.switchTo().window(Parent);
		driver.close();
	}

}
