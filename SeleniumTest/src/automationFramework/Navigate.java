package automationFramework;

import org.openqa.selenium.WebDriver;

public class Navigate 
{
	static String Home = "http://www.phptravels.net/";
	static String Flights = "http://www.phptravels.net/flight";
	static String Hotels = "http://www.phptravels.net/hotels";
	static String Tours = "http://www.phptravels.net/tours";
	static String Blog = "http://www.phptravels.net/blog";
	static String Contact = "http://www.phptravels.net/contact-us";
	static String Cars = "http://www.phptravels.net/cars";
	static String Account = "http://www.phptravels.net/account";
	static String Login = "http://www.phptravels.net/login";
	static String Signup = "http://www.phptravels.net/register";
	
	public static void start(WebDriver driver)
	{
		driver.get(Home);
	}
	
	public static void home(WebDriver driver)
	{
		driver.navigate().to(Home);
	}
	
	public static void flights(WebDriver driver)
	{
		driver.navigate().to(Flights);
	}
	
	public static void hotels(WebDriver driver)
	{
		driver.navigate().to(Hotels);
	}
	
	public static void tours(WebDriver driver)
	{
		driver.navigate().to(Tours);
	}
	
	public static void blog(WebDriver driver)
	{
		driver.navigate().to(Blog);
	}
	
	public static void contactus(WebDriver driver)
	{
		driver.navigate().to(Contact);
	}
	
	public static void cars(WebDriver driver)
	{
		driver.navigate().to(Cars);
	}
	
	public static void myAccount(WebDriver driver)
	{
		driver.navigate().to(Account);
	}
	
	public static void login(WebDriver driver)
	{
		driver.navigate().to(Login);
	}
	
	public static void signup(WebDriver driver)
	{
		driver.navigate().to(Signup);
	}

}
