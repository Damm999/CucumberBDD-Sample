package steps;


import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;



public class LoginSteps extends DriverFactory{

	
	/*@Before()
	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver-v0.26.0.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}*/

	@Given("User navigates to newtours website")
	public void user_navigates_to_newtours_website() {
		System.out.println("User navigates to newtours website");
		driver.get("http://newtours.demoaut.com/");
	}

	@Given("User clicks on login button on homepage")
	public void user_clicks_on_login_button_on_homepage() {
		System.out.println("User clicks on login button on homepage");
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-ON')]")).click();
	}

	@Given("User enters a valid username")
	public void user_enters_a_valid_username() {
		System.out.println("User enters a valid username");
		driver.findElement(By.cssSelector("input[name='userName']")).sendKeys("mercury");
	}

	@Given("User enter a valid password")
	public void user_enter_a_valid_password() {
		System.out.println("User enter a valid password");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("mercury");
	}

	@When("^User selects on login button$")
	public void user_selects_on_login_button() throws Throwable {
		System.out.println("User clicks on login button");
		driver.findElement(By.cssSelector("input[name='login']")).click();
	}

	@Then("User should be taken to successfull login page")
	public void user_should_be_taken_to_successfull_login_page() {
		System.out.println("User should be taken to successfull login page");
		Assert.assertTrue(driver.findElement(By.cssSelector("a[href='mercurysignoff.php']")).isDisplayed());
		System.out.println("Executed all the steps...");
	}

	/*@After()
	public void endTest() {
		System.out.println("Executed all the steps...");
		driver.quit();
	}*/
}
