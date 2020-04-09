package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HeaderCategory {
	
	WebDriver driver;
	public HeaderCategory(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By shopping_cart = By.xpath("//*[contains(text(),'Shopping cart')]");
	By Login = By.xpath("//*[contains(text(),'Log in')]");
	
	
	public WebElement Shopping_cart()
	{
		return driver.findElement(shopping_cart);
	}
	public WebElement LogIn()
	{
		return driver.findElement(Login);
	}

}
