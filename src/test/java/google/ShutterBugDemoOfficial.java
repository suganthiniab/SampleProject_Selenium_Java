package google;

import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Shutterbug;

import java.awt.Color;
import java.awt.Font;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShutterBugDemoOfficial {
	
	@Test
	public void shutterBugDemo() {
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com/imghp");
	        driver.findElement(By.xpath("//div[text()='Accept all']")).click();
	        WebElement googleLogo = driver.findElement(By.xpath("//img[@alt='Google Images']"));
	        WebElement searchBtn = driver.findElement(By.name("btnK"));
	        WebElement searchBox = driver.findElement(By.name("q"));

	        searchBox.sendKeys("Testing");

	        Shutterbug.shootPage(driver)
	                .blur(searchBox)
	                .highlight(searchBtn)
	                .monochrome(googleLogo)
	                .highlightWithText(googleLogo, Color.blue, 3, "Monochromed logo",Color.blue, new Font("SansSerif", Font.BOLD, 20))
	                .highlightWithText(searchBox, "Blurred secret words")
	                .withTitle("Google home page - " + new Date())
	                .withName("home_page")
	                .withThumbnail(0.7)
	                .save();
	        driver.quit();		
	}

}
