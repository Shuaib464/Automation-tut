package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In this program, we are using verification type methods of WebElement<I> interface
 * Verification methods
 * 1) isDisplayed() - Boolean
 * 2) isEnabled() - Boolean
 * 3) isSelected() - Boolean 
*/
public class Verification_Type_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(1500);

		WebElement un = driver.findElement(By.id("email"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		System.out.println("Email text-field is enable -: " + un.isEnabled());
		System.out.println("Login Btn is displayed -: " + un.isDisplayed());
		
		Thread.sleep(2000);
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		Thread.sleep(2000);
		
		WebElement check = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
		System.out.println("Check box is selected -: " + check.isSelected());
		
		Thread.sleep(2000);
		driver.quit();
	}
}
