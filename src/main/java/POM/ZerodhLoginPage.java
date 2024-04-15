package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhLoginPage {
     @FindBy(xpath="//input[@id='userid']") private WebElement userId;
     @FindBy(xpath="//input[@id='password']") private WebElement password;
     @FindBy(xpath="//button[@type='submit']") private WebElement login;
	 @FindBy(xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	 @FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signup;
	 @FindBy(xpath="//span[text()='User ID should be minimum 6 characters.']")private WebElement geterror;
	public ZerodhLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enteruserId(String user) {
		userId.sendKeys(user);
	}
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	public void ClickOnLogin() {
		login.click();
	}
	public void ClickOnforgot() {
		forgot.click();
	}
	public void ClickOnSignup() {
		signup.click();
	}
	
	public boolean getErrorText() {
		boolean text=geterror.isDisplayed();
      System.out.println(text);
		return text;
		
		
	/*public String getErrorText() {
	String error=geterror.getText();
		System.out.println(error);
		return error;
	*/	
	}
	
	
	
}
