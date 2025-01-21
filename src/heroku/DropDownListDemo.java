package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");

		// Locate the drop-down list
		WebElement dropDownList = driver.findElement(By.id("dropdown"));

		// call Select class in order to access drop-down list
		// Pass drop-down element to call Select constructor
		Select select = new Select(dropDownList);

		select.selectByVisibleText("Option 1");
		select.selectByIndex(2);
		select.selectByValue("1"); // provide 'value' attribute of option tag
		select.selectByContainsVisibleText("Option 2");

		driver.quit();
	}

}
