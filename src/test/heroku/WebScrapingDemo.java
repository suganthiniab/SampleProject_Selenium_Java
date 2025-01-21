package heroku;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebScrapingDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/abtest");

		String heading = driver.findElement(By.xpath("//h3")).getText();
		String paragraph = driver.findElement(By.xpath("//p")).getText();

		System.out.println(heading);
		System.out.println(paragraph);
		
		driver.quit();
	}
}
