package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Lightning_FullServiceGrid"                                
               , summary=""
               , connection="SB_ARC_Service_Delivery"
               , auraComponent="Lightning_FullServiceGrid"
               , namespacePrefix=""
     )             
public class Lightning_FullServiceGrid {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='Schedule Full Service']")
	public WebElement scheduleFullService;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "(//button[normalize-space(.)='Schedule Full Service'])[2]")
	public WebElement scheduleFullServiceNew;
	
}
