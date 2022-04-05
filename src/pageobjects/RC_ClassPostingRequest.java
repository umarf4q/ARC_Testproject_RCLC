package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="RC_ClassPostingRequest"                                
, summary=""
, relativeUrl=""
, connection="Admin"
		)             
public class RC_ClassPostingRequest {
	
	WebDriver driver;
	public RC_ClassPostingRequest(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	@TextType()
	@FindBy(xpath = "//div/div/input[@placeholder='search..']")
	public WebElement organization;
	@ButtonType()
	@FindBy(xpath = "//div/li[@role='presentation']/span/span[2]")
	public WebElement organizationList;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='* Course']/following-sibling::div[1]//input")
	public WebElement course;
	@ButtonType()
	@FindBy(xpath = "//button[@name='searchButton']")
	public WebElement search;
	
	@ButtonType()
	@FindBy(xpath = "//div[@data-key='error' and @role='alert']//button[@title='Close']")
	public WebElement closeError;

	@FindBy(xpath = "//div[contains(@class,'cPhss_cc_ProductListComponent_Clone')]/div[contains(@class,'cPhss_cc_ProductDetail_Clone')]")
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
		@ButtonType()
		@FindBy(xpath = "./div/div[3]//button")
		public WebElement select;

	}
	
	@TextType()
	@FindBy(xpath = "(//label[normalize-space(.) = '*Date']/following-sibling::div/input)[last()]")
	public WebElement date;
	
	public void setDate(String startDate) throws InterruptedException{
		date.click();
		Thread.sleep(2000);
		int length = driver.findElements(By.xpath("//lightning-calendar//*[@data-value='"+startDate+"']")).size();
		if (length == 0){
			driver.findElement(By.xpath("//lightning-calendar//button[@title = 'Next Month']")).click();
		}
		driver.findElement(By.xpath("//lightning-calendar//*[@data-value='"+startDate+"']")).click();
		Thread.sleep(2000);		
	}
	
	
	/*@TextType()
	@FindBy(xpath = "//label[normalize-space(.) = '*Start Time']/following-sibling::div//input")
	public WebElement startTime;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.) = '*End Time']/following-sibling::div//input")
	public WebElement endTime;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='zoneSelect']")
	public WebElement timeZone;*/
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Add Session']")
	public WebElement addSession;
	
	@FindBy(xpath = "//div[@class='slds-grid slds-gutters_xxx-small']")
	@PageTable(firstRowContainsHeaders = false, row = AddSession.class)
	public List<AddSession> addSessionTable;
	@PageRow()
	public static class AddSession {
		@TextType()
		@FindBy(xpath = "./div//label[normalize-space(.) = '*Start Time']/following-sibling::div//input")
		public WebElement startTime;
		@TextType()
		@FindBy(xpath = "./div//label[normalize-space(.) = '*End Time']/following-sibling::div//input")
		public WebElement endTime;
		@ChoiceListType()
		@FindBy(xpath = "./div//select[@id='zoneSelect']")
		public WebElement timeZone;

	}

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Site Search']/following-sibling::div//input")
	public WebElement siteSearch;
	@TextType()
	@FindBy(xpath = "//ul//li[@class='slds-listbox__item']//b")
	public WebElement siteSearchList;
	@TextType()
	@FindBy(xpath = "//input[@type='phone']")
	public WebElement phoneForRegistration;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Class Registration Fee']/following-sibling::div/input")
	public WebElement classRegistrationFee;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement next;
	@ButtonType()
	@FindBy(xpath = "//footer//button[normalize-space(.)='Add To Cart']")
	public WebElement addToCart;
	
	


}
