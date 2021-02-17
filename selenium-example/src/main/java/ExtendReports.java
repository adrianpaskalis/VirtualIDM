import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReports {
			private static String testUrl = null; 
			private static WebDriver driver = null;

	public static void main(String[] args) { 
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter); 
		
		ExtentTest test1 = extent.createTest("input search virtual", "coba aja");
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver88.exe");	
	        testUrl = "https://www.google.com/";
	        driver = new ChromeDriver();
	        //maximize window
	        test1.log(Status.INFO, "Open Browser");
	        driver.manage().window().maximize();
	        // driver.navigate().to(testUrl);
	        test1.pass("navigate to target");
	        driver.get(testUrl); 
	        
	        
	        driver.findElement(By.name("q")).sendKeys("PLN");
	        test1.pass("search success"); 
	        
	      driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	        driver.close();
	        test1.pass("closed the browser"); 
	        
	       
	        
	        driver.quit();
	       test1.pass("quit the browser");
	       
	       //calling flush writes everything to the log file 
	       extent.flush(); 
	        
	}
	        
}
	      
	
	
		
		


	


