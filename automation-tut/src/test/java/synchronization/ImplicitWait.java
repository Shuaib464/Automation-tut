package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Implicit Wait is a Global wait
 * It applies on findElement() and findElements() methods
 * If element not found within the time then throws -> NoSuchElementException
 */
public class ImplicitWait {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		// applying implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.facebook.com/");
		
		driver.quit();
	}
}
