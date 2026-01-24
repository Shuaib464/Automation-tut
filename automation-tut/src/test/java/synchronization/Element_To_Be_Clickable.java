package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * ElementToBeClickable checks -
 * element displayed
 * element enabled 
 * element clickable
 */
public class Element_To_Be_Clickable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
		
//		WebElement deleteBtn = driver.findElement(By.xpath("//button[text()='Delete']"));
		WebElement addElementBtn = driver.findElement(By.xpath("//button[text()='Add Element']"));
		Thread.sleep(1500);
		addElementBtn.click();		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// wait Delete btn for click until it is displayed and clickable
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Delete']")));
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
