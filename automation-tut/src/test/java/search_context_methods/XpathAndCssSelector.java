package search_context_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Here we are using xpath and cssSelector to locate web-element by findElement() method
 */
public class XpathAndCssSelector {
	
	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// using cssSelector
		WebElement un = driver.findElement(By.cssSelector("input[id='email']"));
		un.sendKeys("778854648");  // entering input into the element
		
		// using name locator
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pass']"));
		pwd.sendKeys("5648879");
		
		Thread.sleep(2000);
		
		driver.close();
	}
}
