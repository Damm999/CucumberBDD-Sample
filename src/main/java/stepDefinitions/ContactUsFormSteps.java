package stepDefinitions;

import java.util.List;

import com.cucumber.listener.Reporter;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class ContactUsFormSteps extends DriverFactory {

	@Given("^I navigate to webdriveruniversity contact us from$")
	public void i_navigate_to_webdriveruniversity_contact_us_from() throws Throwable {
		Reporter.addStepLog("Web driver University method is opened.");
		driver.get("http://webdriveruniversity.com/Contact-Us/contactus.html");
	}

	@When("^I enter a valid first name$")
	public void i_enter_a_valid_first_name(DataTable firstNameDataTable) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		Reporter.addStepLog("First name is entered.");
		List<List<String>> data = firstNameDataTable.raw();

		contactUsPage.enterFirstName(data.get(0).get(1));

	}

	@When("^I enter a valid last name$")
	public void i_enter_a_valid_last_name() throws Throwable {
		contactUsPage.enterLastName("oospodkand");
	}

	@When("^I enter a valid email address$")
	public void i_enter_a_valid_email_address() throws Throwable {
		contactUsPage.enterEmailAddress("apsdo@hjd.com");
	}

	@When("^I enter valid comments$")
	public void i_enter_valid_comments(DataTable dataChain) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> data = dataChain.raw();
		for (int i = 0; i < data.size(); i++) {
			for (int j = 0; j < data.get(i).size(); j++)
				contactUsPage.enterComments(data.get(i).get(j));
		}
	}

	@When("^I click on submit button on the page$")
	public void i_click_on_submit_button_on_the_page() throws Throwable {
		contactUsPage.submitData();
	}

	@Then("^The information should be successfully submmited via contact us form$")
	public void the_information_should_be_successfully_submmited_via_contact_us_form() throws Throwable {
		contactUsPage.validateSuccessfulSubmit();
	}

}
