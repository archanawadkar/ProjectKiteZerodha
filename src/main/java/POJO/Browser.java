package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static WebDriver openBrowser () {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
	//	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);//Implicit wait
		return driver;
	}
	
	
	
	
	
	
	
}
