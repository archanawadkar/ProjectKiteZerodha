package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhLoginPage;
import POM.ZerodhaHomePage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;
import Utility.Screenshot;

public class HomePageTest {
   WebDriver driver;
	@BeforeMethod
	public void Browswe() {
		driver=Browser.openBrowser();
	}
	@Test
	public void LoginToZerodhaHomeTest() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhLoginPage=new ZerodhLoginPage(driver);
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhLoginPage.enteruserId(username);
		zerodhLoginPage.enterpassword(password);
		zerodhLoginPage.ClickOnLogin();
		
		Thread.sleep(2000);
		
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
		String pin=Parametrization.getData("Data", 2, 1);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
		
		Thread.sleep(2000);
		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
		zerodhaHomePage.entershare();
		zerodhaHomePage.ClickOntata(driver);
        zerodhaHomePage.ClickOnbuy(driver);
       
       Thread.sleep(2000);
        zerodhaHomePage.ClickOnintraday(driver);
     //   Thread.sleep(1000);
     //   zerodhaHomePage.ClickOnBuySell(driver);
        zerodhaHomePage.ClickOnMarketprize(driver);
        Thread.sleep(2000);
   //     zerodhaHomePage.enterNum();
        
        zerodhaHomePage.ClickOnBuyMarket();
        Thread.sleep(2000);
     //   zerodhaHomePage.ClickOnchart();
        
    //    Screenshot screenshot=new Screenshot();
    //    screenshot.teakeScreenShot(driver,1);
	}
	@Test
	public void ClickOnThebuy() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhLoginPage=new ZerodhLoginPage(driver);
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhLoginPage.enteruserId(username);
		zerodhLoginPage.enterpassword(password);
		zerodhLoginPage.ClickOnLogin();
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
		String pin=Parametrization.getData("Data", 2, 1);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
		Thread.sleep(2000);
		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
		zerodhaHomePage.entershare();
		zerodhaHomePage.ClickOntata(driver);
        zerodhaHomePage.ClickOnbuy(driver);
		Thread.sleep(2000);
		zerodhaHomePage.ClickOnLongterm(driver);
		Thread.sleep(2000);
		zerodhaHomePage.Clickonstoploss(driver);
		zerodhaHomePage.ClickOnBuyMarket();
		
		
	}
	@Test
	public void ClickOnTheSell() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhLoginPage=new ZerodhLoginPage(driver);
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhLoginPage.enteruserId(username);
		zerodhLoginPage.enterpassword(password);
		zerodhLoginPage.ClickOnLogin();
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
		String pin=Parametrization.getData("Data", 2, 1);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
		Thread.sleep(2000);
		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
		zerodhaHomePage.entershare();
		zerodhaHomePage.ClickOntata(driver);
        zerodhaHomePage.ClickOnsell(driver);
		
	}
	@Test

	public void ClickOnGraph() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhLoginPage=new ZerodhLoginPage(driver);
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhLoginPage.enteruserId(username);
		zerodhLoginPage.enterpassword(password);
		zerodhLoginPage.ClickOnLogin();
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
		String pin=Parametrization.getData("Data", 2, 1);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
		Thread.sleep(2000);
		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
		zerodhaHomePage.entershare();
		zerodhaHomePage.ClickOntata(driver);
		zerodhaHomePage.ClickOnchart();
		
		
	}
	
	@Test
	public void DeleteTheShare() throws EncryptedDocumentException, IOException, InterruptedException {
		ZerodhLoginPage zerodhLoginPage=new ZerodhLoginPage(driver);
		String username=Parametrization.getData("Data", 0, 1);
		String password=Parametrization.getData("Data", 1, 1);
		zerodhLoginPage.enteruserId(username);
		zerodhLoginPage.enterpassword(password);
		zerodhLoginPage.ClickOnLogin();
		ZerodhaPinPage zerodhaPinPage=new ZerodhaPinPage(driver);
		String pin=Parametrization.getData("Data", 2, 1);
		zerodhaPinPage.enterPin(pin,driver);
		zerodhaPinPage.clickOnContinue();
		Thread.sleep(2000);
		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
		zerodhaHomePage.entershare();
		zerodhaHomePage.ClickOntata(driver);
		Thread.sleep(2000);
		zerodhaHomePage.ClickOnDelete();
	}
	
	
	
	
	
	
}
