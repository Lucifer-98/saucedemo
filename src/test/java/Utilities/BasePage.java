package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BasePage {
	public static WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
	public String testName= this.getClass().getSimpleName();
	public String sheetName = "Data";
	
	@BeforeTest
	public WebDriver launchSite() throws Exception {
		try {
					System.out.println(testName);
					System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				    ChromeOptions options = new ChromeOptions();
					driver = new ChromeDriver(options);
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
					report = new ExtentReports("./report/report.html", true);
					test = report.startTest(testName);
					driver.get("https://www.saucedemo.com/");

				}catch (Exception e) {
					System.out.println("Exception while launchSite(): "+e);
					e.printStackTrace();
				}
				return driver;
			}

	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		report.endTest(test);
		report.flush();
	}
	
	public static String CaptureScreenshot(WebDriver driver) throws IOException{
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destFile = new File("src/../images"+System.currentTimeMillis()+".png");
		String absoultepath_screen = destFile.getAbsolutePath();
		FileUtils.copyFile(srcFile, destFile);
		return absoultepath_screen;
				
	}
	
	
	
}
