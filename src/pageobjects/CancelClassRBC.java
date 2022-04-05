package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="CancelClassRBC"                                
               , summary=""
               , connection="QAtest"
               , auraComponent="CancelClassRBC"
               , namespacePrefix=""
     )             
public class CancelClassRBC {

	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Cancel Class']")
	public WebElement cancelClass;
	@ButtonType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//button[normalize-space(.)='Yes']")
	public WebElement yes;
	
}
