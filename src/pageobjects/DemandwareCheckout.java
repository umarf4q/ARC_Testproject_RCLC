package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DemandwareCheckout"                                
     , summary=""
     , relativeUrl=""
     , connection="Demandware"
     )             
public class DemandwareCheckout {

	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_billing_billingAddress_email_stdemailAddress']")
	public WebElement studentEmailAddress;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_stdFirstName']")
	public WebElement studentFirstName;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_stdLastName']")
	public WebElement studentLastName;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_billing_billingAddress_addressFields_firstName']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@id='dwfrm_billing_billingAddress_addressFields_lastName']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_billing_billingAddress_addressFields_address1']")
	public WebElement streetAddressOrPOBox;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_billing_billingAddress_addressFields_address2']")
	public WebElement aptSuiteOrBuildingOptional;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_billing_billingAddress_addressFields_postal']")
	public WebElement zipCode;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_billing_billingAddress_addressFields_city']")
	public WebElement city;
	@ChoiceListType()
	//@FindBy(xpath = "//div[@class='custom-select']/select[contains(@name,'states_state')]")
	@FindBy(xpath = "//select[contains(@name,'billingAddress_addressFields_states_state')]")
	public WebElement state;
	@TextType()
	@FindBy(xpath = "//div[@class='custom-select']/select[contains(@name,'states_state')]/following-sibling::div")
	public WebElement stateBox;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'billingphone phone')]")
	public WebElement phoneNumber;
	
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_firstName']")
	public WebElement firstNameShipping;
	@TextType()
	@FindBy(xpath = "//input[@id='dwfrm_singleshipping_shippingAddress_addressFields_lastName']")
	public WebElement lastNameShipping;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_address1']")
	public WebElement streetAddressOrPOBoxShipping;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_address2']")
	public WebElement aptSuiteOrBuildingShipping;
	@TextType()
	@FindBy(xpath = "//select[@name='dwfrm_singleshipping_shippingAddress_addressFields_country']")
	public WebElement countryShipping;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_postal']")
	public WebElement zipCodeShipping;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_addressFields_city']")
	public WebElement cityShipping;
	@ChoiceListType()
	@FindBy(xpath = "//select[contains(@name,'shippingAddress_addressFields_states_state')]")
	public WebElement stateShipping;	
	@TextType()
	@FindBy(xpath = "//input[@name = 'dwfrm_singleshipping_shippingAddress_addressFields_phone']")
	public WebElement phoneNumberShipping;
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//form[@id='dwfrm_singleshipping_shippingAddress']//button[@name='submit']")
	public WebElement placeOrderAndRegister;
	@BooleanType()
	@FindBy(xpath = "//input[@id='is-CREDIT_CARD']")
	public WebElement creditCard;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='CARD NUMBER']/following-sibling::div[1]//input")
	public WebElement cardNumber;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='MONTH']/following-sibling::div[1]//select")
	public WebElement expMonth;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='YEAR']/following-sibling::div[1]//select")
	public WebElement expYear;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='CODE (CVN)']/following-sibling::div[1]//input")
	public WebElement codeCVN;
	@TextType()
	@FindBy(xpath = "//select[contains(@class,'country')]")
	public WebElement country;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'confirmation-message')]/h1")
	public WebElement orderConfirmationMessage;
	@BooleanType()
	@FindBy(xpath = "//input[@id='is-PayPal']")
	public WebElement payPal;
	@LinkType()
	@FindBy(xpath = "//li[contains(@class,'supplies-products')]")
	public WebElement suppliesAndProducts;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//span/a[@alt='Sanitizing & Protection']")
	public WebElement sanitizingAndProtection;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='USE THIS ADDRESS']")
	public WebElement useThisAddress;
	@BooleanType()
	@FindBy(xpath = "//input[@name='dwfrm_singleshipping_shippingAddress_useAsBillingAddress']")
	public WebElement shippingAddress;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Residential']/input[@name='dwfrm_singleshipping_shippingAddress_addressType']")
	public WebElement addressResidential;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//form[@id='dwfrm_singleshipping_shippingAddress']//button[normalize-space(.)='PLACE ORDER']")
	public WebElement placeOrder;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='dwfrm_singleshipping_addressList']")
	public WebElement selectFromSavedAddresses;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_billing_billingAddress_addressFields_Email']")
	public WebElement emailBilling;
			
}
