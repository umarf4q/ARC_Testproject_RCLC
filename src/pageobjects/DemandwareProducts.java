package pageobjects;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="DemandwareProducts"                                
     , summary=""
     , relativeUrl=""
     , connection="Demandware"
     )             
public class DemandwareProducts {

	@TestLogger
	Logger testLogger;
	
	WebDriver driver;
	public DemandwareProducts(WebDriver driver) {
		this.driver = driver;
	}

	@LinkType()
	@FindBy(xpath = "//ul[@id='search-result-items']//a[normalize-space(.)='CPR/AED for Professional Rescuers Instructors Kit']")
	public WebElement product;
	@ButtonType()
	@FindBy(xpath = "//input[@value='150303' or @value='AED Trainer Language File - Finnish']/following-sibling::button[@value='Add to Cart']")
	public WebElement addToCart150303;
	@TextType()
	@FindBy(xpath = "(//ul/li[@class='grid-tile grid-layout '])[last()]")
	public WebElement loadProducts;
	@ButtonType()
	@FindBy(xpath = "//input[@value='766002' or @value='Hurricane & Flooding Preparedness Kit']/following-sibling::button[@value='Add to Cart']")
	public WebElement addToCart766002;
	@ButtonType()
	@FindBy(xpath = "//input[@value='tshirt-set' or @value='T-Shirt & Whistle Set']/following-sibling::button[@value='Add to Cart']")
	public WebElement addToCartTShirtSet;
	@ButtonType()
	@FindBy(xpath = "//input[@value='tshirt-set']/following-sibling::button[@value='Add All to Cart']")
	public WebElement addAllToCartTShirtSet;
	
	public void selectProduct(){
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		testLogger.info("Getting all Products");
		List<WebElement> lst = driver.findElements(By.xpath("//div[@class='search-result-content']/ul/li"));
		int count = 0;
		count = lst.size();
		testLogger.info("Total categories = "+count);
		int randomNum = ThreadLocalRandom.current().nextInt(1, count);
		WebElement product = driver.findElement(By.xpath("(//div[@class='search-result-content']/ul/li//button[@value='Add to Cart'])["+randomNum+"]"));
		testLogger.info("Selecting: product number "+randomNum);
		product.click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
			
}
