package steps;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class WebLoginParameterizedSteps extends DriverFactory{


	@Given("^I try to access webdriveruniversity website$")
	public void i_try_to_access_webdriveruniversity_website() throws Throwable {


		driver.get("http://webdriveruniversity.com/");
	}

	@When("^I click on login portal button$")
	public void i_click_on_login_portal_button() throws Throwable {
		driver.findElement(By.cssSelector("a[id='login-portal']")).click();
		Set<String> handle = driver.getWindowHandles();
		String firstWindow = driver.getWindowHandle();
		for (String window : handle) {
			if (!window.equals(firstWindow))
				driver.switchTo().window(window);
		}
	}

	@When("^I enter a username$")
	public void i_enter_a_username() throws Throwable {
		driver.findElement(By.id("text")).sendKeys("webdriver");
	}

	@When("^I enter a \"([^\"]*)\" password$")
	public void i_enter_a_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
	}

	@Then("^I should be presented with successful validation alert$")
	public void i_should_be_presented_with_successful_validation_alert() throws Throwable {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals("validation succeeded", alert.getText());
		alert.accept();
	}

	@Then("^I should be presented with a unsuccessful validation alert$")
	public void i_should_be_presented_with_a_unsuccessful_validation_alert() throws Throwable {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals("validation failed", alert.getText());
		alert.accept();
	}

}
