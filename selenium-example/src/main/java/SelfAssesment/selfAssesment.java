package SelfAssesment;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class selfAssesment { 
	String testUrl; 
	WebDriver driver;

	
	@BeforeTest 
	public void startApp() {
		System.setProperty("webdriver.chrome.driver", "D:\\browserdrivers\\chromedriver88.exe");	
        testUrl = "https://docs.google.com/forms/d/e/1FAIpQLSf81P9SHg3xSXJgltsI5uyFVfxB6_U4pXwJdzG9OMg1l2hY4A/viewform";
        
        driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        // driver.navigate().to(testUrl);
        driver.get(testUrl); 
	} 
	
	@Test(priority=1, groups="1stPage")
	public void selectMagang() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div/div/div/div[2]/div/div/span/div/div[3]/label/div/div[2]/div/span")).click();
	} 
	
	@Test(priority=2, groups="1stPage") 
	public void buttonNext() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div/div/span")).click();
		String currentUrl = driver.getCurrentUrl(); 
		Assert.assertTrue(currentUrl.contains("https://docs.google.com/forms/d/e/1FAIpQLSf81P9SHg3xSXJgltsI5uyFVfxB6_U4pXwJdzG9OMg1l2hY4A/formResponse"));
		
	}

	@Test(priority=3, groups="2ndPage") 
	public void isiNama() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("adrian paskalis");
			
	}
	
	@Test(priority=4, groups="2ndPage")
	public void isiKtp() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("3603281311980003");
	}
	
	
	@Test(priority=5, groups="2ndPage")
	public void isiNoHp() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[4]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("0895634338579");
		
	}
	 
	@Test(priority=6, groups="2ndPage")
	public void isiDepartemen() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[5]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("IT Ecommerce");
	
	}
	
	@Test(priority=6, groups="2ndPage")
	public void isiNamaAtasan() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[6]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Himawan Djaja");
		
	} 
	
	@Test(priority=7, groups="2ndPage")
	public void isiNoHpAtasan() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[7]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("081319332818");
	} 
	
	@Test(priority=8, groups="2ndPage")
	public void goTo3rdPage() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div/div[2]/span")).click();
		String currentUrl = driver.getCurrentUrl(); 
		Assert.assertTrue(currentUrl.contains("https://docs.google.com/forms/d/e/1FAIpQLSf81P9SHg3xSXJgltsI5uyFVfxB6_U4pXwJdzG9OMg1l2hY4A/formResponse"));
	}
	
	@Test(priority=9, groups="3rdPage")
	public void pickBerpergian() {
		driver.findElement(By.xpath("//*[@id=\"i8\"]/div[3]/div")).click();
	} 
	
	@Test(priority=10, groups="3rdPage")
	public void isiBerpergian(){
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div[1]/div/div[1]/input")).sendKeys("-");
	}
	
	@Test(priority=11, groups="3rdPage")
	public void pickTransportasi() {
		driver.findElement(By.xpath("//*[@id=\"i22\"]/div[3]/div")).click();
	}
	
	
	@Test(priority=12, groups="3rdPage")
	public void pickKegiatan() {
		driver.findElement(By.xpath("//*[@id=\"i32\"]/div[3]")).click();
	} 
	
	@Test(priority=13, groups="3rdPage")
	public void pickKasus() {
		driver.findElement(By.xpath("//*[@id=\"i42\"]/div[3]")).click();
	} 
	
	@Test(priority=14, groups="3rdPage")
	public void goTo4thPage() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div/div[2]/span")).click();
		String currentUrl = driver.getCurrentUrl(); 
		Assert.assertTrue(currentUrl.contains("https://docs.google.com/forms/d/e/1FAIpQLSf81P9SHg3xSXJgltsI5uyFVfxB6_U4pXwJdzG9OMg1l2hY4A/formResponse"));
	
	}
	
	
	@Test(priority=15, groups="4thPage")
	public void pickTidak() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[2]/span/div[3]/div/div/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[4]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[6]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[8]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[10]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[12]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[14]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[16]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[18]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[20]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[22]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[24]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[26]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[28]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[30]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[32]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[2]/div[2]/div/div/div[2]/div/div[1]/div/div[34]/span/div[3]/div/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"i12\"]/div[3]/div")).click(); 
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div/div[2]/span")).click();
		String currentUrl = driver.getCurrentUrl(); 
		Assert.assertTrue(currentUrl.contains("https://docs.google.com/forms/d/e/1FAIpQLSf81P9SHg3xSXJgltsI5uyFVfxB6_U4pXwJdzG9OMg1l2hY4A/formResponse"));
	
	}

	
	
	@Test(priority=16, groups="5thPage")
	public void submitPage() {
		driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div/div[3]/div[1]/div/div[2]/span")).click();
	}
	

	@AfterTest
	public void closeApp() {
		driver.manage().deleteAllCookies();
		driver.quit();
		
	}
}
