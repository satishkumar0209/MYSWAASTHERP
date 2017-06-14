package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addstaff 
{
public static WebElement element;

public static WebElement checkbox(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));
	
}
public static WebElement registernumber(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[placeholder='Enter registration no.']"));
	
}
public static WebElement staffname(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@class='ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget ng-touched']"));
	
}
public static WebElement staffemail(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[ng-reflect-namer='email']"));
	
}
public static WebElement staffmobil(WebDriver driver)
{
	return driver.findElement(By.xpath("( .//*[@class='ui-inputtext ui-corner-all ui-state-default ui-widget ng-dirty ui-state-filled ng-valid ng-touched'])[2]"));
	
}

public static WebElement staffsave(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ui-button-text ui-c'])[2]"));
	
}

public static WebElement Registernumberfordoctor(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget']"));
	
}
public static WebElement verify(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@label='verify']"));
	
}
public static WebElement doctorname(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget ng-touched'])[2]"));
	
}
public static WebElement Doctoremail(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget'])[2]"));
	
}
public static WebElement Doctormobile(WebDriver driver)
{
	return driver.findElement(By.xpath("(.//*[@class='ng-untouched ng-pristine ng-invalid ui-inputtext ui-corner-all ui-state-default ui-widget'])[3]"));
	
}
public static WebElement Doctorsave(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@class='ui-button-text ui-c']"));
	
}

}
