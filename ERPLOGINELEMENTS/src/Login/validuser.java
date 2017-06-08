package Login;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import name.Editprofile;
import name.LoginElements;

public class validuser 
{

	public static WebDriver driver;
	@Test
	public void login() throws InterruptedException, AWTException
	{
	Robot robot=new Robot();

		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://myswaastherp.sia.co.in/#/login");
		
		driver.manage().window().maximize();
		
		LoginElements.EmailId(driver).sendKeys("gsatishkumar0209@gmail.com");
		System.out.println("Enter user name successfully");
		
		LoginElements.Password(driver).sendKeys("123456");
		System.out.println("Enter password successfully");
		LoginElements.loginbutton(driver).click();
		
		System.out.println("Clicking on Signin button successfully");
		Thread.sleep(5000);
		
		
		
		String url=driver.getCurrentUrl();
		System.out.println("url");
		
		driver.get("https://myswaastherp.sia.co.in/#/home/profile");
		
		//Assert.assertEquals(url, "https://myswaastherp.sia.co.in/#/home/profile");
		
		Editprofile.account(driver).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Editprofile.Logout(driver).click();
		
		System.out.println("Logout successfully");
		Thread.sleep(1000);
		
		Assert.assertEquals("https://myswaastherp.sia.co.in/#/login", "https://myswaastherp.sia.co.in/#/login");
	driver.quit();
	}
	
}