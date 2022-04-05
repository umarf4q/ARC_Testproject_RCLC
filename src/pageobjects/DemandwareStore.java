package pageobjects;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DemandwareStore"                                
, summary=""
, relativeUrl=""
, connection="Demandware"
		)             
public class DemandwareStore {

	@TestLogger
	Logger testLogger;
	
	WebDriver driver;
	public DemandwareStore(WebDriver driver) {
		this.driver = driver;
	}
	
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='FIND A CLASS']")
	public WebElement findAClass;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//nav[@id='navigation']//li[normalize-space(.)='First Aid']")
	public WebElement firstAid;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//nav[@id='navigation']//li[normalize-space(.)='BLS/CPR for Healthcare']")
	public WebElement blsCprForHealthcare;
	@TextType()
	@FindBy(xpath = "//nav[@id='navigation']//input[@name='zip']")
	public WebElement location;
	@ButtonType()
	@FindBy(xpath = "//nav[@id='navigation']//form/div/button")
	public WebElement submit;

	@FindBy(xpath = "//ul[@id='search-result-items'][1]/li")
	@PageTable(firstRowContainsHeaders = false, row = SearchResults.class)
	public List<SearchResults> courseSearchResults;
	@PageRow()
	public static class SearchResults {
		@TextType()
		@FindBy(xpath = ".//div[@class='class-wrapper']/div[3]//a[@class='class-name']")
		public WebElement courseName;
		@TextType()
		@FindBy(xpath = ".//div[@class='class-wrapper']/div[2]/div[1]/div/span")
		public WebElement mode;
		@TextType()
		@FindBy(xpath = ".//div[@class='class-wrapper']/div[2]/div[2]/div/span")
		public WebElement salesPrice;
		@TextType()
		@FindBy(xpath = ".//div[@class='class-wrapper']/div[4]/div[@class='class-sign-up']//button")
		public WebElement signMeUp;
	}
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Course Format']")
	public WebElement courseFormat;
	@LinkType()
	@FindBy(xpath = "//div[@class='heading-onlineclass' and normalize-space()='online']")
	public WebElement online;
	@LinkType()
	@FindBy(xpath = "//div[@class='heading-onlineclass' and normalize-space()='Classroom']")
	public WebElement classroomMode;
	@LinkType()
	@FindBy(xpath = "//div[@class='heading-onlineclass' and normalize-space()='Online + Classroom']")
	public WebElement classroomAndOnlineMode;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='APPLY']")
	public WebElement apply;
	@PageWaitAfter.Field(field = "checkout", timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//div[@id='mini-cart']/div/a[@title='View Cart']")
	public WebElement cart;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 90)
	@PageWait.Field(timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='CHECKOUT']")
	public WebElement checkout;
	@PageWaitAfter.Field(field = "sanitizingAndProtection", timeoutSeconds = 10)
	@LinkType()
	@FindBy(xpath = "//li[contains(@class,'supplies-products')]")
	public WebElement suppliesAndProducts;
	@LinkType()
	@FindBy(xpath = "//span/a[@alt='Sanitizing & Protection']")
	public WebElement sanitizingAndProtection;	
	@LinkType()
	@FindBy(xpath = "//span/a[@alt='Training Supplies']")
	public WebElement trainingSupplies;
	@LinkType()
	@FindBy(xpath = "//a[@alt='AED Trainers & Pads']")
	public WebElement aEDTrainerAndPads;
	@LinkType()
	@FindBy(xpath = "//a[@alt='Disaster Preparedness']")
	public WebElement disasterPreparedness;
	@LinkType()
	@FindBy(xpath = "//a[@alt='Hurricane Preparedness']")
	public WebElement hurricanePreparedness;
	@LinkType()
	@FindBy(xpath = "//a[@alt='Apparel & Accessories']")
	public WebElement apparelAndAccessories;
	@LinkType()
	@FindBy(xpath = "//a[@alt='Shirts']")
	public WebElement shirts;
	
	public void selectProductCategory(){
		
		int count = 0;
		testLogger.info("Getting all Product Categories");
		//List<WebElement> lst = driver.findElements(By.xpath("//div/ul/li[@id='main-1'][last()]/div/ul[@class='menu-horizontal menu-category ltws']/li"));
		List<WebElement> lst = driver.findElements(By.xpath("//li[contains(@class,'submenu anchoring-class')]/span[@class='mobile-grouping']/a[contains(@href,'https://development-shop-arc.demandware.net/s/RedCross/store')]"));
		count = lst.size();
		testLogger.info("Total categories = "+count);
		int randomNum = ThreadLocalRandom.current().nextInt(1, count);
		WebElement category = driver.findElement(By.xpath("(//li[contains(@class,'submenu anchoring-class')]/span[@class='mobile-grouping']/a[contains(@href,'https://development-shop-arc.demandware.net/s/RedCross/store')])["+randomNum+"]"));
		testLogger.info("Selecting "+randomNum +": "+category.getText()+" category");
		category.click();
		testLogger.info("Category Selected");
		
	}


}
