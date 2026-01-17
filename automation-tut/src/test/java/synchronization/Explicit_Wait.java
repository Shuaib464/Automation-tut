package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * Explicit Wait is apply to a specific element or condition, it does not apply globally
 * if element not found in given time then throw -> TimeoutException 
 */
public class Explicit_Wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/24");
		
		Thread.sleep(15000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		driver.findElement(By.id("Check Delivery")).sendKeys("201003");
		
		WebElement checkBtn = driver.findElement(By.id("Check"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		
		checkBtn.click();
		
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
