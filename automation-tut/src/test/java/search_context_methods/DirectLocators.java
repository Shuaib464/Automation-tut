package search_context_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Using findElement() method to find the web-elements
 * Here we are using direct locators of By<c> class to locate elements
 */
public class DirectLocators {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// using id locator
		By by = By.id("email");
		WebElement un = driver.findElement(by);
		
		un.sendKeys("778854648");  // entering input into the element
		
		// using name locator
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("5648879");
		
		Thread.sleep(1000);
		
		// using link text
		//WebElement link1 = driver.findElement(By.linkText("Forgotten password?"));
		//link1.click();
		
		// using partialLink text
		WebElement link2 = driver.findElement(By.partialLinkText("Forgo"));
		link2.click();
		
		Thread.sleep(2000);
		
		driver.close();
		

	}

}