package POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaHomePage {

	@FindBy(xpath="//input[@placeholder='Search eg: infy bse, nifty fut, nifty weekly, gold mcx']")private WebElement search;
	@FindBy(xpath="//button[@data-balloon='Buy']")private WebElement buy;
	@FindBy(xpath="//button[@data-balloon='Sell']")private WebElement sell;
	@FindBy(xpath="//span[@class='icon icon-align-center']")private WebElement market;
	@FindBy(xpath="//button[@data-balloon='Chart']")private WebElement chart;
	@FindBy(xpath="//span[@data-balloon='Delete (del)']")private WebElement delete;
	@FindBy(xpath="(//span[text()='TATAMOTORS'])[1]")private WebElement tatamotors;
	@FindBy(xpath="//input[@label='Intraday <span>MIS</span>']")private WebElement intraday;
	@FindBy(xpath="//input[@title='CashNCarry: Longterm investment. Requires full upfront margin.']")private WebElement longteram;
	@FindBy(xpath="//input[@title='Buy at market price']")private WebElement marketprize;//Mo
	@FindBy(xpath="//input[@label='Qty.']")private WebElement quantity;//Quantity field
	@FindBy(xpath="//input[@title='Buy at a preferred price with a stoploss']")private WebElement SL;//SL
	@FindBy(xpath="//input[@title='Buy at market price with stoploss']")private WebElement SLM;//SL-M
	
	@FindBy(xpath="(//input[@type='number'])[3]")private WebElement trigerpeize;
	@FindBy(xpath="(//div[@class='four columns price'])[1]")private WebElement price;
	
//	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement price;
	@FindBy(xpath="//button[@type='submit']")private WebElement buymarket;//Buy click final

	@FindBy(xpath="//label[@class='su-switch-control']")private WebElement buysell;//togleswitch

	public ZerodhaHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void entershare() {
		search.sendKeys("Tatamotors");
	}
	
	public void ClickOntata(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(tatamotors);
		action.click();
		action.perform();
		}
	public void ClickOnbuy(WebDriver driver) throws InterruptedException {
       // Thread.sleep(2000);	
       Actions action=new Actions(driver);
		action.moveToElement(buy);
		action.click();
		action.perform();
	}
	public void ClickOnsell(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(sell);
		act.click();
		act.perform();
	}
	public void ClickOnmarket() {
		market.click();
	}
	public void ClickOnchart() {
		chart.click();
	}
	public void ClickOnintraday(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(intraday);
		action.click();
		action.perform();
	}
	
	public void ClickOnMarketprize(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(marketprize);
		act.click();
		act.perform();
	}
	public void enterQuantity () {
		quantity.sendKeys("2");
	}
	
	public void ClickOnBuyMarket() {
		buymarket.click();
	}
	
	public void ClickOnLongterm(WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(longteram);
		action.click();
		action.perform();	}
	
	
	
	public void Clickonstoploss(WebDriver driver) throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(SL);
		act.click();
		act.moveToElement(quantity);
		act.click();
		act.sendKeys("15");
		Thread.sleep(2000);
		act.moveToElement(price);
		act.click();
		act.sendKeys("380");
		Thread.sleep(2000);
		act.moveToElement(trigerpeize);
		act.click();
		act.sendKeys("360");
		act.perform();
		
		
	}
	
	
	
	
	public void ClickOnBuySell(WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(buysell);
		act.click();
		act.perform();
	}
	
	public void ClickOnDelete() {
		delete.click();
	}
	
	
	
}
