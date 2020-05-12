package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import helper.SeleniumHelper;

public class ProductsPageObjects extends SeleniumHelper {

	public @FindBy(xpath = "//div[@class='modal-body']/p") 
	WebElement modelBodyLabel;
	
	public @FindBy(xpath = "//button[contains(text(),'Proceed')]")
	WebElement proccedButton;
	
	
	public ProductsPageObjects() {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	public void validatePromoCode(String expectedPromo) {
		String promo = getTextFromModel(modelBodyLabel);
		promo = promo.substring(promo.indexOf("NEW"), promo.indexOf(" ."));
		System.out.println("Promo::::: "+promo);
		
		clickElement(proccedButton);
		
		Assert.assertEquals(promo, expectedPromo);
	}

}
