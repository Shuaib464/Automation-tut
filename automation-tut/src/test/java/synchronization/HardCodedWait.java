package synchronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HardCodedWait {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		// hard code or dumb wait by Java
		Thread.sleep(2500);
		
		driver.quit();
	}
}
