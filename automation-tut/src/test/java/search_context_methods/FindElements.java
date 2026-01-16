package search_context_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Here we are using findElements() methods to find out how many img web-elements in the web-page
 * findElements() returns --> List<WebElement> 
 */
public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.zomato.com/");
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		
		System.out.println("Total images are -: " + images.size());
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
