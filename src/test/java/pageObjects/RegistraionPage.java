package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistraionPage extends BasePage {

	public RegistraionPage(WebDriver driver) {
		super(driver);
	}

	// Locators

	// id
	@FindBy(id = "input-firstname")
	WebElement firstName;

	// xpath with Multiple Attributes
	@FindBy(xpath = "//input[@name='lastname'][@placeholder='Last Name']")
	WebElement lastName;

	// xpath with OR Operators
	@FindBy(xpath = "//input[@name='email' or @placeholder='E-Mail']")
	WebElement email;

	// xpath with AND operator
	@FindBy(xpath = "//input[@type='password' and @name='password']")
	WebElement password;

	// xpath following-sibling
	@FindBy(xpath = "//input[@type='hidden']/following-sibling::input[@type='checkbox']")
	WebElement newsLetter;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement privacyPolicy;

}
