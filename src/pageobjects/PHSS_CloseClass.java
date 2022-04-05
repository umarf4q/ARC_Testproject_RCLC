package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="PHSS_CloseClass"                                
               , summary=""
               , connection="QAtest"
               , auraComponent="PHSS_CloseClass"
               , namespacePrefix=""
     )             
public class PHSS_CloseClass {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//div[@id='closeclassDiv']/button")
	public WebElement closeClass;
	@BooleanType()
	@AuraBy(componentXPath = "//ui:inputCheckbox[@aura:id= 'allcheckbox']")
	public WebElement _;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Next']")
	public WebElement next;
	@BooleanType()
	@AuraBy(componentXPath = "//ui:inputCheckbox[@aura:id= 'checkbox']")
	public WebElement _1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Submit']")
	public WebElement submit;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//div[@id='closeclassDiv']/button")
	public WebElement closeClass1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Next']")
	public WebElement next1;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneWorkspace') and (ancestor::div[contains(@class,'active') and contains(@class,'main-content')]//div[contains(@class, 'oneGlobalNav') or contains(@class, 'tabBarContainer')]//div[contains(@class, 'tabContainer') and contains(@class, 'active')] )]//button[normalize-space(.)='Submit']")
	public WebElement submit1;
	
}
