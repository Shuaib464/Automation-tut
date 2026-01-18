package working_with_screenshots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com");
		
		// Taking screenshot has 4 step process
		
		// +++++++++++ 1) Explicit type casting of WebDriver object  ++++++++++++++++++++
		TakesScreenshot tks = (TakesScreenshot) driver;
		
		// +++++++++++ 2) Capture the screenshot ++++++++++++++++++++++
		File src = tks.getScreenshotAs(OutputType.FILE);
		
		// +++++++++++ 3) Create destination ++++++++++++++++++++++++
		File dest = new File("H:\\Q-Automation\\A12-selenium-superstar\\src\\test\\java\\working_with_screenshot\\fb.png");
		
		// ++++++++++ 4) Now copy the image file from src to dest +++++++++++++++++++++++++++
		FileHandler.copy(src, dest);
		
		Thread.sleep(2500);
//		driver.quit();

	}

}
