package Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhLoginPage;
import POM.ZerodhaSignupPage;
import Utility.Parametrization;

public class SignupPageTest {

	WebDriver driver;
	@BeforeMethod
	public void BrowserKit() {
		driver=Browser.openBrowser();
	}
	
	@Test
	public void signupLinkTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhLoginPage=new ZerodhLoginPage(driver);
		zerodhLoginPage.ClickOnSignup();
		Thread.sleep(2000);
		Set<String>addres=driver.getWindowHandles();
		Iterator<String>i=addres.iterator();
		String addree=i.next();
		while(i.hasNext())
		{
			String addresss=i.next();
			driver.switchTo().window(addresss);
			String currentTitle=driver.getTitle();
				if(currentTitle.equals("Signup and open a Zerodha trading and demat account online and start investing – Zerodha"))
				{
					ZerodhaSignupPage zerodhaSignupPage=new ZerodhaSignupPage(driver);
					String MobileNo=Parametrization.getData("Data", 10, 1);
					zerodhaSignupPage.enterMobNum(MobileNo);
					zerodhaSignupPage.clickOnContinue();
				}
			
		}
			
			
				
		
	}
	
	
	
}
