package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Phss_cc_ Purchase Order"                                
               , summary=""
               , connection="QAtest"
               , auraComponent="Phss_cc_PurchaseOrder"
               , namespacePrefix=""
     )             
public class Phss_cc_PurchaseOrder {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Submit Payment']")
	public WebElement submitPayment;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Submit Payment']")
	public WebElement submitPayment1;
	
}
