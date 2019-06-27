package testngTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	//Checking grouping
	//checking BeforeTest --> Test --> AfterTest (set repeats for each @Test)
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr185244\\eclipse-workspace\\SeleniumBroswersExecutionFiles\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority = 1, description = "priority 1 groups Logo",groups = "Logo")
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("print title  #  "+title);
	}
	
	@Test(priority = 1,description = "priority 1 groups Logo ",groups = "Logo")
	public void googleLogoTest()
	{
		WebElement googleLogoTest=driver.findElement(By.xpath("//parent::div[@class=\"FPdoLc VlcLAe\"]//input[@class=\"gNO89b\" and @type=\"submit\"]"));
		System.out.println("print googleLogoTest   #   "+googleLogoTest);
		
	}
	
	@Test(priority = -1,description = "grups by Test logo",groups = "Test Logo")
	public void mailLinkTest()
	{
		WebElement mailLinkTest=driver.findElement(By.linkText("Gmail"));
		System.out.println("mailLinkTest "+mailLinkTest);
		
	}

}
