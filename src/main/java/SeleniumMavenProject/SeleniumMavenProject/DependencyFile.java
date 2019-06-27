package SeleniumMavenProject.SeleniumMavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependencyFile {
public static void main(String args[])
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sr185244\\eclipse-workspace\\SeleniumBroswersExecutionFiles\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/social-icon.html");	
	String expectedPITVal = "Github";
	WebElement GetPITVALLOC = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));
	String actualPITVal =  GetPITVALLOC.getAttribute("title");
	System.out.println("actualPITVal"+actualPITVal);
	
	if (expectedPITVal==actualPITVal)
	{
		System.out.println("Got PIT Val");
	}
	else
	{
		System.out.println("DID NOT Got PIT Val");
	}
	driver.close();
}
}
