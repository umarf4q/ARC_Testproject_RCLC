package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="RC_ClassPostingRequestPayment"                                
, summary=""
, relativeUrl=""
, connection="Admin"
		)             
public class RC_ClassPostingRequestPayment {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*First Name']/following-sibling::div[1]//input")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Last Name']/following-sibling::div[1]//input")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Phone Number']/following-sibling::div[1]//input")
	public WebElement phoneNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Email Address']/following-sibling::div[1]//input")
	public WebElement emailAddress;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Card Number']/following-sibling::div[1]//input")
	public WebElement cardNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Exp MM']/following-sibling::div[1]//input")
	public WebElement expMM;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Exp YYYY']/following-sibling::div[1]//input")
	public WebElement expYYYY;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*CVV']/following-sibling::div[1]//input")
	public WebElement cVV;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Street']/following-sibling::div[1]//input")
	public WebElement street;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*City']/following-sibling::div[1]//input")
	public WebElement city;
	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='*State']/following-sibling::div[1]//select")
	public WebElement state;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Zip Code']/following-sibling::div//input")
	public WebElement zipCode;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Make Payment']")
	public WebElement makePayment;
	@TextType()
	@FindBy(xpath = "//td[@class='slds-text-heading_large']/div")
	public WebElement paymentSuccessMessage;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Exit']")
	public WebElement submit;
	@LinkType()
	@FindBy(xpath = "//a/img[contains(@class,'profileIcon')]")
	public WebElement userProfileIcon;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Logout']")
	public WebElement logout;

	@FindBy(xpath = "//div[@class='slds-scrollable--y cPhss_cc_Cart_Clone']/div")
	@PageTable(firstRowContainsHeaders = false, row = CartSummary.class)
	public List<CartSummary> cartSummary;
	@PageRow()
	public static class CartSummary {
		@TextType()
		@FindBy(xpath = "./div/div[1]/lightning-formatted-text")
		public WebElement productSKU;
		@TextType()
		@FindBy(xpath = ".//div/div[2]/lightning-formatted-text")
		public WebElement name;
		@TextType()
		@FindBy(xpath = ".//div/div[3]/lightning-formatted-text")
		public WebElement listPrice;
		@TextType()
		@FindBy(xpath = ".//div/div[4]")
		public WebElement quantity;
		@TextType()
		@FindBy(xpath = ".//div/div[5]/lightning-formatted-number")
		public WebElement extendedPrice;
	}


}
