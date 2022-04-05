package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DemandwareLogin"                                
     , summary=""
     , relativeUrl=""
     , connection="Demandware"
     )             
public class DemandwareLogin {

	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Username (Email)']/following-sibling::input")
	public WebElement username;
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='NEXT']")
	public WebElement next;
	@TextType()
	@FindBy(xpath = "//label[normalize-space(.)='Password']/following-sibling::input")
	public WebElement password;
	@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
	@ButtonType()
	@FindBy(xpath = "//button[normalize-space(.)='LOGIN']")
	public WebElement login;
			
}
