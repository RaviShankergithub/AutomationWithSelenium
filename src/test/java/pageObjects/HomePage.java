package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//input[@id='Email']") 
WebElement email;

@FindBy(xpath="//input[@id='Password']") 
WebElement password;

@FindBy(xpath="//button[@type='submit']")
WebElement linkLogin;


public void clickMyAccount()
{
	email.sendKeys("admin@yourstore.com");
}

public void clickRegister()
{
	password.sendKeys("password");;
}

public void clickLogin()
{
	linkLogin.click();
}

}
