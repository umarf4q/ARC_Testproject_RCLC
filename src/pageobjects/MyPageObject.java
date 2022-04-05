package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.BooleanType;
import com.provar.core.testapi.annotations.ButtonType;
import com.provar.core.testapi.annotations.ChoiceListType;
import com.provar.core.testapi.annotations.ChoiceListValue;
import com.provar.core.testapi.annotations.FacetFindBy;
import com.provar.core.testapi.annotations.FacetFindBys;
import com.provar.core.testapi.annotations.FindByLabel;
import com.provar.core.testapi.annotations.JavascriptBy;
import com.provar.core.testapi.annotations.LinkType;
import com.provar.core.testapi.annotations.Page;
import com.provar.core.testapi.annotations.PageFrame;
import com.provar.core.testapi.annotations.PageRow;
import com.provar.core.testapi.annotations.PageTable;
import com.provar.core.testapi.annotations.TextType;
import java.util.List;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="QAtest"
     )             
public class MyPageObject {

	@ButtonType()
	public WebElement cOURSERECORDENTRY;
	@TextType()
	@FindBy(xpath = "//div[6]//div[2]/input[@placeholder='search..']")
	public WebElement _;
	@TextType()
	@FindBy(xpath = "//div[@id='modal-content-id-1']/div/div/div/input")
	public WebElement _1;
	@ButtonType()
	@FindBy(xpath = "//button[@name='searchButton']")
	public WebElement search;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Sertified.PO Box 57, Chester, MD 21619']/div")
	public WebElement Sertified_;
	@FindBy(xpath = "//div[1]/div/div[3]/div/div/button[normalize-space(.)='Select']")
	@ButtonType()
	public WebElement select;
	@TextType()
	@FindBy(xpath = "//input[@id='input-112']")
	public WebElement courseStartingDate;
	@TextType()
	@FindBy(xpath = "(//div[@class = 'slds-form-element__control slds-input-has-icon slds-input-has-icon_right'])[2]/input")
	public WebElement courseEndingDate;
	@TextType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[9]/div[3]/lightning-input/div[1]")
	public WebElement totalNumberOfStudents;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('div.slds-m-around_x-small > div > div > div > div.slds-show > input')")
	public WebElement _2;
	@TextType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[14]/div/div[1]/div/div/div/div")
	public WebElement _3;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//input[@name='first_name1']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@id='input-4833']")
	public WebElement lastName;
	@ChoiceListType(values = { @ChoiceListValue(value = "Select an Option"), @ChoiceListValue(value = "Successful"), @ChoiceListValue(value = "Unsuccessful"), @ChoiceListValue(value = "Not Evaluated") })
	@FindBy(xpath = "//select[@name='evaluation1']")
	public WebElement renderFacet888921A;
	@TextType()
	@FindBy(xpath = "//input[@id='input-4837']")
	public WebElement firstName1;
	@TextType()
	@FindBy(xpath = "//input[@id='input-4838']")
	public WebElement lastName1;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='evaluation2']")
	public WebElement renderFacet1588921A;
	@BooleanType()
	@FindBy(xpath = "//lightning-input//label/span[contains(@class,'slds-checkbox_faux')]")
	public WebElement check1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Invoice']")
	public WebElement ___item;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit Payment']")
	public WebElement submitPayment;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit']")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//div[6]//div[2]/input")
	public WebElement OrganizationOptions;
	@TextType()
	@FindBy(xpath = "(//div[@class= 'slds-form-element__control slds-input-has-icon slds-input-has-icon_right'])[1]/input")
	public WebElement courseStartingDate1;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='* Instructor']")
	public WebElement Instructor;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='COURSE RECORD ENTRY']")
	public WebElement cOURSERECORDENTRY1;
	@TextType()
	@FindBy(xpath = "//div[2]//select")
	public WebElement SelectInstructor;
	@TextType()
	@FindBy(xpath = "//b[normalize-space(.)='The YMCA in Chestertown']")
	public WebElement SelectSite;
	@TextType()
	@FindBy(xpath = "//input[@id='input-90']")
	public WebElement search1;
	@TextType()
	@FindBy(xpath = "//search_lightning-instant-result-item[2]//span[normalize-space(.)='Contact • The Owen Long Account']/mark[normalize-space(.)='Owen']")
	public WebElement _4;
	@TextType()
	@FindBy(xpath = "//search_lightning-instant-result-item[2]//span[normalize-space(.)='Owen Long']/mark[normalize-space(.)='Long']")
	public WebElement _5;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Search...']")
	public WebElement search2;
	@TextType()
	@FindBy(xpath = "//input[@class='slds-input' and @placeholder='Search Accounts and more...']")
	public WebElement GlobalSearch;
	@TextType()
	@FindBy(xpath = "//search_lightning-instant-result-item[2]//span[normalize-space(.)='Contact • The Owen Long Account']")
	public WebElement _6;
	@TextType()
	@FindBy(xpath = "//input[@name='total_number_of_students']")
	public WebElement totalnumberofstudents;
	@TextType()
	@FindBy(xpath = "//div[@id='modal-content-id-1']/div/div/div/div/div/div/div/div/input[@placeholder='search..']")
	public WebElement SiteSearch;
	@TextType()
	@FindBy(xpath = "//input[@name='last_name1']")
	public WebElement lastName11;
	@TextType()
	@FindBy(xpath = "//input[@name='first_name2']")
	public WebElement firstName2;
	@TextType()
	@FindBy(xpath = "//input[@name='last_name2']")
	public WebElement lastName2;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('div.uiPopupTrigger.selfServiceProfileMenuTrigger > div > div > a')")
	public WebElement owenLong;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Logout']")
	public WebElement logout;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Show more actions' and @role='button']")
	public WebElement showMoreActions;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@name='LoginToNetworkAsUser']")
	public WebElement logInToExperienceAsUser;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Upload CSV']")
	public WebElement uploadCSV;
	@TextType()
	@FindBy(xpath = "//input[@name='first_name3']")
	public WebElement firstName3;
	@TextType()
	@FindBy(xpath = "//input[@name='last_name3']")
	public WebElement lastName3;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='evaluation3']")
	public WebElement renderFacet2285895A;
	@ChoiceListType()
	@FindBy(xpath = "//select[@name='evaluation_reason3']")
	public WebElement renderFacet2575895A;
	@LinkType()
	@FindBy(xpath = "//a[@id='class-history__item']")
	public WebElement classHistory;
	@TextType()
	@FindBy(xpath = "//button[normalize-space(.)='CLASSES']/lightning-icon/lightning-primitive-icon")
	public WebElement cLASSES;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)=concat('CLASSES I',\"'\",'M TEACHING')]")
	public WebElement cLASSESIMTEACHING;
	@PageFrame()
	public static class Frame {

		@ChoiceListType(values = { @ChoiceListValue(value = "", title = "Select an Organization"),
				@ChoiceListValue(value = "001d000000wE122AAC", title = "Maryland Park Service"),
				@ChoiceListValue(value = "0010V00002NuadLQAR", title = "Sertified."),
				@ChoiceListValue(value = "0010V00002Rbl9bQAB", title = "The Owen Long Account") })
		@FindBy(xpath = "//div[1]/div/div/div/select")
		public WebElement SelectOrg;
		@ChoiceListType()
		@FindBy(xpath = "//div[2]//select")
		public WebElement SelectInstructor;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Learn-to-Swim Level 1 - Introduction to Water Skills']")
		public WebElement SelectCourse;
		@TextType()
		@FindBy(xpath = "//tr[1]//div[normalize-space(.)='Acquired']")
		public WebElement Student1Status;
		@LinkType()
		@FindBy(xpath = "//a[@id='class-history__item']")
		public WebElement classHistory;
		@TextType()
		@FindBy(xpath = "//div[normalize-space(.)='Failed written exam']")
		public WebElement UnsuccessfullStudentReason;
		@ChoiceListType()
		@FindBy(xpath = "//div[1]/div/div/div/select")
		public WebElement SelectOrganization;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Adult CPR/AED - BL']")
		public WebElement firstAidCPRAEDInstructorBL;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Show 2 more »']")
		public WebElement show2More;
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Print']")
		public WebElement print;
		@TextType()
		@FindBy(xpath = "//div[normalize-space(.)='NAME']")
		public WebElement StudentResultsNameField;
		@LinkType()
		@FindBy(xpath = "//a[@id='class-history__item']")
		public WebElement classHistory1;
	}
	@FindBy(xpath = "//iframe[contains(@id,'vfFrameId_')]")
	public Frame frame;
	@TextType()
	@FindBy(xpath = "//div[@id='ServiceCommunityTemplate']/div/div/div/div/div/div/div/div/div/div/div[normalize-space(.)='09/06/2021' and contains(@class,'header-item-field-content')]")
	public WebElement VerifyStartDate;
	@TextType()
	@FindBy(xpath = "//div[@id='ServiceCommunityTemplate']/div/div/div/div/div/div/div/div/div/div/div[normalize-space(.)='09/07/2021']")
	public WebElement VerifyEndDate;
	@TextType()
	@FindBy(xpath = "//div[@id='phssTab1']//div[normalize-space(.)='Maryland Park Service']")
	public WebElement VerifyOrgnization;
	@TextType()
	@FindBy(xpath = "//div[5]//lightning-formatted-text[normalize-space(.)='Completed']")
	public WebElement VerifyStatus;
	@TextType()
	@FindBy(xpath = "//*[@id=\"phssTab1\"]/div/div[1]/div[2]/div[7]/div[2]")
	public WebElement VerifyNumberOfStudents;
	@TextType()
	@FindBy(xpath = "//div/div[normalize-space(.)='Severna Park Community Center']")
	public WebElement VerifySite;
	@LinkType()
	@FindBy(xpath = "//a[@id='phssTab2__item']")
	public WebElement students;
	@TextType()
	@FindBy(xpath = "//div[@id='phssTab2']/div/div")
	public WebElement VerifyStudentTab;
	@LinkType()
	@FindBy(xpath = "//a[@id='phssTab3__item']")
	public WebElement materials;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='There are no materials']")
	public WebElement VerifyMaterialsTab;
	@LinkType()
	@FindBy(xpath = "//a[@id='phssTab4__item']")
	public WebElement studentVouchers;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='SIGNUP URL']")
	public WebElement VerifyStudentVouchersTab;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='VOUCHER #']")
	public WebElement VerifyStudentVoucherTab;
	@LinkType()
	@FindBy(xpath = "//a[@id='phssTab5__item']")
	public WebElement studentResults;
	@PageFrame()
	public static class Frame1 {

		@TextType()
		@FindBy(xpath = "//div[normalize-space(.)='Failed written exam']")
		public WebElement UnsuccessfullStudentReason;
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/PHSS_GeneratePDF?Id=a652C000000F3XeQAK')]")
	public Frame1 frame1;
	@PageFrame()
	public static class Frame2 {

		@TextType()
		@FindBy(xpath = "//div[normalize-space(.)='Failed written exam']")
		public WebElement UnsuccessfullStudentReason;
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/PHSS_GeneratePDF?Id=a652C000000F3arQAC')]")
	public Frame2 frame2;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Accounts']")
	public WebElement accountContactRelations;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab__item']")
	public WebElement orderItems;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Shipped']//lightning-primitive-custom-cell/lightning-formatted-text")
	public WebElement ccrz__OrderItemStatus__c;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Basic Water Rescue Challenge']")
	public WebElement ccrz__Product__c;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab2__item']")
	public WebElement courseDetails;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='customTab3__item']")
	public WebElement payment;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='po']//lightning-primitive-custom-cell/lightning-formatted-text")
	public WebElement ccrz__AccountType__c;
	@ButtonType(file=true)
	@FindBy(xpath = "(//input[@type='file'])[1]")
	public WebElement UploadFile;
	@BooleanType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[8]/div[1]")
	public WebElement CheckboxStudentSuccess;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='relatedListsTab__item']")
	public WebElement related;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Training']//lightning-primitive-custom-cell/lightning-formatted-text")
	public WebElement Type__c;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Learn-to-Swim Level 1 - Introduction to Water Skills' and contains(@class,'displayLabel')]")
	public WebElement ILTClass;
	@ButtonType()
	@JavascriptBy(jspath = "return document.querySelector('div:nth-child(3) > div:nth-child(1) > button')")
	public WebElement rEQUESTBLENDEDCLASS;
	@TextType()
	@FindBy(xpath = "//div[@id='modal-content-id-1']/div/div/div/div/div/div/input[@data-aura-rendered-by='1083:0' and @placeholder='search..']")
	public WebElement Insturctors;
	@TextType()
	@FindBy(xpath = "//input[@class='slds-input' and @placeholder='Search Accounts and more...']")
	public WebElement GlobalSearchClick;
	@TextType()
	@FindBy(xpath = "//search_lightning-instant-result-item[7]//span[normalize-space(.)='Contact • The Owen Long Account']")
	public WebElement Contact;
	@TextType()
	@FindBy(xpath = "//div[@id='modal-content-id-1']/div/div/input")
	public WebElement CourseSearch;
	@ButtonType()
	@FindBy(xpath = "//div[20]//button[normalize-space(.)='Select']")
	public WebElement SelectCourse;
	@TextType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[10]/div[3]/div[1]/lightning-input/lightning-datepicker/div[1]/div")
	public WebElement SessionDate;
	@TextType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[10]/div[3]/div[2]/lightning-input/lightning-timepicker/div/lightning-base-combobox/div")
	public WebElement startTime;
	@TextType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[10]/div[3]/div[3]/lightning-input/lightning-timepicker/div[1]/lightning-base-combobox/div/div[1]")
	public WebElement endTime;
	@ChoiceListType(values = { @ChoiceListValue(value = " Select a Time Zone"), @ChoiceListValue(value = "US/Eastern"),
			@ChoiceListValue(value = "US/Central"), @ChoiceListValue(value = "US/Mountain"),
			@ChoiceListValue(value = "US/Pacific"), @ChoiceListValue(value = "US/Alaska"),
			@ChoiceListValue(value = "US/Arizona"), @ChoiceListValue(value = "US/Hawaii"),
			@ChoiceListValue(value = "America/Puerto_Rico"), @ChoiceListValue(value = "Asia/Bahrain"),
			@ChoiceListValue(value = "Africa/Djibouti"), @ChoiceListValue(value = "Europe/Germany"),
			@ChoiceListValue(value = "Europe/Poland"), @ChoiceListValue(value = "Europe/Italy"),
			@ChoiceListValue(value = "Europe/UK"), @ChoiceListValue(value = "Asia/Iraq"),
			@ChoiceListValue(value = "Asia/South Korea"), @ChoiceListValue(value = "Asia/Japan") })
	@FindBy(xpath = "//select[@name='time_zone1']")
	public WebElement SessionTimeZone;
	@TextType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[10]/div[5]/div[1]/lightning-input/div[1]")
	public WebElement totalNumberOfKnownStudents;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='OK']")
	public WebElement oK;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='CLASSES']")
	public WebElement cLASSES1;
	@TextType()
	@FindBy(xpath = "//*[@id=\"phssTab1\"]/div/div[1]/div[2]/div[2]/div[2]")
	public WebElement ClassId;
	@TextType()
	@FindBy(xpath = "//div[@id='phssTab1']//div[normalize-space(.)='Sertified.']")
	public WebElement ValidateOrg;
	@TextType()
	@FindBy(xpath = "//div[9]/div[normalize-space(.)='09/15/2021']")
	public WebElement ValidateStartDate;
	@TextType()
	@FindBy(xpath = "//div[10]/div[normalize-space(.)='09/15/2021']")
	public WebElement ValidateEndDate;
	@TextType()
	@FindBy(xpath = "//div[@id='phssTab1']//div[normalize-space(.)='Online + Classroom']")
	public WebElement ValidateClassSetting;
	@TextType()
	@FindBy(xpath = "//b[normalize-space(.)='Students (13)']")
	public WebElement ValidateStudentCount;
	@TextType()
	@FindBy(xpath = "//tr[2]/td[normalize-space(.)='Claimed']")
	public WebElement ValidateVouchersStatus;
	@LinkType()
	@FindBy(xpath = "//one-app-nav-bar-item-root/a[normalize-space(.)='Accounts']")
	public WebElement accounts;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Voucher(3+)']")
	public WebElement ValidateVouchers;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Achievement Assignments(3+)']")
	public WebElement Achievement_Assignments;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Home']")
	public WebElement home;
	
	WebDriver driver;
	public MyPageObject(WebDriver driver){
		this.driver =driver;
		
	}
	
	public void setValue(String label,String value) throws InterruptedException{

		WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'"+value+"')]")));

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.findElement(By.xpath("//label[contains(text(),'"+label+"')]/following-sibling::div//input")).sendKeys(value);;
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span//b[contains(text(),'"+value+"')]")));
		Thread.sleep(6000);
		jse.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//span//b[contains(text(),'"+value+"')]")));
		jse.executeScript("arguments[0].click();", driver.findElement(By.xpath("//span//b[contains(text(),'"+value+"')]")));

	}

	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//flexipage-field[4]//span[normalize-space(.)='9/17/2021']/slot[@name='output']/slot/lightning-formatted-text")
	public WebElement startDate;
	/*@FindBy()
	@TextType()
	public WebElement ClassID;*/
	@ButtonType()
	@FindBy(xpath = "//div[@id='closeclassDiv']/button")
	public WebElement closeClass;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='On Hold']//lightning-primitive-custom-cell/lightning-formatted-text")
	public WebElement ccrz__OrderItemStatus__c1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='po']/slot[@name='outputField']/slot/lightning-formatted-text")
	public WebElement ccrz__AccountType__c1;
	@ButtonType()
	@FindByLabel(label = "Enroll Learner")
	public WebElement enrollLearner;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'slds-input') and @placeholder='First Name']")
	public WebElement firstName4;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'slds-input') and @placeholder='Last Name']")
	public WebElement lastName4;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*']/following-sibling::div//input[contains(@class,'slds-input') and @inputmode='email']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'slds-input') and @placeholder='Phone Number' and @type='tel']")
	public WebElement phoneNumber;
	@ButtonType()
	@FindBy(xpath = "//div[@id='modal-content-id-1']/div/div/div/button[normalize-space(.)='ENROLL LEARNER' and contains(@class,'slds-button')]")
	public WebElement eNROLLLEARNER;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'slds-input') and @inputmode='decimal']")
	public WebElement totalNumberOfStudentVouchers;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Cancel Class']")
	public WebElement cancelClass;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Yes']")
	public WebElement yes;
	@TextType()
	@FindBy(xpath = "//div[@id='phssTab1']//div[normalize-space(.)='Cancelled']")
	public WebElement CancelledStatus;
	@ButtonType()
	@FindBy(xpath = "//button[contains(normalize-space(.),'Class Cancelled on')]")
	public WebElement classCancelledOn20210924;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Unenroll']")
	public WebElement OnlineWork;
	@TextType()
	@FindBy(xpath = "//tr[14]/td[normalize-space(.)='Void']")
	public WebElement VoucherStudents;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='NITU NARANG']")
	public WebElement nituNarang;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='Cancelled']/slot[@name='output']/slot/lightning-formatted-text")
	public WebElement skeduloJobStatus;
	@TextType()
	@FindBy(xpath = "//*[@id=\"modal-content-id-1\"]/div[6]/div[2]/article/div[2]/div/table/tbody/tr[1]/td/lightning-input[normalize-space(.)='Successful Evaluations']")
	public WebElement successfulEvaluations;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='9/26/2021']/slot[@name='output']/slot/lightning-formatted-text")
	public WebElement startDate1;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='0']/slot[@name='output']/lightning-formatted-number")
	public WebElement availableSeats;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//span[normalize-space(.)='9/27/2021']/slot[@name='output']/slot/lightning-formatted-text")
	public WebElement endDate;
	@BooleanType()
	@FindBy(xpath = "//label[normalize-space(.)='Existing PO']/span[contains(@class,'slds-radio_faux')]")
	public WebElement _7;
	@BooleanType()
	@FindBy(xpath = "//div[6]//div/span/label/span[1]")
	public WebElement _8;
	@TextType()
	@FindBy(xpath = "//div[@id='modal-content-id-1']//lightning-formatted-text")
	public WebElement PaymentPageValidation;
	@TextType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']/lightning-icon/lightning-primitive-icon")
	public WebElement close;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show more actions']")
	public WebElement showMoreActions1;
	@PageFrame()
	public static class Frame3 {

		@LinkType()
		@JavascriptBy(jspath = "return document.querySelector('div.slds-tabs_default__content.slds-show > div > table > tbody > tr:nth-child(1) > td:nth-child(1) > div > a')")
		public WebElement firstAidCPRAEDInstructorBL;
		@ChoiceListType()
		@FindBy(xpath = "//div[2]//select")
		public WebElement selectedInstructor;
		@LinkType()
		@FindBy(xpath = "//a[@id='class-history__item']")
		public WebElement classHistory;
		@LinkType()
		@FindBy(xpath = "//tr[2]//a[normalize-space(.)='Adult and Pediatric First Aid/CPR/AED with Virtual Skills-BL']")
		public WebElement adultAndPediatricFirstAidCPRAEDWithVirtualSkillsBL;
		@LinkType()
		@FindBy(xpath = "//tr[3]//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
		public WebElement firstAidCPRAEDInstructorBL1;
		@LinkType()
		@FindBy(xpath = "//tr[6]//a[normalize-space(.)='Basic Water Rescue Instructor - BL' and contains(@data-aura-rendered-by,'443:')]")
		public WebElement basicWaterRescueInstructorBL;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Basic Life Support-BL r.21']")
		public WebElement basicLifeSupportBLR21;
		@LinkType()
		@FindBy(xpath = "//tr[3]//a[normalize-space(.)='Lifeguarding-BL']")
		public WebElement lifeguardingBL;
		@LinkType()
		@FindBy(xpath = "//tr[2]//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
		public WebElement adultAndPediatricFirstAidCPRAEDBL;
		@FacetFindBys(value = {
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[@id='class-history']/table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
				@FacetFindBy(findBy = @FindBy(xpath = "(//div[@id='class-history']/table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW)})
		@FindBy(xpath = "(//div[@id='class-history']/table)[1]")
		@PageTable(firstRowContainsHeaders = false, row = CLassHistory.class)
		public List<CLassHistory> cLassHistory;
		@FindBy(xpath = "//div[contains(@class, \"slds-tabs_default__content\")]/table/tbody/tr[1]//td[1]")
		@PageTable(firstRowContainsHeaders = false, row = CLassHistoryNew.class)
		public List<CLassHistoryNew> cLassHistoryNew;
		@LinkType()
		@FindBy(xpath = "//tr[2]//a[normalize-space(.)='Adult CPR/AED Online-OL for AP']")
		public WebElement AdultCPRAEDBL;
		}
	@FindBy(xpath = "//iframe[@title='Visualforce Page component container']")
	public Frame3 frame3;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[2]/lst-related-list-single-container//lst-template-list-item-factory[1]/lst-related-preview-card/article/div/div[2]/dl/dd[3]/lst-template-list-field/lightning-formatted-text")
	public WebElement VoucherStatus;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Achievement Assignments(0)']")
	public WebElement achievementAssignments0;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View AllVoucher']")
	public WebElement viewAllVoucher;
	
	@LinkType()
	@FindBy(xpath = "//a[@id='phssTab1__item']")
	public WebElement details;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'slds-input') and @placeholder='Search...' and @type='search']")
	public WebElement search3;
	@TextType()
	@FindBy(xpath = "//button[normalize-space(.)='Close']/lightning-icon/lightning-primitive-icon/svg/g")
	public WebElement close1;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='STATUS']")
	public WebElement StudentVouchersTab;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Close this window']")
	public WebElement closeThisWindow;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//a[normalize-space(.)='ILT Classes (10+)']")
	public WebElement iLTClasses1R;
	@LinkType()
	@FindBy(xpath = "//th/a[normalize-space(.)='Sertified.']")
	public WebElement accountName;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='View MoreContacts']")
	public WebElement viewMoreContacts;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//label[normalize-space(.)='Email']/following-sibling::input")
	public WebElement email1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Chris Long']")
	public WebElement Name;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Show quick filters']")
	public WebElement ILT_Classes1__r;
	@TextType()
	@FindBy(xpath = "//input[@id='input-335']")
	public WebElement email2;
	@TextType()
	@FindBy(xpath = "//input[contains(@class,'slds-input') and @inputmode='email']")
	public WebElement email3;
	@TextType()
	@FindBy(xpath = "//div[@id='modal-content-id-1']/div/div/div/div/div/div/input")
	public WebElement Instructor1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//flexipage-field[2]//force-hoverable-link//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
	public WebElement NAME;
	@PageFrame()
	public static class Frame4 {

		@TextType()
		@FindBy(xpath = "//div[normalize-space(.)='NAME']")
		public WebElement StudentResultsNameField;
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/PHSS_GeneratePDF?Id=a656C000000HECdQAO')]")
	public Frame4 frame4;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[1]/lst-search-grid//tr[1]/th/lightning-primitive-cell-factory/span/div/lightning-primitive-custom-cell/force-lookup/div/a[normalize-space(.)='Owen Long']")
	public WebElement Name1;
	@PageFrame()
	public static class Frame5 {
	}
	@FindBy(xpath = "//iframe[contains(@src,'apex/PHSS_GeneratePDF?Id=a656C000000HEE5QAO')]")
	public Frame5 frame5;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[@id='relatedListsTab3__item']")
	public WebElement related1;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[3]/th//div/a[normalize-space(.)='Owen Long']")
	public WebElement Name2;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Thank you, your payment has been received.']")
	public WebElement ThankyouMsg;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//tr[3]/th//a[normalize-space(.)='Owen Long']")
	public WebElement Owen_Long;
	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='Sertified.']")
	public WebElement Sertified_1;
	@PageRow()
	public static class Testtable {
	}
	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//div[contains(@class,'active') and contains(@class,'oneContent')]//table)[1]")
	@PageTable(firstRowContainsHeaders = false, row = Testtable.class)
	public List<Testtable> testtable;
	@ButtonType()
	@FindBy(xpath = "//div[4]/div/div[3]//button[normalize-space(.)='Select']")
	public WebElement SelectCourse_SWL_;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='RESOURCES']")
	public WebElement rESOURCES;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='SALES TAX EXEMPTION REQUEST']")
	public WebElement sALESTAXEXEMPTIONREQUEST;
	@TextType()
	@FindBy(xpath = "//p[normalize-space(.)='You have not filed any Sales Tax Exemptions with us.']")
	public WebElement MySTEsEmptyMsg;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Request Sales Tax Exemption' and @title='Request Sales Tax Exemption']")
	public WebElement requestSalesTaxExemption;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='*Account']")
	public WebElement STEAccount;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Request Sales Tax Exemption']")
	public WebElement account;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"ServiceCommunityTemplate\"]/div[2]/div/div[2]/div/div/c-sales-tax-exemption-list/div/div[1]/lightning-card/article/div[2]/slot/lightning-datatable/div[2]/div/div/table/thead/tr/th[2]/lightning-primitive-header-factory/span/a/span[2]")
	public WebElement sortByState;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"ServiceCommunityTemplate\"]/div[2]/div/div[2]/div/div/c-sales-tax-exemption-list/div/div[1]/lightning-card/article/div[2]/slot/lightning-datatable/div[2]/div/div/table/thead/tr/th[3]/lightning-primitive-header-factory/span/a/span[2]")
	public WebElement sortByOrganization;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"ServiceCommunityTemplate\"]/div[2]/div/div[2]/div/div/c-sales-tax-exemption-list/div/div[1]/lightning-card/article/div[2]/slot/lightning-datatable/div[2]/div/div/table/thead/tr/th[4]/lightning-primitive-header-factory/span/a/span[2]")
	public WebElement sortByExpirationDate;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"ServiceCommunityTemplate\"]/div[2]/div/div[2]/div/div/c-sales-tax-exemption-list/div/div[1]/lightning-card/article/div[2]/slot/lightning-datatable/div[2]/div/div/table/thead/tr/th[5]/lightning-primitive-header-factory/span/a/span[2]")
	public WebElement sortByStatus;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"ServiceCommunityTemplate\"]/div[2]/div/div[2]/div/div/c-sales-tax-exemption-list/div/div[1]/lightning-card/article/div[2]/slot/lightning-datatable/div[2]/div/div/table/thead/tr/th[6]/lightning-primitive-header-factory/span/a/span[2]")
	public WebElement sortByDateRequested;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"ServiceCommunityTemplate\"]/div[2]/div/div[2]/div/div/c-sales-tax-exemption-list/div/div[1]/lightning-card/article/div[2]/slot/lightning-datatable/div[2]/div/div/table/thead/tr/th[7]/lightning-primitive-header-factory/span/a/span[2]")
	public WebElement sortByAccountNumber;
	@ButtonType()
	@FindBy(xpath = "//button[@aria-label='Account, Select an Option']")
	public WebElement account1;
	@ButtonType()
	@FindBy(xpath = "//lightning-base-combobox-item//span[text()= 'Maryland Park Service']")
	public WebElement accountselect;
	@ButtonType()
	@FindBy(xpath = "//button[@aria-label='Sales Tax Exemption Category, Select an Option' and @name='Exemption_Category__c']")
	public WebElement salesTaxExemptionCategory;
	@TextType()
	@FindBy(xpath = "//*[text()='Non-profit']")
	public WebElement SelectCategory;
	@TextType()
	@FindBy(xpath = "//input[@name='Certificate_Number_ID__c']")
	public WebElement salesTaxExemptionCertificateNumber;
	@ButtonType()
	@FindBy(xpath = "//lightning-base-combobox-item//span[text()= 'CA']")
	public WebElement salesTaxExemptionState;
	@ButtonType()
	@FindBy(xpath = "//lightning-base-combobox-item//span[text()= 'CA']")
	public WebElement SelectState;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='25']")
	public WebElement SelectIssueDate;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='24']")
	public WebElement SelectExpirationDate;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Upload Files']")
	public WebElement UploadSTECertificateButton;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit Request']")
	public WebElement submitRequest;
	@TextType()
	@FindBy(xpath = "//tr[*]//span[normalize-space(.)='Pending']/div[normalize-space(.)='Pending']")
	public WebElement CertificationStatus;
	@PageRow()
	public static class MySTETable {

		@TextType()
		@FindBy(xpath = "//tr[contains(normalize-space(.),'CA Maryland Park Service')]//span[normalize-space(.)='Pending']//lightning-base-formatted-text")
		public WebElement MySTEStatus;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Sort by:State']/lightning-primitive-icon")
		public WebElement StateAscendingDescendingButton;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Sort by:Organization']/lightning-primitive-icon")
		public WebElement OrgnaizationAscendingDescendingButton;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Sort by:Expiration Date']/lightning-primitive-icon")
		public WebElement ExpAscendingDescendingButton;
		@TextType()
		@FindBy(xpath = "//a[normalize-space(.)='Sort by:Status']//svg/g")
		public WebElement StatusAscendingDescendingButton;
		@LinkType()
		@FindBy(xpath = "//a[normalize-space(.)='Sort by:Date Requested']/lightning-primitive-icon")
		public WebElement DateReqAscendingDescendingButton;
		@TextType()
		@FindBy(xpath = "//a[normalize-space(.)='Sort by:Account Number']//svg/g")
		public WebElement AccNumberAscendingDescendingButton;
	}
	@FacetFindBys(value = { @FacetFindBy(findBy = @FindBy(xpath = "(//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "(//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//table)[1]")
	@PageTable(firstRowContainsHeaders = false, row = MySTETable.class)
	public List<MySTETable> mySTETable;
	@ButtonType()
	@FindBy(xpath = "//button[@aria-label='Sales Tax Exemption State, Select an Option' and @name='State__c']")
	public WebElement salesTaxExemptionState1;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Complete this field.']")
	public WebElement AccountMissingFieldMsg;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Complete this field.']")
	public WebElement CategoryMissingMsg;
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'slds-modal__content')]")
	public WebElement STEFormUI;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='Complete this field.']")
	public WebElement MissingCertNumberMsg;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Maryland Park Service']")
	public WebElement account2;
	@ButtonType()
	@FindBy(xpath = "//*[text()='Other: please specify']")
	public WebElement salesTaxExemptionCategory1;
	@TextType()
	@FindBy(xpath = "//input[@name='Exemption_Category_Other__c']")
	public WebElement salesTaxExemptionOtherCategory;
	@ButtonType(file =true)
	@FindBy(xpath = "//input[@type='file']")
	public WebElement uploadFile1;
	@TextType()
	@FindBy(xpath = "//label[text()='Sales Tax Exemption State']//following::button[1]")
	public WebElement salesExemptionState;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//span[normalize-space(.)='StateState the Tax exemption is issued by.*']//lightning-icon//g")
	public WebElement stateStateTheTaxExemptionIsIssuedBy;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Expiration Date (optional)Optional expiration date for the exemption for this state.']//lightning-icon/lightning-primitive-icon")
	public WebElement Expiration_Date__c;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//label[normalize-space(.)='Send Notifications ToNotifications will default to the person who submits the request unless another email address is entered.']//lightning-icon//g")
	public WebElement Send_Notifications_To__c;
	@ButtonType()
	@FindByLabel(label = "REQUEST BLENDED CLASS")
	public WebElement rEQUESTBLENDEDCLASS1;
	
	
}


