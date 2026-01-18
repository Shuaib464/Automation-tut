package working_with_screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// for taking element specific screenshot, you just need to call getScreenshotAs() on webElement not on tks object
		
		// NOTE -: from selenium 4 onwards, element screenshot is supported.

		WebElement loginBox = driver.findElement(By.id("header-inner"));
		
		File src = loginBox.getScreenshotAs(OutputType.FILE);
		
//		File dest = new File("H:\\\\Q-Automation\\\\A12-selenium-superstar\\\\src\\\\test\\\\java\\\\working_with_screenshot\\\\element.png");
		
		// use variable when giving path
		long time = System.currentTimeMillis();
		File dest = new File("C:\\Users\\Lenovo\\git\\Automation-tut\\automation-tut\\src\\test\\java\\working_with_screenshots\\elementPic"+time+".png");
		
		FileHandler.copy(src, dest);
		
		Thread.sleep(2500);
		
		driver.quit();
		
		
	}

}
