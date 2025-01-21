package com.selenium.framework;

import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUsingJunit {
	
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
