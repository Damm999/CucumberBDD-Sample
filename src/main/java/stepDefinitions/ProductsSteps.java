package stepDefinitions;

import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ProductsSteps extends DriverFactory {

	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String url) throws Throwable {
		driver.get(url);
	}

	@When("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String productElement) throws Throwable {
		driver.findElement(By.cssSelector(productElement)).click();
	}

	@Then("^User should be presented with promo alert with messsage as \"([^\"]*)\"$")
	public void user_should_be_presented_with_promo_alert_with_messsage_as(String expectedPromo) throws Throwable {
		productPage.validatePromoCode(expectedPromo);
		
	}

}
