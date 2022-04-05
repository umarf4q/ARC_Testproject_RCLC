package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Sked Full Service Booking Grid"                                
               , summary=""
               , page="skedFullServiceBookingGrid"
               , namespacePrefix=""
               , object=""
               , connection="SB_ARC_Service_Delivery"
     )             
public class skedFullServiceBookingGrid {

	@ChoiceListType()
	@FindBy(xpath = "//label[normalize-space(.)='* Region']/following-sibling::div//select")
	public WebElement region;
	@TextType()
	@FindBy(xpath = "//div[@name='courseCatalog']//div/input")
	public WebElement courseCatalog;
	@TextType()
	@FindBy(xpath = "//div/div[normalize-space(.)='Adult CPR/AED']")
	public WebElement courseCatalogValue;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='* Primary Contact']/following-sibling::div[1]//input")
	public WebElement primaryContact;
	@TextType()
	@FindBy(xpath = "//ul[@role='listbox']/li[@ng-repeat]")
	public WebElement primaryContactValue;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='* Address']/following-sibling::div//input")
	public WebElement address;
	@TextType()
	@FindBy(xpath = "(//ul[@role='listbox' and @class='slds-lookup__list'])[2]/li[@ng-repeat]")
	public WebElement addressValue;
	@TextType()
	@FindBy(xpath = "(//td[@class='arc-calendar-col ng-scope'][1]/div[@ng-click]/div[1])") // (//td[@class='arc-calendar-col ng-scope']/div[@ng-click])[1]
	public WebElement calendarAvailability;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Save & Close']")
	public WebElement saveAndClose;
	@TextType()
	@FindBy(xpath = "//span[contains(text(),'Book Subcontracted Resource')]/../../input[@type='checkbox']")
	public WebElement bookSubcontractedResource;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Show 24 Hours']/../input[@type='checkbox']")
	public WebElement show24Hours;
	
}
