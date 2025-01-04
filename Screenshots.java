package selenium_package;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		WebElement Upload=driver.findElement(By.id("file"));
		Upload.sendKeys("D:\\Gym\\Gym Attendance sheet.pdf");
		TakesScreenshot SS=driver;
		File f1=SS.getScreenshotAs(OutputType.FILE);
		File f2=new File("C:\\Users\\Win-10\\eclipse-workspace\\Newrepo\\Selenium_Assignments\\Screenshots\\"+Math.random()+".png");
		FileHandler.copy(f1, f2);

	}

}
