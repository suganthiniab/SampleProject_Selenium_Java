package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSuccessful {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Form Authentication")).click();
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.className("radius")).click();

		String expectedResult = "You logged into a secure area!";
		
		String actualResult = driver.findElement(By.className("flash")).getText();
		System.out.println(actualResult);

		if (actualResult.equals(expectedResult)) {
			System.out.println("Test Passed");
		} else {
			System.out.println("Test failed");
		}

		driver.quit();
	}
}
