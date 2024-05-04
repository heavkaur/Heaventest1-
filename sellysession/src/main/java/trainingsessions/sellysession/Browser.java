package trainingsessions.sellysession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Browser {
static	WebDriver driver;
	
 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\zolot\\eclipse-workspace\\sellysession\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.navigate().to("https://www.apple.com");
		
		driver.get("https://lucyblossoms.com");
		
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.navigate().back();
		
		
		Thread.sleep(6000);
		driver.navigate().forward();
		Thread.sleep(6000);
		String Title=driver.getTitle();
		String CurrentURL=driver.getCurrentUrl();
		String Session=driver.getWindowHandle();
		System.out.println(Title);
		System.out.println(CurrentURL);
		System.out.println(Session);
		//driver.close();
		
		
		
	}

}
