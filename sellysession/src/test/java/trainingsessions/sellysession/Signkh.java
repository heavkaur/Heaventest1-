package trainingsessions.sellysession;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.testng.annotations.AfterMethod;

public class Signkh {
  @Test
  public void f() {
	  WebElement emailfields=driver.findElement(By.name("email"));
	  emailfields.sendKeys("pebbles@gmail.com");	
	  WebElement psswrdfields=driver.findElement(By.name("pass"));
	  psswrdfields.sendKeys("pleasegivepsswrd");
			  
  }
  @BeforeMethod
  public void beforeMethod() {
	  Ibrowsers("Edge");
	
		driver.get("https://www.facebook.com"); 
		driver.manage().window().maximize();
  }
   public void Ibrowser(String browser) {
  if(browser.equalsIgnoreCase("Chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\zolot\\eclipse-workspace\\sellysession\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
  }else if (browser.equalsIgnoreCase("Edge")) {
	  System.setProperty("webdriver.edge.driver", "C:\\Users\\zolot\\eclipse-workspace\\sellysession\\Drivers\\msedgedriver.exe")
      driver=new EdgeDriver();
	  
  }else {
  System.out.println("Name of browser didn't exist ")
  
	  
  }
  
  
  
  @AfterMethod
  public void afterMethod() {
	  
		
  }

}
