package Test;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhLoginPage;
import POM.ZerodhaforgotPage;
import Utility.Parametrization;
import Utility.Screenshot;

public class ForgotPageTest {

	
	WebDriver driver;
	@BeforeMethod
	public void OnBrowser() {
       driver=Browser.openBrowser();
	}
	@Test
	public void forgotPasswordTest() throws EncryptedDocumentException, IOException {
		ZerodhLoginPage zerodhLoginPage=new ZerodhLoginPage(driver);
		zerodhLoginPage.ClickOnforgot();
		ZerodhaforgotPage zerodhaforgotPage=new ZerodhaforgotPage(driver);
		String userid=Parametrization.getData("Data", 5, 1);
		String PAN=Parametrization.getData("Data", 6, 1);
		zerodhaforgotPage.enteruserId(userid);
		zerodhaforgotPage.enterPin(PAN);
		String email=Parametrization.getData("Data", 7, 1);
		zerodhaforgotPage.enterEmail(email);
		zerodhaforgotPage.clickOnReset();
		zerodhaforgotPage.clickOnBack();
	}
	
	
	
	
}
