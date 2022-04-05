package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject1"                                
     , summary=""
     , relativeUrl=""
     , connection="Admin"
     )             
public class MyPageObject1 {

	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='Setup']")
	public WebElement setup;
			
}
