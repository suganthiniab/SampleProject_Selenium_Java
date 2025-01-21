package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckboxDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Checkboxes")).click();

		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();

		driver.quit();
	}

}
