package com.demoqa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

	private WebDriver driver;
	private By formHeadingTxt = By.id("piereg_pie_form_heading");
	public RegistrationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyPageTitle() {
		String pageTitle = "Registration | Demoqa";
		return getPageTitle().contains(pageTitle);
	}
	public boolean verifyRegistrationPageText() {
		WebElement element = driver.findElement(formHeadingTxt);
		String formText ="Registration Form";
		return element.getText().contains(formText);
	}
	
	public void registration() {
		//need to write steps for creating an account
	}
}