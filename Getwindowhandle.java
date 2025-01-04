package selenium_package;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mens Shoes");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver.getWindowHandles());
		driver.findElement(By.xpath("(//div[@class=\"a-section aok-relative s-image-tall-aspect\"])[1]")).click();
		driver.close();

	}

}
