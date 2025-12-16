package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) // Created Constructor of class for Accessing WebDriver
	{
		super(driver);
	}

	// Locators
	// name
	@FindBy(name = "search") // input[@name="search"]
	WebElement searchBox;

	// Chained Xpath
	@FindBy(xpath = "//div[@id='header-cart']//button")
	WebElement itemcartButton;

	// text() Method
	@FindBy(xpath = "//span[text()='123456789']")
	WebElement number;

	// Using contains
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement myAccount;

	// linkText
	@FindBy(linkText = "Register")
	WebElement register;

	@FindBy(linkText = "Login")
	WebElement login;

	// Parent Child Relationship
	@FindBy(xpath = "//div[@class='nav float-end']//li[3]")
	WebElement wishlist;

	//
	@FindBy(xpath = "//a[@title='Shopping Cart']")
	WebElement shoppingCart;

	@FindBy(xpath = "//span[text()='Checkout']")
	WebElement checkout;

	// tagName
	@FindBy(tagName = "a")
	WebElement links;

}
