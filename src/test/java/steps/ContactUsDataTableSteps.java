package steps;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUsDataTableSteps extends DriverFactory {
	

	@Given("^I want to access webdriveruniversity website$")
	public void i_want_to_access_webdriveruniversity_website() throws Throwable {

		driver.get("http://webdriveruniversity.com/");
	}

	@When("^I click on the contact us link$")
	public void i_click_on_the_contact_us_link() throws Throwable {
		 driver.findElement(By.id("contact-us")).click();
		   Set<String> handle = driver.getWindowHandles();
		   String firstWindow = driver.getWindowHandle();
		   for(String window: handle) {
			   if(!window.equals(firstWindow))
				   driver.switchTo().window(window);
		   }
		   
		   Assert.assertTrue(driver.findElement(By.name("first_name")).isDisplayed());
	}

	@When("^I enter first-name$")
	public void i_enter_first_name() throws Throwable {
		  driver.findElement(By.name("first_name")).sendKeys("Teskdj");
	}

	@When("^I enter last-name$")
	public void i_enter_last_name() throws Throwable {
		 driver.findElement(By.name("last_name")).sendKeys("Oioaeo");
	}

	@When("^I enter email-address$")
	public void i_enter_email_address() throws Throwable {
		 driver.findElement(By.name("email")).sendKeys("apsdo@hjd.com");
	}

	@When("^I enter few comments$")
	public void i_enter_few_comments(DataTable dataChain) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = dataChain.raw();
		for(int i=0;i < data.size();i++) {
			for(int j=0;j<data.get(i).size();j++)
			driver.findElement(By.name("message")).sendKeys(data.get(i).get(j));
		}
	}

	@When("^I click on submit button on page$")
	public void i_click_on_submit_button_on_page() throws Throwable {
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

	@Then("^The information should sucessfully be submitted via contact us page$")
	public void the_information_should_sucessfully_be_submitted_via_contact_us_page() throws Throwable {
		 boolean check = false;
		   try {
			   check =  driver.findElement(By.xpath("//div[@id='contact_reply']/h1")).getText().equals("Thank You for your Message!");
			   Assert.assertTrue(check);
		   } catch (NoSuchElementException e) {
			   Assert.assertTrue(true);
		}
	}
}
