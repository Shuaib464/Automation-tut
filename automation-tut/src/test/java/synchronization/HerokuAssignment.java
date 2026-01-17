package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HerokuAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		WebElement enableBtn = driver.findElement(By.xpath("//form[@id='input-example']/button"));
		enableBtn.click();
		
		WebElement inputField = driver.findElement(By.xpath("//form[@id='input-example']/input"));
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		wait.until(ExpectedConditions.elementToBeClickable(enableBtn));
		
		inputField.sendKeys("Complete");
		
		Thread.sleep(3000);
		
//		driver.quit();
		driver.quit();

		

	}

}
