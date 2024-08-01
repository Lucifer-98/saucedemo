package com.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BasePage;
import Utilities.commons;

public class ScrollDownPage extends BasePage{
	
	commons cmmn = new commons();
	
	public ScrollDownPage(WebDriver driver) {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[text()='Test.allTheThings() T-Shirt (Red)']")
	public WebElement selectedIteam;
	
	@FindBy(xpath = "//span[text()='Products']")
	public WebElement productsPage;
	
	
	public void verticalScroll()
	{
		cmmn.scrollToElement(driver, selectedIteam);
		System.out.println("Successfully Scrolled Vertically");
	}
	
	public boolean verifyProductpage() throws InterruptedException {
		Boolean Product_page_displayed = productsPage.isDisplayed();
		System.out.println(Product_page_displayed);
		return Product_page_displayed;
	}
	
	
}
