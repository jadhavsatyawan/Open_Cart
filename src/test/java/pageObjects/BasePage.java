package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage 
{
	WebDriver driver; //Create WebDriver variable
	
	public BasePage(WebDriver driver)  //Create BasePage class constructor
	{
		this.driver=driver;  
		PageFactory.initElements(driver,this);
		
	}

}
