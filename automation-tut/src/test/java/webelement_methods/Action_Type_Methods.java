package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In this program, we are using action type methods of WebElement<I> interface
 * Action methods
 * 1) click()
 * 2) clear()
 * 3) sendKeys()
 * 4) submit()
 */
public class Action_Type_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1500);
		
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("abc@gmail.com");	// sendKeys() used to enter data inside text-fields
		
		Thread.sleep(2000);
		
		un.clear();		// clear() used to clear the content of the text-field
		un.sendKeys("xyz@yahoo.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("234564");
		
		WebElement loginBtn = driver.findElement(By.name("login"));
	//	loginBtn.click();	// click() used to perform click action
		loginBtn.submit();  // similar to click action perform in form child
		
		Thread.sleep(2500);
		
		driver.quit();
		
	}
}
