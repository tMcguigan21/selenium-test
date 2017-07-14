package automationFramework;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristTestCase {

	public static void main(String[] args) throws InterruptedException 
	{
		String exePath = "D:\\Automation\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Navigate.start(driver);

		
	}
	
	public static void navigation(final WebDriver driver)
	{		
		String URL = "http://www.phptravels.net/";
		driver.get(URL);
		// Webpage links:		
		String pHome = "/html/body/nav[1]/div/div/div/ul/li[1]/a",
			   pFlights = "/html/body/nav[1]/div/div/div/ul/li[2]/a",
			   pHotel = "/html/body/nav[1]/div/div/div/ul/li[3]/a",
			   pTours = "/html/body/nav[1]/div/div/div/ul/li[4]/a",
			   pOffers = "/html/body/nav[1]/div/div/div/ul/li[5]/a",
			   pBlog = "/html/body/nav[1]/div/div/div/ul/li[6]/a",
			   pContactus = "/html/body/nav[1]/div/div/div/ul/li[7]/a",
			   pCars = "/html/body/nav[1]/div/div/div/ul/li[8]/a";
		
		String[] webLinks = new String[8];
		webLinks[0] = pHome;
		webLinks[1] = pFlights;
		webLinks[2] = pHotel;
		webLinks[3] = pTours;
		webLinks[4] = pOffers;
		webLinks[5] = pBlog;
		webLinks[6] = pContactus;
		webLinks[7] = pCars;
		
		int x = 0;
		
		while (x < 8)
		{						
			driver.findElement(By.xpath(pHome)).click();
			driver.findElement(By.xpath(pFlights)).click();
			Assert.assertEquals("Flights", driver.getTitle());
			driver.findElement(By.xpath(webLinks[x])).click();
			
			driver.findElement(By.xpath(pHotel)).click();
			Assert.assertEquals("Hotels Listings", driver.getTitle());
			driver.findElement(By.xpath(webLinks[x])).click();
			
			driver.findElement(By.xpath(pTours)).click();
			Assert.assertEquals("Tours Listings", driver.getTitle());
			driver.findElement(By.xpath(webLinks[x])).click();
			
			driver.findElement(By.xpath(pOffers)).click();
			Assert.assertEquals("Special Offers", driver.getTitle());
			driver.findElement(By.xpath(webLinks[x])).click();
			
			driver.findElement(By.xpath(pBlog)).click();
			Assert.assertEquals("Blog", driver.getTitle());
			driver.findElement(By.xpath(webLinks[x])).click();
			
			driver.findElement(By.xpath(pContactus)).click();
			Assert.assertEquals("Contact Us", driver.getTitle());
			driver.findElement(By.xpath(webLinks[x])).click();
			
			driver.findElement(By.xpath(pCars)).click();
			Assert.assertEquals("Cars Listings", driver.getTitle());
			driver.findElement(By.xpath(webLinks[x])).click();
			x++;
		}
		System.out.println("The navigation test has passed.");
	}
	
	public static void templateCheck(WebDriver driver, String link)
	{
		driver.get(link);
		driver.findElements(By.id("footer")).isEmpty();
		navigation(driver);
	}
}
