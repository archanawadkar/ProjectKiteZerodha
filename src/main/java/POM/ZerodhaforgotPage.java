package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaforgotPage {

	@FindBy(xpath="//input[@placeholder='User ID']")private WebElement userId;
	@FindBy(xpath="//input[@placeholder='PAN']")private WebElement pan;
	@FindBy(xpath="//input[@placeholder='E-mail (as on account)']")private WebElement email;
	@FindBy(xpath="//input[@placeholder='Captcha']")private WebElement captcha;
	@FindBy(xpath="//button[@type='submit']")private WebElement reset;
	@FindBy(xpath="//a[@class='text-xsmall text-light reset-account-button']")private WebElement back;

	
	public ZerodhaforgotPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserId(String Id) {
	  userId.sendKeys(Id);
	}
	public void enterPin(String PAN) {
		pan.sendKeys(PAN);
	}
	public void enterEmail(String Email) {
		email.sendKeys(Email);
	}
	public void entercaptcha(String captha) {
		captcha.sendKeys(captha);
	}
	public void clickOnReset() {
		reset.click();
	}
	public void clickOnBack() {
		back.click();
	}
	
	
	
	
	
	
}
