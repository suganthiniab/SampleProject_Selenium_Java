package com.selenium.framework;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoUsingTestNGTest {
	
	WebDriver driver = new ChromeDriver();
	
	@Test
	public void googleSearch() {		
		
		driver.get("https://www.google.com/");
		driver.close();		
	}
	
	@Test
	public void techCanvaas() {
		
		driver.get("https://techedge.techcanvass.co/Login.aspx");
		driver.close();		
	}

}
