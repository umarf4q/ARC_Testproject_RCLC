package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Phss_cc_ Cart Item"                                
, connection="SB_ARC_Service_Delivery"
, auraComponent="phss_cc_CartItem"
		)             
public class Phss_cc_CartItem {

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[1]/div[2]/lightning-formatted-text")
	public WebElement name;

	@FindBy(xpath = "//div[@data-aura-class='cPhss_cc_CartItem']/div")
	@PageTable(firstRowContainsHeaders = false, row = CartSummary.class)
	public List<CartSummary> cartSummary;
	@PageRow()
	public static class CartSummary {
		@TextType()
		@FindBy(xpath = ".//div[1]/lightning-formatted-text")
		public WebElement productSKU;
		@TextType()
		@FindBy(xpath = ".//div[2]/lightning-formatted-text")
		public WebElement name;
		@TextType()
		@FindBy(xpath = ".//div[3]/a/lightning-formatted-number")
		public WebElement listPrice;
		@ButtonType()
		@FindBy(xpath = ".//div[7]/div/div[3]/button[@title='Add']")
		public WebElement increaseQuantity;
		@TextType()
		@FindBy(xpath = ".//div[7]/div//span[@data-aura-class='uiOutputNumber']")
		public WebElement quantity;
		@ButtonType()
		@FindBy(xpath = ".//div[7]/div/div[1]/button[@title='Remove']")
		public WebElement decreaseQuantity;
	}
	
	@ButtonType()
	@FindBy(xpath = "//div[@data-aura-class='cPhss_cc_Cart']/button[normalize-space(.)='Update Cart']")
	public WebElement updateCart;
	@ButtonType()
	@FindBy(xpath = "//div[@data-aura-class='cPhss_cc_Cart']/button[normalize-space(.)='Reload Cart']")
	public WebElement reloadCart;
	@TextType()
	@FindBy(xpath = "//div[@data-aura-class='cPhss_cc_CartItem']/../following-sibling::div[1]/div[2]")
	public WebElement subTotal;

}
