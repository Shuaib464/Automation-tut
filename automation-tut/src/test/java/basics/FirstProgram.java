package basics;

import org.openqa.selenium.chrome.ChromeDriver;

/*  
 * First Program of Automation
 * In this program, we simply launch browser and open Google 
 *  
 *  */
public class FirstProgram {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com");

		driver.quit();

	}
}
