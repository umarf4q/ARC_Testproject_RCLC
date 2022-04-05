package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="ClassHistoryBasicWater"                                
     , summary=""
     , relativeUrl=""
     , connection="QAtest"
     )             
public class ClassHistoryBasicWater {

	@PageFrame()
	public static class Frame {

		@LinkType()
		@FindBy(xpath = "//div[@id='class-history']//tr[3]//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
		public WebElement basicWater;
	}

	@FindBy(xpath = "//iframe[contains(@id,'vfFrameId_')]")
	public Frame frame;
			
}
