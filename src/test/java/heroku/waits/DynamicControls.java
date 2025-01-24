package heroku.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import utils.ScreenshotUtils;

import java.time.Duration;

public class DynamicControls {

	@Test	
	public void handleDynamicControls() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_controls");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.findElement(By.xpath("//button[text()='Enable']")).click();
		String actualMessage = driver.findElement(By.id("message")).getText();
		String expectedMessage = "It's enabled!";
		Assert.assertEquals(actualMessage, expectedMessage);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testing");
		driver.findElement(By.xpath("//button[text()='Disable']")).click();		
		
		//take screenshot of the current window
		Shutterbug.shootPage(driver).save();		 
				
		actualMessage = driver.findElement(By.id("message")).getText();
		expectedMessage = "It's disabled!";
		Assert.assertEquals(actualMessage, expectedMessage);
		

		driver.quit();
	}

}
