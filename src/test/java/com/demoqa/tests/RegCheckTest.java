package com.demoqa.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegCheckTest {
	
	private WebDriver driver; 
	String appURL = "http://demoqa.com";

	@BeforeClass
	public void testSetUp() {
		
		System.setProperty("webdriver.firefox.bin","/opt/homebrew-cask/Caskroom/firefox/42.0/Firefox");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void verifyDQAPageTittle() {
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		Assert.assertEquals(getTitle, "Demoqa | Just another WordPress site");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}