package object_repository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BooksPage {
	
	WebDriver driver;
	public BooksPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By products = By.xpath("//*[@class='product-title']/a");
	By prodcut_cart = By.xpath("//*[starts-with(@id, \"add-to-cart-button\")]");
	
	By notification_success = By.cssSelector("div#bar-notification.bar-notification.success");
	public List<WebElement> products()
	{
		return driver.findElements(products);
	}
	
	public WebElement AddtoCart()
	{
		return driver.findElement(prodcut_cart);
	}
	public WebElement notification()
	{
		return driver.findElement(notification_success);
	}
	

}
