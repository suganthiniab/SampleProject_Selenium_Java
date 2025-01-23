package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class LoginSuccessful {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();
		
		//take screenshot once logged in
		Shutterbug.shootPage(driver).save();

		String expectedResult = "You logged into a secure area!";
		WebElement flash = driver.findElement(By.className("flash"));
		String actualResult = flash.getText();
		System.out.println(actualResult);

		if (actualResult.equals(expectedResult)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}
		
		//Highlight flash element on the screenshot taken
		Shutterbug.shootPage(driver).highlight(flash).save();
		driver.quit();
	}
}
