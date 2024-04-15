package POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSerch {
@FindBy(xpath="//span[@class='nice-name']")private List<WebElement> serch;
	

     public ZerodhaSerch(WebDriver driver) {
 		PageFactory.initElements(driver, this);
     }
	
	
	






	
}
