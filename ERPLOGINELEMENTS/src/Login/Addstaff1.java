package Login;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import name.Addstaff;
import name.LoginElements;

public class Addstaff1
{
	private boolean isChecked;
	private WebElement e;
	@Test
	public void login() throws InterruptedException, AWTException
	{

	System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver"); 
	WebDriver driver=new ChromeDriver();
	driver.get("https://myswaastherp.sia.co.in/#/login");
	
	driver.manage().window().maximize();
	
	LoginElements.EmailId(driver).sendKeys("08@gmail.com");
	System.out.println("Enter user name successfully");
	
	LoginElements.Password(driver).sendKeys("123456");
	System.out.println("Enter password successfully");
	LoginElements.loginbutton(driver).click();
	
	System.out.println("Clicking on Signin button successfully");
	Thread.sleep(5000);
	
	
	
	
	
	
	
	//element.click();
	
	Thread.sleep(7000);
	
	Random random1 = new Random();					
	
	boolean flag = random1.nextBoolean();
	
	System.out.println(flag);
	
	if(flag==true)
	
	{
		Addstaff.Registernumberfordoctor(driver).sendKeys("3000304");
		
		Addstaff.verify(driver).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@placeholder='Enter email']")).sendKeys("venky@gmail.com");
		
		driver.findElement(By.xpath(".//*[@formcontrolname='mobile']")).sendKeys("7412589635");
		
		driver.findElement(By.xpath(".//*[@placeholder='Enter name']")).sendKeys("venky@gmail.com");
		
		driver.findElement(By.xpath(".//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		 driver.findElement(By.cssSelector("[placeholder='Enter registration no.']")).sendKeys("0864723159");
		
		 driver.findElement(By.xpath(".//*[@class='ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget ng-touched']")).sendKeys(" kumar");
		
		driver.findElement(By.xpath(".//*[@placeholder='Enter email address']")).sendKeys("kumar@gmail.com");
		
		driver.findElement(By.xpath(".//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget']")).sendKeys("2052005205");
		
		
		
	}
	
	
	else
	
	{
		

		Addstaff.Registernumberfordoctor(driver).sendKeys("3000304");
		
		Addstaff.verify(driver).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@placeholder='Enter email']")).sendKeys("venky@gmail.com");
		
		driver.findElement(By.xpath(".//*[@formcontrolname='mobile']")).sendKeys("7412589635");
		
		driver.findElement(By.xpath(".//*[@placeholder='Enter name']")).sendKeys("venky@gmail.com");
		
		driver.findElement(By.xpath(".//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		
		 driver.findElement(By.cssSelector("[placeholder='Enter registration no.']")).sendKeys("0864723159");
		
		 driver.findElement(By.xpath(".//*[@class='ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget ng-touched']")).sendKeys(" kumar");
		
		driver.findElement(By.xpath(".//*[@placeholder='Enter email address']")).sendKeys("kumar@gmail.com");
		
		driver.findElement(By.xpath(".//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget']")).sendKeys("2052005205");
		
		
	
	
	

	
	
	}
	
	
	
	
	
	
	
//	if (element=="true")
//	{
//		System.out.println("successfull");
//	}
//	
//	else
//		System.out.println("error");
	
//	Thread.sleep(4000);
//	Random random1 = new Random();					
//	boolean flag = random1.nextBoolean();
//	System.out.println(flag);
//	if(flag==true)
//	{
//		System.out.println("check box is selected");
//	}
//	else
//	{
//		System.out.println("check box is  not selected");
	
//	if(driver.findElement(By.xpath(".//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).equals(true))
//	
//	{
//		
//		System.out.println("check box is selected");
////		Addstaff.checkbox(driver).click();
////		
////		Addstaff.registernumber(driver).sendKeys("0864723159");
////		
////		Addstaff.staffname(driver).sendKeys("satish kumar");
////		
////		Addstaff.staffemail(driver).sendKeys("9885714096@gmail.com");
////		
////		Addstaff.staffmobil(driver).sendKeys("9963954747");
////		
//	}
	
	
		
//		Addstaff.Registernumberfordoctor(driver).sendKeys("3000304");
//		
//		Addstaff.verify(driver).click();
//		
//		
//	Addstaff.doctorname(driver).sendKeys("satish kumar");
//		
//		Addstaff.Doctoremail(driver).sendKeys("venky@gmail.com");
//		
//		Addstaff.Doctormobile(driver).sendKeys("9030003041");
//		
	//}
	
	
	//Addstaff.staffsave(driver).click();
	
	
	
	//Addstaff.Doctorsave(driver).click();
	
	
	
	
	
	
	
}
}
