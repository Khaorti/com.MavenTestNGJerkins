package com.MavenTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public void setup () {
		System.setProperty("webdriver.chome.drivers", "Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("");
		
	}
	
	

}
