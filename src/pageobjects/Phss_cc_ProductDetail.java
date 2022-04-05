package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Phss_cc_ Product Detail"                                
, connection="SB_ARC_Service_Delivery"
, auraComponent="phss_cc_ProductDetail"
		)             
public class Phss_cc_ProductDetail {

	@FindBy(xpath = "//div[contains(@class,'slds-m-bottom--large cPhss_cc_ProductListComponent')]/div")
	@PageTable(firstRowContainsHeaders = false, row = ProductSearch.class)
	public List<ProductSearch> productSearch;
	@PageRow()
	public static class ProductSearch {
		@TextType()
		@FindBy(xpath = "./div/div[1]/lightning-formatted-text")
		public WebElement productSKU;
		@TextType()
		@FindBy(xpath = "./div/div[2]/lightning-formatted-text")
		public WebElement name;
		@TextType()
		@FindBy(xpath = "./div/div[3]/lightning-formatted-text")
		public WebElement uOM;
		@TextType()
		@FindBy(xpath = "./div/div[4]/lightning-formatted-number")
		public WebElement price;
		@TextType()
		@FindBy(xpath = "./div/div[6]/div/div[1]/button")
		public WebElement decreaseQuantity;
		@TextType()
		@FindBy(xpath = "./div/div[6]/div/div[2]/span")
		public WebElement quantity;
		@TextType()
		@FindBy(xpath = "./div/div[6]/div/div[3]/button")
		public WebElement increaseQuantity;
	}


}
