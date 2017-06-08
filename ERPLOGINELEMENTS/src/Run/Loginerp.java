package Run;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import name.LoginElements;

public class Loginerp
{
	@Test
	public void login() throws InterruptedException
	{

	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://myswaastherp.sia.co.in/#/login");
	
	driver.manage().window().maximize();
	
	LoginElements.EmailId(driver).sendKeys("satishkumar@innotical.com");
	System.out.println("Enter user name successfully");
	
	LoginElements.Password(driver).sendKeys("123456");
	
	System.out.println("Enter password successfully");
	
	LoginElements.loginbutton(driver).click();
	System.out.println("clicking login button successfully");
	Thread.sleep(3000);
	
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Assert.assertEquals(url, "https://myswaastherp.sia.co.in/#/home/profile");
}
}

