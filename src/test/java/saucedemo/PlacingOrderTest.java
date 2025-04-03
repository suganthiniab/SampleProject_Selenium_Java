package saucedemo;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import constants.LocatorConstants;
import constants.WebConstant;
import utils.ExcelUtils;

//This class is an example for data driven testing 
public class PlacingOrderTest {

	private static final Object UserName = null;

	@Test
	public void placingOrderUsingMultipleUsers() throws EncryptedDocumentException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		List<Map<String, Object>> fullData = ExcelUtils.readExcelFile();

		for (Map<String, Object> eachRow : fullData) {
			
			driver.get(WebConstant.BASEURL);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.findElement(By.id(LocatorConstants.USERNAME)).clear();
			driver.findElement(By.id(LocatorConstants.USERNAME)).sendKeys(eachRow.get("UserName").toString());
			driver.findElement(By.id(LocatorConstants.PASSWORD)).clear();
			driver.findElement(By.id(LocatorConstants.PASSWORD)).sendKeys(eachRow.get("Password").toString());
			driver.findElement(By.id(LocatorConstants.LOGIN_BUTTON)).click();
			driver.findElement(By.id(LocatorConstants.PRODUCT)).click();
			driver.findElement(By.xpath(LocatorConstants.SHOPPINGCART_BUTTON)).click();
			driver.findElement(By.id(LocatorConstants.CHECKOUT_BUTTON)).click();
			
			driver.findElement(By.id(LocatorConstants.FIRSTNAME_TEXTBOX)).clear();
			driver.findElement(By.id(LocatorConstants.FIRSTNAME_TEXTBOX)).sendKeys(eachRow.get("FirstName").toString());
			driver.findElement(By.id(LocatorConstants.LASTNAME_TEXTBOX)).clear();
			driver.findElement(By.id(LocatorConstants.LASTNAME_TEXTBOX)).sendKeys(eachRow.get("LastName").toString());
			driver.findElement(By.id(LocatorConstants.POSTCODE_TEXTBOX)).clear();
			driver.findElement(By.id(LocatorConstants.POSTCODE_TEXTBOX)).sendKeys(eachRow.get("ZipCode").toString());
			driver.findElement(By.id(LocatorConstants.CONTINUE_BUTTON)).click();
			driver.findElement(By.id(LocatorConstants.FINISH_BUTTON)).click();
			
			System.out.println(eachRow.get("UserName") + " has logged in and placed the order successfully");

			String actualResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LocatorConstants.ORDER_COMPLETE_TEXT))).getText();
			String expectedReult = LocatorConstants.ORDER_COMPLETE_TEXT_EXPECTED;

			Assert.assertEquals(actualResult, expectedReult);
		}
		
		driver.quit();
	}

}
