package heroku;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class ScreenshotOfFullView {

	@Test
	public void TakeScreenShotAsFullView() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/");
		Shutterbug.shootPage(driver, Capture.FULL_SCROLL).save();
	}

}
