package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class integretion {

	 WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium_Lib\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		
		
	}

	@Test
	public void test() {
	
		WebElement Search_box= driver.findElement(By.name("q"));
		   
	    Search_box.sendKeys("car" + Keys.ENTER);
		
	}
		@AfterTest
		
		public void tearUp(){
			
			driver.quit();
		}
}
