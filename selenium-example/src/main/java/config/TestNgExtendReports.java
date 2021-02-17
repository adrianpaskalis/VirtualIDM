package config;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNgExtendReports {
	
	 ExtentHtmlReporter htmlReporter; 
	   ExtentReports extent;
	   ExtentTest test; 
		String testUrl = null; 
		WebDriver driver =null;  
		public static String browserName = null;
		
	@BeforeSuite
	public void setUp() { 
		
		
		  htmlReporter = new ExtentHtmlReporter("extent_properties.html");
		    
	     // create ExtentReports and attach reporter(s)
	      extent = new ExtentReports();
	     extent.attachReporter(htmlReporter);  

	        //maximize window
	}
	
	@BeforeTest 
	 public void setUpBeforeTest() {
		PropertiesFile.getProperties();	
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver88.exe");	
			driver = new ChromeDriver();

		} else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\browserdrivers\\msedgedriver.exe");	
			driver = new EdgeDriver();
		}
		
	
			testUrl = "https://www.google.com/";
			driver.get(testUrl);
	}
	
	@Test(priority=2)
	public void testCoba() throws Exception {
		 test = extent.createTest("MyFirstTest", "Sample description");
		
		   // log(Status, details)
	        test.log(Status.INFO, "details");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        test.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@Test(priority=1) 
	public void googleSearch() { 
		ExtentTest testt = extent.createTest("input search google", "coba aja");

		testt.log(Status.INFO, "Open Browser");
	        driver.manage().window().maximize();
	        // driver.navigate().to(testUrl);
	        testt.pass("navigate to target");
	        driver.get(testUrl); 
	        
	        
	        driver.findElement(By.name("q")).sendKeys("PLN");
	        testt.pass("search success"); 
	        
	      driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	        driver.close();
	        testt.pass("closed the browser"); 
	     
	}
	
	
	@AfterTest
	public void tearDownTest() {
        driver.manage().deleteAllCookies();
        driver.quit();

      //  System.out.println("Test has been done");

	}
	
	@AfterSuite
	public void tearDown() {
		
		  extent.flush();
	}
}
