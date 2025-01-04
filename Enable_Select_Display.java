package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enable_Select_Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win-10/Downloads/grotechminds.html");
		WebElement Checkbox=driver.findElement(By.xpath("//input[@value=\"Girl\"]"));
		Checkbox.click();
		boolean b1=Checkbox.isDisplayed();
		System.out.println(b1);
		boolean b2=Checkbox.isSelected();
		System.out.println(b2);
		WebElement Lname=driver.findElement(By.xpath("//input[@name=\"lname\"]"));
		boolean b3=Lname.isEnabled();
		System.out.println(b3);

	}

}
