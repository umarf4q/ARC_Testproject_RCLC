package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.model.ui.api.UiFacet;
import com.provar.core.testapi.annotations.*;

@Page( title="RC_ClassPostingRequestReview"                                
, summary=""
, relativeUrl=""
, connection="Admin"
		)             
public class RC_ClassPostingRequestReview {

	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='EDIT']")
	public WebElement edit;

	@PageRow()
	public static class SessionReview {
		@TextType()
		@FindBy(xpath = "./td[1]//span")
		public WebElement date;
		@TextType()
		@FindBy(xpath = "./td[2]/div")
		public WebElement startTime;
		@TextType()
		@FindBy(xpath = "./td[3]/div")
		public WebElement endTime;
		@TextType()
		@FindBy(xpath = "./td[4]/div")
		public WebElement timeZone;
	}

	@FacetFindBys(value = {
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[@id='modal-content-id-1']//table)[1]/tbody/tr"), facet = UiFacet.DATA_ROWS),
			@FacetFindBy(findBy = @FindBy(xpath = "(//div[@id='modal-content-id-1']//table)[1]/thead/tr"), facet = UiFacet.HEADER_ROW) })
	@FindBy(xpath = "(//div[@id='modal-content-id-1']//table)[1]")
	@PageTable(firstRowContainsHeaders = false, row = SessionReview.class)
	public List<SessionReview> sessionReview;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Add More To Cart']")
	public WebElement addMoreToCart;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Submit']")
	public WebElement submit;
	@TextType()
	@FindBy(xpath = "//h1[@data-aura-class='cPhss_cc_Cart_Clone']")
	public WebElement cartSummary;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Other: please specify']")
	public WebElement otherPleaseSpecify;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='AZ']")
	public WebElement SelectState;
	@LinkType()
	@FindBy(linkText = "Sales Tax Exemptions")
	public WebElement SalesTaxExemptionLink;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//textarea")
	public WebElement comments;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//button[normalize-space(.)='Approve']")
	public WebElement submit1;

}
