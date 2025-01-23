package utils;

import java.io.File;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtils {
	
	public static String generateScreenshotFileName() {
		
		String fileName = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		fileName = "Screenshots/" + fileName + ".png";		
		return fileName;		
		
		}
	

	public static void takeScreenshot(WebDriver driver) {

		/*
		 * Cast 'TakesScreenshot' interface to the driver instance Capture the
		 * screenshot and store it as a file
		 */
		
		File sourceScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotFileName = generateScreenshotFileName();
		
		File targetScreenshot = new File(screenshotFileName);
		try {
			FileUtils.copyFile(sourceScreenshot, targetScreenshot);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
