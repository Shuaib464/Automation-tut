package working_with_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_DD {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:\\Users\\Lenovo\\git\\Automation-tut\\automation-tut\\src\\test\\java\\html\\dd.html");
		
		WebElement charDD = driver.findElement(By.id("kalakar"));
		
		Select selChars = new Select(charDD);
		
		boolean status = selChars.isMultiple();
		if(status)
			System.out.println("selected drop down is multi select");
		else 
			System.out.println("selected drop down is single select");
		
		// select only female characters
		selChars.selectByIndex(5);
		selChars.selectByIndex(11);
		
		List<WebElement> selected = selChars.getAllSelectedOptions();
		
		for(WebElement w : selected) {
			System.out.println(w.getText());
		}
		
		System.out.println(selected.size());
		
		List<WebElement> allChars = selChars.getOptions();
		System.out.println("Total no of characters : "+allChars.size());
		
		for(int i=0; i<allChars.size(); i++) {
			selChars.selectByIndex(i);
			Thread.sleep(400);
		}
		
		selected = selChars.getAllSelectedOptions();
		System.out.println("Selected characters are : "+ selected.size());
		
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
