package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DemandwareFindMyCerificate"                                
, summary=""
, relativeUrl=""
, connection="Demandware"
		)             
public class DemandwareFindMyCerificate {

	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Email Address']")
	public WebElement searchByEmailAddress;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Name & Date']")
	public WebElement searchByNameAndDate;
	@TextType()
	@FindBy(xpath = "//span[normalize-space(.)='Certificate ID']")
	public WebElement searchByCertificateID;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_certificate_firstname']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_certificate_lastname']")
	public WebElement lastName;
	@TextType()
	@FindBy(xpath = "//select[@name='year']")
	public WebElement year;
	@TextType()
	@FindBy(xpath = "//select[@name='month']")
	public WebElement month;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_certificate_email']")
	public WebElement email;
	@TextType()
	@FindBy(xpath = "//input[@name='dwfrm_certificate_certnumber']")
	public WebElement certificateIdNumber;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='FIND']")
	public WebElement find;

	@FindBy(xpath = "//div[@id='certificate']/div[contains(@class,'certificate-heading-list')]")
	@PageTable(firstRowContainsHeaders = false, row = CertificateSearchResults.class)
	public List<CertificateSearchResults> certificateSearchResults;
	@PageRow()
	public static class CertificateSearchResults {
		@BooleanType()
		@FindBy(xpath = "./div/input[1]")
		public WebElement selectCheckbox;
		@TextType()
		@FindBy(xpath = "./div/div[1]")
		public WebElement className;
		@TextType()
		@FindBy(xpath = "./div/div[3]")
		public WebElement completionDate;
		@TextType()
		@FindBy(xpath = "./div/div[4]")
		public WebElement studentName;
		@TextType()
		@FindBy(xpath = "./div/div[5]")
		public WebElement status;
	}
	
	@BooleanType()
	@FindBy(xpath = "//input[@name='allcertificates']")
	public WebElement selectAllCheckbox;
	@ButtonType()
	@FindBy(xpath = "//button[@id='add-to-cartcertificate']")
	public WebElement addToCart;
}
