package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BasePage;
import Utilities.commons;

public class CheckOutProcess extends BasePage{
	
	commons cmmn = new commons();
	
	public CheckOutProcess (WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='checkout']")
	public WebElement checkOutProcess;
	
	@FindBy(xpath = "//input[@id='first-name']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last-name']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@id='postal-code']")
	public WebElement zipCode;
	
	@FindBy(xpath = "//input[@id='continue']")
	public WebElement contunieBtn;
	
	@FindBy(xpath = "//button[@id='finish']")
	public WebElement finishBtn;
	
	@FindBy(xpath = "//span[text()='Checkout: Complete!']")
	public WebElement complete;
	
	
	public void clickonCheckoutItem() {
		checkOutProcess.click();
		System.out.println("Successfully Click on CheckoutButton");
	}
	
	public void enterFirstName()
	{
		firstName.sendKeys("Jyoti");
		System.out.println("Enter Firstname Successfully");
	}
	
	public void enterLastName()
	{
		lastName.sendKeys("Prakash");
		System.out.println("Enter Lastname Successfully");
	}
	
	public void enterZipCode()
	{
		zipCode.sendKeys("560037");
		System.out.println("Enter Zipcode Successfully");
	}
	
	public void clickonContinueBtn()
	{
		contunieBtn.click();
		System.out.println("click on Continue Btn Successfully");
	}
	
	public void clickonFinishBtn()
	{
		finishBtn.click();
		System.out.println("click on Finish Btn Successfully");
	}
	
	public boolean verifyCompletepage() throws InterruptedException {
		Boolean Complete_page_displayed = complete.isDisplayed();
		System.out.println(Complete_page_displayed);
		return Complete_page_displayed;
	}
}
