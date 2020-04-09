package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirm_Register extends demo_register {
	WebDriver driver;
	
	public Confirm_Register(WebDriver driver)
	{
		super(driver);
		this.driver = driver;
	}
	By register = By.xpath("//input[@value='Continue']");
	
	public WebElement register_confrim()
	{
		return driver.findElement(register);
	}

}
