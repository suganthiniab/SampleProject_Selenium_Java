package heroku;

import java.sql.Time;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NestedFrames {

	WebDriver driver = new ChromeDriver();

	
	@Test
	public void nestedFramesSwitch() throws InterruptedException {

		driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		driver.manage().window().maximize();
		WebDriver topFrame = driver.switchTo().frame("frame-top");
		
		switchBetweenFrames(topFrame, "frame-right");
		switchBetweenFrames(topFrame, "frame-middle");
		switchBetweenFrames(topFrame, "frame-left");	
		
		Thread.sleep(3000);		
		WebDriver bottomFrame = driver.switchTo().frame("frame-bottom");
		String textOnBottomFrame = driver.findElement(By.xpath("//body")).getText();		
		System.out.println(textOnBottomFrame);	
		driver.switchTo().defaultContent();
	}
	
	
	private void switchBetweenFrames(WebDriver topFrame, String frameName) throws InterruptedException {
		String bodyText;
		WebDriver subFrame = topFrame.switchTo().frame(frameName);
		bodyText = driver.findElement(By.xpath("//body")).getText();
		System.out.println(bodyText);
		subFrame.switchTo().parentFrame();
	}

}