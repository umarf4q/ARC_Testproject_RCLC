package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="RCLC_Home"                                
     , connection="Admin"
     )             
public class RCLC_Home {

	@ButtonType()
	@FindBy(xpath = "//button[@title='List Class on RCO']")
	public WebElement listClassOnRCO;

			
}
