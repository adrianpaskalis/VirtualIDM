package cobaXML;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testPertama {
		String testUrl; 
		WebDriver driver;
		
	@BeforeTest 
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver88.exe");	
        testUrl = "https://virtual.klikindomaret.com/";
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        // driver.navigate().to(testUrl);
        driver.get(testUrl); 

	}
	
	@Test(priority = 1, groups="HomePage")
	 public void getTitle() {
		 String expectedTitle = "Beli Pulsa Online, Mudah & Aman | KlikIndomaret"; 
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
	} 
	
	@Test (priority = 2 , groups="HomePage")
	public void getLogo() { 
	driver.findElement(By.xpath("//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[1]/div/a[1]/img")); 
	
	}
	
	@Test (priority = 3 , groups="HomePage")
	public void getLinkBantuan() { 
		driver.findElement(By.xpath("//*[@id=\"itemBantuan\"]")).click();		
//driver.findElement(By.linkText("Informasi Call Center"));
		String currentUrl = driver.getCurrentUrl() ;
		Assert.assertTrue(currentUrl.contains("/bantuan/produkvirtual")); 
		driver.navigate().back();
//		driver.get(testUrl);

		//river.findElement(By.xpath())
		//div[3]/div[2]/div[2]/div/div/ul/li[1]
	} 
	
 @Test (priority = 4, groups="HomePage") 
	public void getCustomerCare() {
	driver.findElement(By.linkText("Informasi Call Center")); 
//		String expectedText = "Informasi Call Center : (021) 1500280 customercare@klikindomaret.com";
//		
	} 
	
	@Test (priority = 19, groups="HomePage")
	public void loginWebsite() {
		driver.findElement(By.xpath("//*[@id=\"siteHeader\"]/div[1]/div/div[2]/div[2]/div/div[2]/div/a")).click();
//driver.findElement(By.linkText("Informasi Call Center"));
		String currentUrl = driver.getCurrentUrl() ;
		Assert.assertTrue(currentUrl.contains("/account.klikindomaret.com/?ReturnUrl=https://virtual.klikindomaret.com/")); 
		
		driver.findElement(By.name("Email")).sendKeys("0895634338579"); 
		driver.findElement(By.name("Password")).sendKeys("indomaret");
		String currentURL = driver.getCurrentUrl() ;
		Assert.assertTrue(currentURL.contains("https://virtual.klikindomaret.com/"));
		
//		driver.get(testUrl);

	}
	
	@Test (priority = 5, groups="Homepage")
	public void searchProduk() { 
		driver.findElement(By.xpath("//*[@id=\"searchids\"]"));
		

	}
	
	@Test (priority=6, groups="Homepage") 
	public void categoryPulsa() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[1]"));
	}
	
	@Test (priority=7, groups="Homepage") 
	public void categoryEmoney() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[2]/div/a"));		
		
	} 
	
	@Test (priority=8, groups="Homepage") 
	public void categorySamsat() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[3]/div/a"));		
		
	} 
	
	@Test (priority=9, groups="Homepage") 
	public void categoryPln() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[4]/div/a"));		
		
	} 
	
	@Test (priority=10, groups="Homepage") 
	public void categoryBpjs() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[5]/div/a"));		
		
	} 
	@Test (priority=11, groups="Homepage") 
	public void categoryInternet() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[6]/div/a"));		
		
	} 
	@Test (priority=12, groups="Homepage") 
	public void categoryGame() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[7]/div/a"));		
		
	} 
	
	@Test (priority=13, groups="Homepage") 
	public void categoryStreaming() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[8]/div/a"));		
		
	}
	@Test (priority=14, groups="Homepage") 
	public void categoryGas() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[9]/div/a"));		
		
	} 
	
	@Test (priority=15, groups="Homepage") 
	public void categoryPbb() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[10]/div/a"));		
		
	} 
	
	@Test (priority=16, groups="Homepage") 
	public void categoryPdam() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[11]/div/a"));		
		
	}
	
	@Test (priority=17, groups="Homepage") 
	public void categoryTelkom() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[1]/div[12]/div/a"));		
		
	}
	
	
	@Test (priority=18, groups="Homepage") 
	public void buttonNextCategory() { 
		driver.findElement(By.xpath("//*[@id=\"site-content\"]/div[3]/div[1]/div/div[3]"));		
		
	}
	
	
	@AfterTest 
    public void teardown() throws IOException {

        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
