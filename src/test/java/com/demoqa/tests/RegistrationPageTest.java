package com.demoqa.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.demoqa.base.TestBaseSetup;

import com.demoqa.pageobjects.BasePage;
import com.demoqa.pageobjects.RegistrationPage;

public class RegistrationPageTest extends TestBaseSetup {
	private WebDriver driver;
	private BasePage basePage;
	private RegistrationPage registrationPage;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
		
		@Test
		public void verifyRegistrationPage() {
			System.out.println("Registration page test...");
			basePage = new BasePage(driver);
			registrationPage = basePage.clickRegistrationBtn();
			Assert.assertTrue(registrationPage.verifyPageTitle(), "Page title not matching");
			Assert.assertTrue(registrationPage.verifyRegistrationPageText(), "Page text not matching");
		}
		
		public void verifySignInFunction() {
			
		}

}