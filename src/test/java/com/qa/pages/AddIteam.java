package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BasePage;
import Utilities.commons;

public class AddIteam  extends BasePage{
	
	commons cmmn = new commons();
	
	public AddIteam (WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	public WebElement addIteam;
	
	@FindBy(xpath = "//span[@class='shopping_cart_badge']")
	public WebElement cartIcon;
	
	@FindBy(xpath = "//span[text()='Your Cart']")
	public WebElement yourCartpage;
	
	public void additeamToCart() {
		addIteam.click();
		System.out.println("Successfully Add To Cart");
	}
	
	public void clickOnCartIcon() {
		cartIcon.click();
		System.out.println("Successfully Click On Cart Icon");
	}
	
	public boolean verifyYourcartpage() throws InterruptedException {
		Boolean Yourcart_page_displayed = yourCartpage.isDisplayed();
		System.out.println(Yourcart_page_displayed);
		return Yourcart_page_displayed;
	}
	

}
