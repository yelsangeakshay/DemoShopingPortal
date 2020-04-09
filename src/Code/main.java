package Code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import object_repository.BooksPage;
import object_repository.CheckOutDetailsPage;
import object_repository.Confirm_Register;
import object_repository.HeaderCategory;
import object_repository.Homepage;
import object_repository.LoginPage;
import object_repository.ShoppingCartPage;
import object_repository.demo_register;

public class main {
	WebDriver driver ;
	@Test
	void initialize()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/lib/chromium-browser/chromedriver");
		driver  = new ChromeDriver();
		//Set Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}
	
	@Test(enabled=false)
	void register()
	{
		
	
		
		String register_url = "http://demowebshop.tricentis.com/register";
	
		driver.get(register_url);
		//demo_register dr = new demo_register(driver);
		Confirm_Register cr = new Confirm_Register(driver);
		cr.FirstName().sendKeys("Aksahy");
		cr.LastName().sendKeys("Yelsange");
		cr.Email().sendKeys("akshay@test13.com");
		cr.Password().sendKeys("123456");
		cr.ConfirmPassword().sendKeys("123456");
		cr.Register().click();
		cr.register_confrim().click();
		
		
		
		
		
	}
	
	
	
	@Test(dependsOnMethods="initialize")
	void Login()
	{
		String Login_url = "http://demowebshop.tricentis.com";
		
		driver.get(Login_url);
		
		Homepage hp = new Homepage(driver);
		hp.login().click();
		
		LoginPage lp =  new LoginPage(driver);
		lp.Email().sendKeys("akshay@test13.com");
		lp.Password().sendKeys("123456");
		lp.LogIn().click();
		
		
	}
	
	@Test(dependsOnMethods="Login")
	void AddtoCart()
	{
		Homepage hp = new Homepage(driver);
		hp.Books().click();
		
		BooksPage bp = new BooksPage(driver);
		List<WebElement> list_products = bp.products();
		for(int i=0;i<list_products.size();i++)
		{
			if("Computing and Internet".equals(list_products.get(i).getText()))
			{
				list_products.get(i).click();			//driver.quit();
				break;
				
			}
			
		}
		
		bp.AddtoCart().click();	
		
		Assert.assertTrue(bp.notification().isDisplayed());
		HeaderCategory hc = new HeaderCategory(driver);
		hc.Shopping_cart().click();
		
		//CheckOut
		ShoppingCartPage sp = new ShoppingCartPage(driver);
		sp.AgreeTerms().click();
		sp.checkout().click();
		
		//CheckOut Details
		CheckOutDetailsPage cp = new CheckOutDetailsPage(driver);
		cp.setCountry("India");
		cp.setcity().sendKeys("Pune");
		cp.setAddress().sendKeys("Hadapsar");
		cp.setPhone().sendKeys("12345678");
		//cp.clickContinue().click();
		
		
	}
	
	
}
