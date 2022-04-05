package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Demandware Home"                                
     , summary=""
     , relativeUrl=""
     , connection="Demandware"
     )             
public class DemandwareHome {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//a[@class='user-account']")
	public WebElement myAccount;
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class,'myaccount-heading')]")
	public WebElement myAccountHeading;
	
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@LinkType()
	@FindBy(xpath = "//a[@title='Go to: My Certificate']")
	public WebElement myCertificate;
			
}
