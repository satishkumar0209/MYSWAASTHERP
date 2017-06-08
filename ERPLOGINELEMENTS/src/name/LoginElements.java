package name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements 
{
public static WebElement element;

public static WebElement EmailId(WebDriver driver)
{
	return driver.findElement(By.cssSelector("[placeholder='Enter Email Address']"));
	       	
}

public static WebElement Password(WebDriver driver )
{
	return driver.findElement(By.cssSelector("[placeholder=' Password']"));
	
}

public static WebElement loginbutton(WebDriver driver)
{
	return driver.findElement(By.xpath(".//*[@type='submit']"));
	
}

}
