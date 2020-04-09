package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	By login = By.linkText("Log in");
	By register = By.linkText("Register");
	By books = By.partialLinkText("Books");
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	public WebElement Books()
	{
		return driver.findElement(books);
	}

}
