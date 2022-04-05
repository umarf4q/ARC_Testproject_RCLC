package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DemandwarePayPal"                                
     , summary=""
     , relativeUrl=""
     , connection="Demandware"
     )             
public class DemandwarePayPal {

	@TextType()
	@FindBy(xpath = "//input[@id='email']")
	public WebElement emailOrMobileNumber;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[@id='btnNext']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//input[@name='login_password']")
	public WebElement password;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[@id='btnLogin']")
	public WebElement login;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.Field(timeoutSeconds = 10)
	@ButtonType()
	@FindBy(xpath = "//button[@id='payment-submit-btn']")
	public WebElement continueButton;
			
}
