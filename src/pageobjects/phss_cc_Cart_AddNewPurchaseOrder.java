package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="phss_cc_Cart_AddNewPurchaseOrder"                                
               , summary=""
               , connection="SB_ARC_Service_Delivery"
               , auraComponent="phss_cc_Cart"
               , namespacePrefix=""
     )             
public class phss_cc_Cart_AddNewPurchaseOrder {

	@TextType()
	@FindBy(xpath = "//input[@name='po_name']")
	public WebElement pOName;
	@TextType()
	@FindBy(xpath = "//input[@name='po_amount']")
	public WebElement originalPOAmount;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Save Payment']/preceding-sibling::input")
	public WebElement savePayment;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit Payment']")
	public WebElement submitPayment;
	
}
