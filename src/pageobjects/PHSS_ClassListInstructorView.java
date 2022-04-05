package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="PHSS_ Class List Instructor View"                                
               , summary=""
               , connection="QAtest"
               , auraComponent="PHSS_ClassListInstructorView"
               , namespacePrefix=""
     )             
public class PHSS_ClassListInstructorView {

	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.selectedAccount}']")
	public WebElement selectedAccount;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.selectedAccount}']")
	public WebElement selectedAccount1;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.selectedAccount}']")
	public WebElement selectedAccount2;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.selectedAccount}']")
	public WebElement selectedAccount3;
	@ChoiceListType()
	@FindBy(xpath = "//div[2]//select")
	public WebElement selectedInstructor;
	@LinkType()
	@AuraBy(componentXPath = "//lightning:tabBar[@aura:id= 'tabBar']")
	public WebElement classHistory;
	@LinkType()
	@FindBy(xpath = "//tr[3]//a[.='Basic Water Rescue Challenge']")
	public WebElement basicWaterRescueChallenge;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"class-history\"]/table/tbody/tr[3]/td[1]/div/a")
	public WebElement basicWaterRescueChallenge1;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"class-history\"]/table/tbody/tr[3]/td[1]/div/a[.='Basic Water Rescue Challenge']")
	public WebElement basicWaterRescueChallenge11;
	@LinkType()
	@FindBy(xpath = "//tr[3]//a[normalize-space(.)='Basic Water Rescue Challenge']")
	public WebElement basicWaterRescueChallenge2;
	@LinkType()
	@AuraBy(componentXPath = "//lightning:tabBar[@aura:id= 'tabBar']")
	public WebElement classHistory1;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('lightning-tab-bar')")
	public WebElement classHistory11;
	@LinkType()
	@FindByLabel(label = "Class History")
	public WebElement classHistory2;
	@LinkType()
	@FindByLabel(label = "Class History")
	public WebElement classHistory21;
	@LinkType()
	@FindBy(xpath = "//a[@id='class-history__item' and normalize-space(.)='Class History' and @aria-controls='class-history']")
	public WebElement classHistorylink;
	@LinkType()
	@AuraBy(componentXPath = "//lightning:tabBar[@aura:id= 'tabBar']")
	public WebElement classHistory3;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.selectedAccount}']")
	public WebElement selectedAccount4;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.selectedAccount}']")
	public WebElement OrganizationDropdown;
	@TextType()
	@FindBy(xpath = "//div[@id='lightning']/div[1]/div[1]/div")
	public WebElement OrganizationDropdown1;
	@TextType()
	@FindBy(xpath = "//div[@id='lightning']/div[1]/div[1]/div")
	public WebElement OrganizationDropdown2;
	@TextType()
	@FindBy(xpath = "//div[@id='lightning']/div[1]/div[1]/div")
	public WebElement selectedAccount41;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('a')")
	public WebElement firstAidCPRAEDInstructorBL;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='First Aid/CPR/AED Instructor-BL']")
	public WebElement firstAidCPRAEDInstructorBL1;
	@LinkType()
	@FindBy(xpath = "//a[normalize-space(.)='First Aid/CPR/AED Instructor-BL']")
	public WebElement firstAidCPRAEDInstructorBL2;
	@LinkType()
	@FindBy(xpath = "//div[@id='current-classes']//tr[1]//a[normalize-space(.)='First Aid/CPR/AED Instructor-BL']")
	public WebElement firstAidCPRAEDInstructorBL3;
	@LinkType()
	@FindBy(xpath = "//div[@id='current-classes']//tr[1]//a[normalize-space(.)='First Aid/CPR/AED Instructor-BL' and @href='javascript:void(0);']")
	public WebElement firstAidCPRAEDInstructorBL31;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"current-classes\"]/div/table/tbody/tr[1]/td[1]/div/a")
	public WebElement firstAidCPRAEDInstructorBL311;
	@ChoiceListType()
	@AuraBy(componentXPath = "//lightning:select[@value= '{!v.selectedInstructor}']")
	public WebElement selectedInstructor1;
	@LinkType()
	@AuraBy(componentXPath = "//lightning:tabBar[@aura:id= 'tabBar']")
	public WebElement classHistory4;
	@LinkType()
	@JavascriptBy(jspath = "return document.querySelector('div.slds-tabs_default__content.slds-show > table > tbody > tr:nth-child(2) > td:nth-child(1) > div > a')")
	public WebElement adultAndPediatricFirstAidCPRAEDWithVirtualSkillsBL;
	@LinkType()
	@FindBy(xpath = "//div[@id='current-classes']//a[normalize-space(.)='Basic Water Rescue Challenge']")
	public WebElement basicWaterRescueChallenge3;
	@LinkType()
	@FindBy(xpath = "//tr[6]//a[normalize-space(.)='Basic Water Rescue Instructor - BL' and //div ]")
	public WebElement basicWaterRescueInstructorBL;
	@LinkType()
	@FindBy(xpath = "//tr[6]//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
	public WebElement basicWaterRescueInstructorBL1;
	@LinkType()
	@FindBy(xpath = "//tr[1]//a[normalize-space(.)='Lifeguarding-BL']")
	public WebElement lifeguardingBL;
	@LinkType()
	@FindBy(xpath = "//tr[4]//a[normalize-space(.)='Adult and Pediatric First Aid/CPR/AED-BL']")
	public WebElement adultAndPediatricFirstAidCPRAEDBL;
	@LinkType()
	@FindBy(xpath = "//tr[1]//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
	public WebElement basicWaterRescueInstructorBL2;
	@LinkType()
	@FindBy(xpath = "//div[@id='current-classes']//tr[2]//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
	public WebElement basicWaterRescueInstructorBL3;
	@LinkType()
	@FindBy(xpath = "//tr[5]//a[normalize-space(.)='Basic Water Rescue Instructor - BL']")
	public WebElement basicWaterRescueInstructorBL4;
	
}
