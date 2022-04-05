package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="phss_cc_Cart"                                
               , summary=""
               , connection="SB_ARC_Service_Delivery"
               , auraComponent="phss_cc_Cart"
               , namespacePrefix=""
     )             
public class phss_cc_Cart {

	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='1__item' and @role='tab']")
	@LinkType()
	public WebElement creditCardPaymentOption;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='2__item' and @role='tab']")
	public WebElement invoice;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='3__item' and @role='tab']")
	public WebElement accountBalance;
	@BooleanType()
	@FindBy(xpath = "//input[@name='invoiceOptions' and @value='noPO']")
	public WebElement noPO;
	@BooleanType()
	@FindBy(xpath = "//input[@name='invoiceOptions' and @value='existingPO']")
	public WebElement existingPO;
	@BooleanType()
	@FindBy(xpath = "//input[@name='invoiceOptions' and @value='newPO']")
	public WebElement newPO;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit Payment']")
	public WebElement submitPayment;
	
}
