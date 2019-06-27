package testngTutorial;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssert {WebDriver driver;
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
	@Test(priority = 1, description = "priority 1 groups Logo",groups = "Logo")
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		System.out.println("print title  #  "+title);
		assertEquals(title, "Google123","title not match");
		
		
	}
}
