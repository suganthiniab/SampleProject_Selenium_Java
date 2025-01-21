package heroku;

import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsAndSwitching {

	public static void main(String[] args) {

		/*
		 * switching between multiple windows using different strategies There are
		 * multiple ways to switch between differnet windows such as page title and any
		 * attribute of the page
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/abtest");
		driver.manage().window().maximize();
		String parentWindowHandle = driver.getWindowHandle();

		driver.findElement(By.linkText("Elemental Selenium")).click();
		Set<String> allWindowHandles = driver.getWindowHandles();

		for (String handle : allWindowHandles) {
			
			//Need to switch to all handles one by one to find out the title / any attribute of the page
			driver.switchTo().window(handle);
			if (driver.getTitle().equalsIgnoreCase("Home | Elemental Selenium")) {
				break; //break the loop if the handle found
			} else {
				System.out.println("Continue loop: " + driver.getTitle());
			}

		}

		System.out.println(driver.getTitle());
		driver.quit();
	}
}