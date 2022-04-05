package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DemandwareSanitizingAndProtection"                                
     , summary=""
     , relativeUrl=""
     , connection="Demandware"
     )             
public class DemandwareSanitizingAndProtection {

	@ButtonType()
	@FindBy(xpath = "(//input/following-sibling::button[@title='Add to Cart'])[1]")
	public WebElement addToCart;
			
}
