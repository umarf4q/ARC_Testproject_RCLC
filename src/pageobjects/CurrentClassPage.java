package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="CurrentClassPage"                                
     , summary=""
     , relativeUrl=""
     , connection="QAtest"
     )             
public class CurrentClassPage {

	@PageFrame()
	public static class CurrentClassFrame {

		@LinkType()
		@FindBy(xpath = "(//div[text()='Completed']/preceding::td/preceding::td/preceding::td/preceding::td/preceding::td/child::div/child::a[text()='Adult CPR/AED Online-OL for AP'])[1]")
		public WebElement CompletedCourse;
	}

	@FindBy(xpath = "//iframe[contains(@id,'vfFrameId_')]")
	public CurrentClassFrame currentClassFrame;
			
}
