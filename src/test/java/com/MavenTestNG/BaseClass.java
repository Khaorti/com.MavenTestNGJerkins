package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	@Test
	public void setup () {
		System.setProperty("webdriver.chome.drivers", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		
		
		System.out.println("This is my Maven TestNG Project");
	}
	
	

}
