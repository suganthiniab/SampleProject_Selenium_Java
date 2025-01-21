package heroku;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/abtest");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();

		driver.findElement(By.linkText("Elemental Selenium")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for (String handle : allWindowHandles) {
			//if condition finds out the handle, which is not parent handle
			if (!handle.equalsIgnoreCase(parentWindowHandle)) {
				driver.switchTo().window(handle);
			}			
		}
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentWindowHandle);
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
