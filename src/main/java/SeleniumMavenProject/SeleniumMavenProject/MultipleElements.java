package SeleniumMavenProject.SeleniumMavenProject;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;

public class MultipleElements {
	 public static void main( String[] args )
	    {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\sr185244\\eclipse-workspace\\SeleniumBroswersExecutionFiles\\drivers\\chromedriver.exe");
	        ChromeDriver driver=new ChromeDriver();
//	        driver.get("http://demo.guru99.com/test/ajax.html");
//	        List<WebElement> elements = driver.findElements(By.name("name"));
//	        System.out.println("Number of elements:" +elements.size());
//
//	        for (int i=0; i<elements.size();i++){
//	          System.out.println("Radio button text:" + elements.get(i).getAttribute("value"));
//	        }
	        
	        String baseURL = "https://www.facebook.com/";
//		    WebDriver driver = new FirefoxDriver();
			driver.get(baseURL);
			
			//Testing partial and full links on fb page
//			driver.findElement(By.partialLinkText("Policy")).click();
//			driver.findElement(By.linkText("Forgot account?")).click();
			
			WebElement FirstName;
			FirstName = driver.findElement(By.cssSelector("a#privacy-link"));
			//FirstName.sendKeys("Suman");
		
			
			WebElement FirstLocation = driver.findElement(By.cssSelector("input#email"));
			
			Actions action = new Actions(driver);
			action.dragAndDrop(FirstName,FirstLocation).build().perform();
			
			

			//Below code is to test drop down lists
//			Select moth = new Select(driver.findElementByCssSelector("select#month"));
//			moth.selectByVisibleText("Jan"); //-->text in dropdowns
//			moth.selectByIndex(2); //By index starts with 0
//			boolean res = moth.isMultiple(); // return boolean value wether dropdown selects multiple selection or not
//			System.out.println(res);
			
			


	//	moth.deselectAll(); // supported only when dropdown have multiple selection and Clears all selected entries. This is only valid when the drop-down element supports multiple selections.
		
}
}