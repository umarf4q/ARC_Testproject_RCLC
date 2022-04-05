package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="GlobalSearch1"                                
     , summary=""
     , relativeUrl=""
     , connection="QAtest"
     )             
public class GlobalSearch1 {

	@LinkType()
	@FindBy(xpath = "//div[contains(@class,'active') and contains(@class,'oneContent')]//a[normalize-space(.)='User Detail' and @role='button']")
	public WebElement userDetail;
			
}
