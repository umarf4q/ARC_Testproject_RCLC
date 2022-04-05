package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AddReschedulingFee"                                
     , summary=""
     , relativeUrl=""
     , connection="SB_ARC_Service_Delivery"
     )             
public class AddReschedulingFee {

	@PageFrame()
	public static class Frame {

		@TextType()
		@FindBy(xpath = "//lightning-textarea//textarea")
		public WebElement comments;
		@PageWaitAfter.BackgroundActivity(timeoutSeconds = 60)
		@ButtonType()
		@FindBy(xpath = "//button[normalize-space(.)='Next']")
		public WebElement next;
	}

	@FindBy(xpath = "//iframe")
	public Frame frame;
			
}
