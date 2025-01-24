package heroku.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ExplicitWaitExample {

	@Test
	public void utilizeExplicitWait() {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		String actualMessage = driver.findElement(By.id("message")).getText();
		String expectedMessage = "It's enabled!";
		Assert.assertEquals(actualMessage, expectedMessage);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		driver.findElement(By.xpath("//button[text()='Disable']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
		actualMessage = driver.findElement(By.id("message")).getText();
		expectedMessage = "It's disabled!";
		Assert.assertEquals(actualMessage, expectedMessage);

		Shutterbug.shootPage(driver).save();

		driver.quit();
	}

}
