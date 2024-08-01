package com.qa.TestCase;

import java.io.IOException;
import org.testng.annotations.Test;

import com.qa.pages.AddIteam;
import com.qa.pages.CheckOutProcess;
import com.qa.pages.LoginPage;
import com.qa.pages.ScrollDownPage;
import com.relevantcodes.extentreports.LogStatus;
import Utilities.MPException;
import Utilities.BasePage;

public class Test_Allfunctionality extends BasePage {
	
	public String testClassName= this.getClass().getSimpleName();
	
	@Test(priority=1)
	public void LoginPage() throws InterruptedException, IOException, MPException
	{ 
		try {
			   System.out.println("Test Case:1 Started");
			   test.log(LogStatus.INFO, "LoginPage Test Case Started");
			   Thread.sleep(2000);
			   LoginPage loginpage = new LoginPage(driver);
			   loginpage.verifyLoginpageLogo();
			   loginpage.enterUserName();
			   loginpage.enterPassword();
			   loginpage.clickLoginBtn();
			   Thread.sleep(2000);
			   System.out.println("Test Case:1 Done");
			   test.log(LogStatus.PASS, test.addScreenCapture(CaptureScreenshot(driver))+"LoginPage Test Passed");
		
			}catch (Exception e) {
				e.printStackTrace();
				test.log(LogStatus.FAIL, test.addScreenCapture(CaptureScreenshot(driver))+"LoginPage Test Failed");
			}		
	}
	
	
	@Test(priority=2)
	public void ScrollVertical() throws InterruptedException, IOException, MPException
	{ 
		try {
			   System.out.println("Test Case:2 Started");
			   test.log(LogStatus.INFO, "ScrollVertical Test Case Started");
			   Thread.sleep(2000);
			   ScrollDownPage scrolldownpage = new ScrollDownPage(driver);
			   scrolldownpage.verticalScroll();		   
			   Thread.sleep(2000);
			   System.out.println("Test Case:2 Done");
			   test.log(LogStatus.PASS, test.addScreenCapture(CaptureScreenshot(driver))+"ScrollVertical Test Passed");
		
			}catch (Exception e) {
				e.printStackTrace();
				test.log(LogStatus.FAIL, test.addScreenCapture(CaptureScreenshot(driver))+"ScrollVertical Test Failed");
			}	
	}
	
	@Test(priority=3)
	public void CartFunction() throws InterruptedException, IOException, MPException
	{ 
		try {
			   System.out.println("Test Case:3 Started");
			   test.log(LogStatus.INFO, "CartFunction Test Case Started");
			   Thread.sleep(2000);
			   AddIteam addIcon = new AddIteam(driver);
			   addIcon.additeamToCart();
			   addIcon.clickOnCartIcon();
			   Thread.sleep(2000);		   
			   System.out.println("Test Case 3 Done");
			   test.log(LogStatus.PASS, test.addScreenCapture(CaptureScreenshot(driver))+"CartFunction Test Passed");
		
			}catch (Exception e) {
				e.printStackTrace();
				test.log(LogStatus.FAIL, test.addScreenCapture(CaptureScreenshot(driver))+"CartFunction Test Failed");
			}	
	}
	@Test(priority=4)
	public void CheckoutFunction() throws InterruptedException, IOException, MPException
	{ 
		try {
			   System.out.println("Test Case:4 Started");
			   test.log(LogStatus.INFO, "CartFunction Test Case Started");
			   Thread.sleep(2000);
			   CheckOutProcess checkOut = new CheckOutProcess(driver);
			   checkOut.clickonCheckoutItem();
			   checkOut.enterFirstName();
			   checkOut.enterLastName();
			   checkOut.enterZipCode();
			   checkOut.clickonContinueBtn();
			   checkOut.clickonFinishBtn();
			   checkOut.verifyCompletepage();
			   Thread.sleep(5000);
			   
			   System.out.println("Test Case 4 Done");
			   test.log(LogStatus.PASS, test.addScreenCapture(CaptureScreenshot(driver))+"CheckoutFunction Test Passed");
		
			}catch (Exception e) {
				e.printStackTrace();
				test.log(LogStatus.FAIL, test.addScreenCapture(CaptureScreenshot(driver))+"CheckoutFunction Test Failed");
			}	
	}
}
	

