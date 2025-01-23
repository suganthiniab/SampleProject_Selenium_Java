package heroku;

import java.io.File;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileDownload {

	WebDriver driver = new ChromeDriver();

	@Test
	public void fileDownload() {
		/*
		 * To handle alert thrown by background specially by Operating System like
		 * Windows. provide 'username' and 'password' before the url for instance ,
		 * provide "username:password@url" is followed by after 'https://' within the url
		 */

		driver.get("https://admin:admin@the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Secure File Download")).click();
		driver.findElement(By.linkText("testing.pdf")).click();

		// Intended file path will be saved as file instance
		File downloadDirectory = new File("C:\\Users\\Suganthini2\\Downloads");
		
		// all files will be stored into file array		
		File[] downloadDirectoryContents = downloadDirectory.listFiles();

		for (File eachFile : downloadDirectoryContents) {
			if (eachFile.getName().equals("testing")) {
				Assert.assertTrue(true);
				System.out.println("File Found: " + eachFile.getName());
				System.out.println("File path: " + eachFile.getAbsolutePath());
				break;
			}
		}

		driver.quit();
	}

}
