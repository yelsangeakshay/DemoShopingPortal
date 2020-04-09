package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage {
	
	WebDriver driver;
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By agreeTerms = By.xpath("//*[@name='termsofservice']");
	By Checkout = By.cssSelector("#checkout");
	
	public WebElement AgreeTerms()
	{
		return driver.findElement(agreeTerms);
	}
	
	public WebElement checkout()
	{
		return driver.findElement(Checkout);
	}
	

}
