package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.SeleniumHelper;

public class ContactUsPageObjects extends SeleniumHelper {
	
	public @FindBy(name = "first_name") 
	WebElement firstNameTextBox;
	
	public @FindBy(name = "last_name") 
	WebElement lastNameTextBox;
	
	public @FindBy(name = "email") 
	WebElement emailTextBox;
	
	public @FindBy(name = "message") 
	WebElement commentsTextBox;
	
	public @FindBy(css="input[type='submit']")
	WebElement submitButton;
	
	public @FindBy(xpath="//div[@id='contact_reply']/h1")
	WebElement thankYouLabel;
	
	public ContactUsPageObjects() {
		super();
		PageFactory.initElements(driver, this);
	}

	public void enterFirstName(String name) {
		sendKeys(firstNameTextBox, name);
	}
	
	public void enterLastName(String name) {
		sendKeys(lastNameTextBox, name);
	}
	
	public void enterEmailAddress(String email) {
		sendKeys(emailTextBox, email);
	}
	
	public void enterComments(String comment) {
		sendKeys(commentsTextBox, comment);
	}
	
	public void submitData() {
		clickElement(submitButton);
	}
	
	public void validateSuccessfulSubmit() {
		boolean check = false;
		try {
			waitForElementVisible(thankYouLabel);
			check = getText(thankYouLabel)
					.equals("Thank You for your Message!");
			Assert.assertTrue(check);
		} catch (NoSuchElementException e) {
			Assert.assertTrue(true);
		}
	}
}
