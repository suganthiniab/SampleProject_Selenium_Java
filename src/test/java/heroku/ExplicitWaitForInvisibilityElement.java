package heroku;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitForInvisibilityElement {

	@Test

	public void utilizeExplicitWaitForInvisibilityElement() {

		WebDriver driver = new ChromeDriver();
		
		//Best wait strategy is using both implicit and explicit wait together
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		WebElement checkbox = driver.findElement(By.id("checkbox"));
		wait.until(ExpectedConditions.invisibilityOf(checkbox));

		String actualMessage = driver.findElement(By.id("message")).getText();
		String expectedMessage = "It's gone!";
		Assert.assertEquals(actualMessage, expectedMessage);

		driver.findElement(By.xpath("//button[text()='Add']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("checkbox")));
		actualMessage = driver.findElement(By.id("message")).getText();
		expectedMessage = "It's back!";
		Assert.assertEquals(actualMessage, expectedMessage);	
		
		driver.quit();

	}
}
