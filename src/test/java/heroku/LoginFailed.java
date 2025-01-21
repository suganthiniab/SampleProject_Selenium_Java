package heroku;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

		String actualResult = driver.findElement(By.className("flash")).getText();

		if (actualResult.equals(expectdResult)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}

		driver.quit();
	}

}
