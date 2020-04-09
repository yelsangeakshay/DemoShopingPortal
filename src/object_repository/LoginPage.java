package object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(linkText="Forgot password?")
	WebElement fpassword;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement LogIn;
	
	
	
	public WebElement Email()
	{
		return email;
	}
	
	public WebElement Password()
	{
		return password;
	}
	public WebElement ForgetPassword()
	{
		return fpassword;
	}
	public WebElement LogIn()
	{
		return LogIn;
	}
	
	
	

}
