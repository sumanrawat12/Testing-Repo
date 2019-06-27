package FacebookMain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookMainFunction {
	//public static void OpenBrowser() {
	public static void main (String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sr185244\\eclipse-workspace\\SeleniumBroswersExecutionFiles\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.facebook.com/");
		String i = driver.getCurrentUrl();  System.out.println(i); 
		String j = driver.getTitle(); 		System.out.println(j);
		String actualTile=j;
		
		//Finding the location method other than Xpath
		String tagname="";  // Trying to use same string at multiple places
		tagname = driver.findElement(By.id("email")).getTagName();
		System.out.println("email tagname is "+tagname);
		
		tagname = driver.findElement(By.id("email")).getTagName();
		System.out.println("email id tagname is "+tagname);
		
	
//		String tagname2="";
//		tagname2 = driver.findElement(By.id("pass")).getTagName();
//		System.out.println("password tagname is "+tagname2);

		tagname = driver.findElement(By.id("pass")).getTagName();
		System.out.println("password tagname is "+tagname);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		System.out.println("Waited millseconds");
		
	driver.findElementByXPath("//input[@value=\"Log In\" and @type=\"submit\"]").click();

	
		driver.close(); // Close the browser 
		System.exit(0);  // Will Leave the browser open 
		
//Working Code : Example Codes:	
//		if(actualTile.contentEquals("Facebook - Log In or Sign Up")) // actualTile.contentEquals
//		{System.out.println("Correct Title");}
//		else 	{System.out.println("Wrong Title");	}

		
//Question
//		tagname = driver.findElement(By.id("email")).click().sendKeys("1");
//		System.out.println("email id tagname is "+tagname);
		// Frames
		//Junit and Testng
		//CSS Selector
		
	}
}
