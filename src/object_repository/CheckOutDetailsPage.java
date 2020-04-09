package object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutDetailsPage {
	
	
	WebDriver driver;
	
	public CheckOutDetailsPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By country = By.id("BillingNewAddress_CountryId");
	By city = By.id("BillingNewAddress_City");
	By address  = By.id("BillingNewAddress_Address1");
	By zipcode = By.id("BillingNewAddress_ZipPostalCode");
	By phone = By.id("BillingNewAddress_PhoneNumber");
	By btn_continue = By.cssSelector("input.button-1.new-address-next-step-button");
	
	
	
	public void setCountry(String countryname)
	{
		
		Select drpcountry = new Select(driver.findElement(country));
		drpcountry.selectByValue(countryname);
	}
	public WebElement setcity()
	{
		return driver.findElement(city);
	}
	
	public WebElement setAddress()
	{
		return driver.findElement(address);
	}
	
	public WebElement setPhone()
	{
		return driver.findElement(phone);
	}
	
	public WebElement clickContinue()
	{
		return driver.findElement(btn_continue);
	}
	//public 

}
