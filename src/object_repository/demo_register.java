package object_repository;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demo_register {
	
	
	WebDriver driver;
	
	public demo_register(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By f_name = By.cssSelector("#FirstName");
	//f_name.sendKeys("Akshay");
	By l_name = By.cssSelector("#LastName");
	//l_name.sendKeys("Yelsange");
	By email = By.cssSelector("#Email");
	//email.sendKeys("akshay@test124.com");
	By  password = By.cssSelector("#Password");
	//password.sendKeys("123456");
	By  confirmpassword = By.cssSelector("#ConfirmPassword");
	//confirmpassword.sendKeys("123456");
	By register_button = By.cssSelector("#register-button");

	public WebElement FirstName()
	{
		return driver.findElement(f_name);
	}
	public WebElement LastName()
	{
		return driver.findElement(l_name);
	}
	public WebElement Email()
	{
		return driver.findElement(email);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement ConfirmPassword()
	{
		return driver.findElement(confirmpassword);
	}
	
	public WebElement Register()
	{
		return driver.findElement(register_button);
	}
	
	
}
