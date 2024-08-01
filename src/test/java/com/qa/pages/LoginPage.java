package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BasePage;
import Utilities.commons;

public class LoginPage extends BasePage{
	
	commons cmmn = new commons();
	
	public LoginPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Swag Labs']")
	public WebElement loginPageName;
	
	@FindBy(xpath = "//input[@id='user-name']")
	public WebElement userName;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement pwd;
	
	@FindBy(xpath = "//input[@id='login-button']")
	public WebElement loginBtn;
	
	

	public boolean verifyLoginpageLogo() throws InterruptedException {
		Boolean displayed = loginPageName.isDisplayed();
		System.out.println(displayed);
		return displayed;
	}
	
	public void enterUserName()
	{
		userName.sendKeys("standard_user");
		System.out.println("Enter Username Successfully");
	}
	
	public void enterPassword()
	{
		pwd.sendKeys("secret_sauce");
		System.out.println("Enter PassWord Successfully");
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
		System.out.println("Click On Login Btn Successfully");
	}
	
	
}
