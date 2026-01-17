package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * In this program, we are using getters type methods of WebElement<I> interface
 * Getters methods
 * 1) getText() - String
 * 2) getAttribute() - String
 * 3) getCssValue() - String
 * 4) getTagName() - String
 * 5) getLocation() - Point<c>
 * 6) getSize() - Dimension<c>
 * 7) getRect() - Rectangle<c>
 */
public class Getters_Type_Methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		Thread.sleep(1500);
		
		WebElement un = driver.findElement(By.id("email"));
		WebElement loginBtn = driver.findElement(By.name("login"));
		
		String txt = loginBtn.getText();
		System.out.println("Text is -: "+ txt);
		System.out.println("==========================================");
		
		String nameAtt = un.getAttribute("name");
		String font =	un.getCssValue("font");
		String tag = un.getTagName();
		Point p = un.getLocation();
		Dimension dim = un.getSize();
		Rectangle rect = un.getRect();
		

		System.out.println("name attribute -: "+ nameAtt);
		System.out.println("font is -: "+ font);
		System.out.println("Tag is -: "+ tag);
		System.out.println("Location = X -: "+ p.getX() + " , Y -: " + p.getY());
		System.out.println("Size = Width -: "+ dim.getWidth() + " , Height -: " + dim.getHeight());
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
