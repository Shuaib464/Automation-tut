package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWait_Example {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		
		//explicit wait
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		//fluent wait
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(15));
		wait.pollingEvery(Duration.ofMillis(1000));
		
		WebElement removeBtn = driver.findElement(By.xpath("//button[text()='Remove']"));
		removeBtn.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Add']")));
		
		WebElement addBtn = driver.findElement(By.xpath("//button[text()='Add']"));
		
		
		
		addBtn.click();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
