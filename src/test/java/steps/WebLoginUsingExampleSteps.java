package steps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

public class WebLoginUsingExampleSteps extends DriverFactory{

	WebDriver driver;
	WebDriverWait wait;

	@Given("^I try to access \"([^\"]*)\" website in \"([^\"]*)\"$")
	public void i_try_to_access_website_in(String url, String browser) throws Throwable {

		/*switch (browser) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			this.driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.26.0.exe");
			this.driver = new FirefoxDriver();
			break;

		}
*/
		wait = new WebDriverWait(driver, 30);

		driver.get("http://webdriveruniversity.com/");
	}

	@When("^I enter a \"([^\"]*)\"$")
	public void i_enter_a(String username) throws Throwable {
		driver.findElement(By.id("text")).sendKeys(username);
	}

	@When("^I click on login link button$")
	public void i_click_on_login_link_button() throws Throwable {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",driver.findElement(By.cssSelector("a[id='login-portal']")));
		Set<String> handle = driver.getWindowHandles();
		String firstWindow = driver.getWindowHandle();
		for (String window : handle) {
			if (!window.equals(firstWindow))
				driver.switchTo().window(window);
		}
	}

	@When("^I enter \"([^\"]*)\" password$")
	public void i_enter_password(String password) throws Throwable {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
		driver.findElement(By.id("login-button")).click();
		
	}

	@Then("^I should be presented with the following prompt alert \"([^\"]*)\"$")
	public void i_should_be_presented_with_the_following_prompt_alert(String message) throws Throwable {
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals(alert.getText(), message);
		alert.accept();
	}

}
