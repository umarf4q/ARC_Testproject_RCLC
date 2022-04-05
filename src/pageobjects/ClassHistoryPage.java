package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ClassHistoryPage"                                
     , summary=""
     , relativeUrl=""
     , connection="QAtest"
     )             
public class ClassHistoryPage {

	@PageFrame()
	public static class ClassHistoryFrame {

		@LinkType()
		@FindBy(xpath = "(//div[text()='Completed']/preceding::td/preceding::td/preceding::td/preceding::td/preceding::td/child::div/child::a[text()='Basic Water Rescue Instructor - BL'])[1]")
		public WebElement CompletedCourse;
	}

	@FindBy(xpath = "//iframe[contains(@id,'vfFrameId_')]")
	public ClassHistoryFrame classHistoryFrame;
			
}
