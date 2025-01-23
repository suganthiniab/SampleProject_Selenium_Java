package heroku;

import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFailed {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.id("username")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("dummy");		
		driver.findElement(By.className("radius")).click();

		String expectdResult = "Your username is invalid!";
		WebElement flash = driver.findElement(By.className("flash"));
		Shutterbug.shootElement(driver, flash).save();
		
		String actualResult = flash.getText();

		if (actualResult.equals(expectdResult)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}

		driver.quit();
	}

}
