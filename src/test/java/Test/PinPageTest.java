package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;

public class PinPageTest {
     WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver=Browser.openBrowser();
	}
	@Test
	public void loginToZerodhaWithPinTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhaloginPage=new ZerodhLoginPage(driver);
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhaloginPage.enteruserId(username);
		zerodhaloginPage.enterpassword(password);
		zerodhaloginPage.ClickOnLogin();
		//Thread.sleep(3000);
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
		String pin=Parametrization.getData("Data", 2, 1);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
	}
	
	
	
	
	
	
	
}
