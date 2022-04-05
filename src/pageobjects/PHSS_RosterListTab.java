package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="PHSS_ Roster List Tab"                                
               , summary=""
               , connection="QAtest"
               , auraComponent="PHSS_RosterListTab"
               , namespacePrefix=""
     )             
public class PHSS_RosterListTab {

	@TextType()
	@FindBy(xpath = "//tr[1]//div[normalize-space(.)='Acquired']")
	public WebElement Student1Status;
	@TextType()
	@FindBy(xpath = "//tr[1]//div[normalize-space(.)='Acquired']")
	public WebElement Student1Status1;
	@TextType()
	@FindBy(xpath = "//div[@id='print-area']/div/div")
	public WebElement ValidateStudentResults;
	@TextType()
	@FindBy(xpath = "//div[@id='print-area']/div/div")
	public WebElement StudentResultsValidate;
	@TextType()
	@FindBy(xpath = "//div[@id='print-area']/div/div")
	public WebElement StudentResultsTab;
	@TextType()
	@FindBy(xpath = "//div[@id='print-area']/div/div[normalize-space(.)='There are no records']")
	public WebElement ValidateStudentResults1;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='NAME']")
	public WebElement StudentResultsName;
	@ButtonType()
	@AuraBy(componentXPath = "//ui:button[@press= 'c.generatePDF']")
	public WebElement print;
	@ButtonType()
	@AuraBy(componentXPath = "//ui:button[@press= 'c.generatePDF']")
	public WebElement print1;
	
}
