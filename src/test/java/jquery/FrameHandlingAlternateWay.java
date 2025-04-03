package jquery;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FrameHandlingAlternateWay {

	public static void main(String[] args) {	

				WebDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/droppable/");
				driver.manage().window().maximize();

				WebElement frame = driver.findElement(By.xpath("//iframe"));				

				/*
				 * In order to work on the webelements inside the frame, first locate the frame
				 * Frame can be located via index of the frame or Frame can be located via name
				 * or id of the frame Frame can be located via webelement
				 */

				driver.switchTo().frame(frame); // frame identified using webelement
				//driver.switchTo().frame(0);
				//driver.switchTo().frame(""); //name or id attribute of the frame

				// Read the initial text at the target element
				String intitalTextOnTargetElement = driver.findElement(By.xpath("//div[@id = 'droppable']/p")).getText();
				
				System.out.println(intitalTextOnTargetElement);

				WebElement sourceElement = driver.findElement(By.id("draggable"));
				WebElement targetElement = driver.findElement(By.id("droppable"));

				Actions action = new Actions(driver);
				action.clickAndHold(sourceElement).moveToElement(targetElement).release(targetElement);
				action.build().perform();

				/*
				 * Read the latest text at the target element after dragging the source element
				 * into target element
				 */
				
				String finalTextOnTargetElement = driver.findElement(By.xpath("//div[@id = 'droppable']/p")).getText();
				System.out.println(finalTextOnTargetElement);

				driver.quit();
			}

		}

	
