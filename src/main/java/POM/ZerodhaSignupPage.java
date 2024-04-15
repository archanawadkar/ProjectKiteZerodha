package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignupPage {

	@FindBy(xpath="//input[@id='user_mobile']")private WebElement yourMobno;
	@FindBy(xpath="//button[@id='open_account_proceed_form']")private WebElement submit;
	@FindBy(xpath="//a[text()='Want to open an NRI account?']")private WebElement openNRIacc;
	
	public ZerodhaSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterMobNum(String mobnum) {
		yourMobno.sendKeys(mobnum);
	}
	public void clickOnContinue() {
		submit.click();
	}
	public void clickOnWantopenAcc() {
		openNRIacc.click();
	}
	
	
	
	
	
	
}
