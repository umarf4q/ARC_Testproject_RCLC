package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageFrame;
import com.provar.core.testapi.annotations.TextType;

@Page( title="Global Search"                                
     , summary=""
     , relativeUrl=""
     , connection="QAtest"
     )             
public class GlobalSearch {


WebDriver driver;

public GlobalSearch(WebDriver driver)
{
this.driver = driver;
}

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Search...']")
	public WebElement SearchBox;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'slds-input') and @placeholder='Search...']")
	public WebElement searchTextEnter;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts' and contains(@class,'slds-context-bar__label-action')]")
	public WebElement accounts;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show quick filters']")
	public WebElement ILT_Classes_Filter;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Apply']")
	public WebElement ILT_Classes_Filter_Apply_Button;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View AllVoucher']")
	public WebElement viewAllVoucher;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='User Detail']")
	public WebElement userDetail;
	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Show 2 more »']")
		public WebElement show2More;
		@TextType()
		@FindBy(xpath = "//h3[normalize-space(.)='Permission Set Assignments']")
		public WebElement Permission_Set_Assignments;
	}
	@FindBy(xpath = "//iframe")
	public Frame frame;
	
	@LinkType()
	@FindBy(xpath = "//span[normalize-space() = 'QR Code Web Address']/../following-sibling::div/span//records-formula-output")
	public WebElement QR_Code_Web_Address;
	
	public void ClickQRCode()
	{
	Actions actions = new Actions(driver);
	actions.click(QR_Code_Web_Address).build().perform();
	}

	@TextType()
	@FindBy(xpath = "//input[@placeholder='First Name' and @id='input-0']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@id='input-1']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//input[@id='input-2']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@id='input-3']")
	public WebElement phoneNumber;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='REGISTER & LOGIN']")
	public WebElement rEGISTERAndLOGIN;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='LOGIN' and contains(@class,'slds-button') and @type='button']")
	public WebElement lOGIN;

@TextType()
@FindBy(xpath = "//input[@id='input-90']")
public WebElement search;
@LinkType()
@FindBy(xpath = "//a[starts-with(normalize-space(.),'*VN 00') and contains(@class,'slds-context-bar__label-action') and starts-with(@href,'/lightning/r/Voucher__c/')]")
public WebElement vN005370136;
@TextType()
@FindBy(xpath = "//input[contains(@class,'slds-input') and @placeholder='Search...']")
public WebElement searchbox;
@TextType()
@FindBy(xpath = "//search_lightning-instant-result-item[2]//mark[normalize-space(.)='owen']")
public WebElement _;
@TextType()
@JavascriptBy(jspath = "return document.querySelector('div.cTemplateMainCmp > div.slds-grid.slds-wrap > div:nth-child(2) > div:nth-child(2)')")
public WebElement ClassID;
@TextType()
@FindBy(xpath = "//search_lightning-instant-result-item[4]//lightning-formatted-rich-text/span[normalize-space(.)='Owen Long']")
public WebElement _1;
@TextType()
@FindBy(xpath = "//search_lightning-instant-result-item[2]//span[normalize-space(.)=concat('Jackson O',\"'\",'Brien')]/mark[normalize-space(.)=concat('O',\"'\",'Brien')]")
public WebElement _2;
@LinkType()
@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View MoreContacts']")
public WebElement viewMoreContacts;
@LinkType()
@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[2]/th//a[normalize-space(.)='Owen Long']")
public WebElement SelectAccount;
			
}
