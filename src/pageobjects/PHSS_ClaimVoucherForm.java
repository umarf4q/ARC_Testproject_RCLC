package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="PHSS_ Claim Voucher Form"                                
               , summary=""
               , connection="QAtest"
               , auraComponent="PHSS_ClaimVoucherForm"
               , namespacePrefix=""
     )             
public class PHSS_ClaimVoucherForm {

	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value= '{!v.formWrap.FirstName}']")
	public WebElement firstName;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value= '{!v.formWrap.LastName}']")
	public WebElement lastName;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value= '{!v.formWrap.Email}']")
	public WebElement email;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@value= '{!v.formWrap.Phone}']")
	public WebElement phone;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Enroll Learner' and @type='button']")
	public WebElement enrollLearner;
	
}
