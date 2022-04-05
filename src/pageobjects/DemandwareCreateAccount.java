package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="Demandware Create Account"                                
     , summary=""
     , relativeUrl=""
     , connection="Demandware"
     )             
public class DemandwareCreateAccount {

	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[@value='Login / Create Account']")
	public WebElement loginCreateAccount;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='CREATE ACCOUNT']")
	public WebElement createAccount;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='First Name']")
	public WebElement firstName;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	public WebElement LastName;
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Email']")
	public WebElement email;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Create Password' and @type='password']")
	public WebElement createPassword;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@TextType()
	@FindBy(xpath = "//input[@placeholder='Confirm Password' and @type='password']")
	public WebElement confirmPassword;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@PageWait.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='CREATE ACCOUNT' and @type='button']")
	public WebElement createAccountButton;
	
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Find My Certificate' and @title='Go to: Find My Certificate']")
	public WebElement findMyCertificate;
}
