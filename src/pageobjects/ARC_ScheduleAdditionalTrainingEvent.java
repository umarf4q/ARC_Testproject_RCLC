package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="ARC_ Schedule Additional Training Event"                                
               , summary=""
               , connection="SB_ARC_Service_Delivery"
               , auraComponent="ARC_ScheduleAdditionalTrainingEvent"
               , namespacePrefix=""
     )             
public class ARC_ScheduleAdditionalTrainingEvent {

	@TextType()
	@FindBy(xpath = "//input[@name='studentInput' and @type='text']")
	public WebElement enterNumberOfStudents;
	@BooleanType()
	@AuraBy(componentXPath = "//force:modal//lightning:input[@aura:id= 'checkAdditionalTraining']")
	public WebElement checkToCreateAdditionalTrainingEvent;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Next']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//section")
	public WebElement cancelled;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Finish']")
	public WebElement finish;
	@TextType()
	@FindBy(xpath = "//div[contains(@class, 'active') and contains(@class, 'open') and (contains(@class, 'forceModal') or contains(@class, 'uiModal'))][last()]//section")
	public WebElement success;
	
}
