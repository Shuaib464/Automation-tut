package working_with_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
		
		//capture elements
		WebElement selDayDD = driver.findElement(By.id("day"));
		WebElement selMonthDD = driver.findElement(By.id("month"));
		WebElement selYearDD = driver.findElement(By.id("year"));
		
		Select selDay = new Select(selDayDD);
		selDay.selectByValue("29");
		
		Thread.sleep(2000);
		
		Select selMonth = new Select(selMonthDD);
		selMonth.selectByVisibleText("Jun");
		
		Thread.sleep(1500);
		
		Select selYear = new Select(selYearDD);
		selYear.selectByValue("2000");
		
		List<WebElement> years = selYear.getOptions();
		for(WebElement i : years) {
			System.out.println(i.getText());
		}
		
		Thread.sleep(6000);
		
		driver.quit();

	}

}
