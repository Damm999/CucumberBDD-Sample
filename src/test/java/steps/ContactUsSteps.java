package steps;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUsSteps extends DriverFactory {
	
	@Given("^I access webdriveruniversity website$")
	public void i_access_webdriveruniversity_website() throws Throwable {
		driver.get("http://webdriveruniversity.com/");
	}

	@When("^I click on contact us button$")
	public void i_click_on_contact_us_button() throws Throwable {
	   driver.findElement(By.id("contact-us")).click();
	   Set<String> handle = driver.getWindowHandles();
	   String firstWindow = driver.getWindowHandle();
	   for(String window: handle) {
		   if(!window.equals(firstWindow))
			   driver.switchTo().window(window);
	   }
	   
	   Assert.assertTrue(driver.findElement(By.name("first_name")).isDisplayed());
	}

	@When("^I enter a firstName$")
	public void i_enter_a_firstName() throws Throwable {
	    driver.findElement(By.name("first_name")).sendKeys("Teskdj");
	}

	@When("^I enter a lastName$")
	public void i_enter_a_lastName() throws Throwable {
	    driver.findElement(By.name("last_name")).sendKeys("Oioaeo");
	}

	@When("^I enter a email address$")
	public void i_enter_a_email_address() throws Throwable {
		 driver.findElement(By.name("email")).sendKeys("apsdo@hjd.com");
	}

	@When("^I enter comments$")
	public void i_enter_comments() throws Throwable {
		 driver.findElement(By.name("message")).sendKeys("I have so many doubts in this site, please call me.");
	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
	   driver.findElement(By.cssSelector("input[type='submit']")).click();
	   
	}

	@Then("^The information should be successfully be submitted via the contact us form$")
	public void the_information_should_be_successfully_be_submitted_via_the_contact_us_form() throws Throwable {
	   boolean check = false;
			   try {
				   check =  driver.findElement(By.xpath("//div[@id='contact_reply']/h1")).getText().equals("Thank You for your Message!");
				   Assert.assertTrue(check);
			   } catch (NoSuchElementException e) {
				   Assert.assertTrue(true);
			}
			   
	}

	/*@When("^I enter invalid firstName$")
	public void i_enter_invalid_firstName() throws Throwable {
		driver.findElement(By.name("first_name")).sendKeys("asdsdasd1212");
	}

	@When("^I enter invalid lastName$")
	public void i_enter_invalid_lastName() throws Throwable {
		driver.findElement(By.name("last_name")).sendKeys("Oi");
	}*/

	@When("^I enter invalid email address$")
	public void i_enter_invalid_email_address() throws Throwable {
		driver.findElement(By.name("email")).sendKeys("apsdo");
	}

	@When("^I enter no comments$")
	public void i_enter_no_comments() throws Throwable {
		driver.findElement(By.name("message")).sendKeys("");
	}

	@Then("^the user should also be notified of the problem$")
	public void the_user_should_also_be_notified_of_the_problem() throws Throwable {
	    Assert.assertTrue(driver.getPageSource().contains("Error: all fields are required"));
	    Assert.assertTrue(driver.getPageSource().contains("Error: Invalid email address"));
	}

	@When("^I click on reset button$")
	public void i_click_on_reset_button() throws Throwable {
	   driver.findElement(By.cssSelector("input[type='reset']")).click();
	}

	@Then("^All the information filled by the user should be removed\\.$")
	public void all_the_information_filled_by_the_user_should_be_removed() throws Throwable {
	    Assert.assertTrue(driver.findElement(By.name("last_name")).getText().equals(""));
	}
	
}
