package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="phss_cc_ProductListComponent"                                
               , summary=""
               , connection="SB_ARC_Service_Delivery"
               , auraComponent="phss_cc_ProductListComponent"
               , namespacePrefix=""
     )             
public class phss_cc_ProductListComponent {

	@TextType()
	@AuraBy(componentXPath = "//lightning:input[@value= '{!v.searchQuery}']")
	public WebElement productSearch;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='searchButton']")
	public WebElement submit;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[@name='addToCartButton']")
	public WebElement addToCart;
	
}
