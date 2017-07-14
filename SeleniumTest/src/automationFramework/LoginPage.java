package automationFramework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	static String URL = "http://www.phptravels.net/login";
	
	public static void signUp(final WebDriver driver)
	{
		String username = "test@test.com",
		password = "password",
		firstname = "Test",
		surname = "Test",
		number = "07712548711";
		driver.get(URL);
		
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[5]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/input")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/input")).sendKeys(surname);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/input")).sendKeys(number);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
		
		if (driver.getCurrentUrl() == "http://www.phptravels.net/account/")
		{
			System.out.println("Signup page test passed.");
		}
		else
		{
			System.out.println("Signup page test failed.");
		}
	}
	
	public static void invalidSignUp(final WebDriver driver)
	{
		String username = "£$%$£^%£$",
		password = "",
		firstname = "sdfg_7634647_%£$%",
		surname = "sdfg_7634647_%£$%",
		number = "Hello";
		
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[5]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[3]/input")).sendKeys(firstname);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[4]/input")).sendKeys(surname);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[5]/input")).sendKeys(number);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[6]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[7]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[8]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button")).click();
		
		if (driver.getCurrentUrl() != "http://www.phptravels.net/account/")
		{
			System.out.println("Invalid sign up test has passed.");
		}
		else
		{
			System.out.println("Invalid sign up test has failed.");
		}
	}
	
	public static void invalidLogin(final WebDriver driver) throws InterruptedException
	{
		String username = "test@test.co1m",
			   password = "password";
		
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[4]/div/div[1]/input")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[4]/div/div[2]/input")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[4]/button")).click();

		Assert.assertEquals("Invalid Email or Password", driver.findElement(By.className("alert alert-danger")));
		System.out.println("Invalid creditentials Login page test passed.");
	}
	
	public static void forgotPassword(WebDriver driver)
	{
		String username = "test@test.com";
		
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[5]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"resetemail\"]a")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"passresetfrm\"]/div[2]/span/button")).click();
	}
	
	public static void invalidForgot(WebDriver driver)
	{
		String username = "test@test.com123";
		
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/div[5]/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"resetemail\"]a")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"passresetfrm\"]/div[2]/span/button")).click();
	}

}
