package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Report;

import POJO.Browser;
import POM.ZerodhLoginPage;
import POM.ZerodhaforgotPage;
import Utility.Parametrization;
import Utility.Screenshot;
 @Listeners(TestListeners.class)
public class LoginPageTest extends BaseTest{
     ExtentReports reports;
	 ExtentTest test;
	 
	@BeforeTest
	public void extentReports() {
		reports=Utility.Report.createReport();
	}
	 
	 
	 
	@BeforeMethod
	public void browser() {
		driver=Browser.openBrowser();
	}
	
	@Test(timeOut=1000)
	public void loginWithValidCredentialsTest() throws EncryptedDocumentException, IOException, InterruptedException {
        test=reports.createTest("loginWithValidCredentialsTest");
		ZerodhLoginPage zerodhaLoginPage=new ZerodhLoginPage(driver);
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhaLoginPage.enteruserId(username);
		zerodhaLoginPage.enterpassword(password);
		zerodhaLoginPage.ClickOnLogin();
	}
	@Test(dependsOnMethods= {"loginWithValidCredentialsTest"})
	public void forgotPasswordLinkTest() throws EncryptedDocumentException, IOException {
        test=reports.createTest("forgotPasswordLinkTest");

		ZerodhLoginPage zerodhaLoginPage=new ZerodhLoginPage(driver);
		zerodhaLoginPage.ClickOnforgot();
		ZerodhaforgotPage zerodhaforgotPage=new ZerodhaforgotPage(driver);
		String userid=Parametrization.getData("Data", 5, 1);
		String PAN=Parametrization.getData("Data", 6, 1);
		zerodhaforgotPage.enteruserId(userid);
		zerodhaforgotPage.enterPin(PAN);
		String email=Parametrization.getData("Data", 7, 1);
		zerodhaforgotPage.enterEmail(email);
		zerodhaforgotPage.clickOnReset();
		//zerodhaforgotPage.clickOnBack();
		
		
	}
	@Test
	public void signupLinkTest() {
        test=reports.createTest("signupLinkTest");

		ZerodhLoginPage zerodhaLoginPage=new ZerodhLoginPage(driver);
		zerodhaLoginPage.ClickOnSignup();
		
	}
	@Test
	public void clickOnLoginWithoutDataTest() throws EncryptedDocumentException, IOException, InterruptedException {
        test=reports.createTest("clickOnLoginWithoutDataTest");

		ZerodhLoginPage zerodhaLoginPage=new ZerodhLoginPage(driver);
		zerodhaLoginPage.ClickOnLogin();
		
		boolean text=zerodhaLoginPage.getErrorText();
			String expectedText="User ID should be minimum 6 character.";
		//	Assert.assertEquals(text,expectedText);
		

		
	/*	String text=zerodhaLoginPage.getErrorText();
		String expectedText="User ID should be minimum 6 characters";
	*/	
		
	//	Assert.assertEquals(text, expectedText);//Hard assert,equals asert then proced to next other not 
	//	SoftAssert softAssert=new SoftAssert();
	//	softAssert.assertEquals(text, expectedText);//soft assert,equals or notequals proced to next stage
		if(text==true) {
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhaLoginPage.enteruserId(username);
		zerodhaLoginPage.enterpassword(password);
		zerodhaLoginPage.ClickOnLogin();
		}
		else {
			System.out.println("not displayed");
		}
	//	softAssert.assertAll();//show the asertion error that ocure at the instance 
	//	Thread.sleep(2000);
		
	//	Screenshot screenshot=new Screenshot();
	//	screenshot.teakeScreenShot(driver, 1);
	}
	@AfterMethod
	public void closeBrowser(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getName());
			
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getName());
		}
		else {
			test.log(Status.SKIP, result.getName());
		}
		
		
		
	}
	
	@AfterTest
	public void flushResult() {
		reports.flush();
		
		
	}
	
	
	
	
	
}
