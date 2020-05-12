package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import PageObjects.ContactUsPageObjects;
import PageObjects.ProductsPageObjects;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helper.SeleniumHelper;
import utils.DriverFactory;

public class MasterHooks extends DriverFactory {

	@Before()
	public void setUp() {
		driver = getWebdriver();
		wait = waitDriver();
		contactUsPage = PageFactory.initElements(driver, ContactUsPageObjects.class);
		productPage = PageFactory.initElements(driver, ProductsPageObjects.class);
	}

	@After()
	public void tearDown(Scenario scenario) {
		try {
			if (driver != null) {
				if (scenario.isFailed()) {
					scenario.embed(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png");
					SeleniumHelper.captureScreenshot();
				}

				driver.manage().deleteAllCookies();
				driver.quit();
			}
		} catch (Exception e) {
			System.out.println("Method failed: tearDown(), Exception " + e.getMessage());
		}
	}

}
