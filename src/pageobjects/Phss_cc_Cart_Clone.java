package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Phss_cc_ Cart_ Clone"                                
               , summary=""
               , connection="QAtest"
               , auraComponent="Phss_cc_Cart_Clone"
               , namespacePrefix=""
     )             
public class Phss_cc_Cart_Clone {

	@LinkType()
	@AuraBy(componentXPath = "//lightning:tabBar[@aura:id= 'tabBar']")
	public WebElement ___item;
	
}
