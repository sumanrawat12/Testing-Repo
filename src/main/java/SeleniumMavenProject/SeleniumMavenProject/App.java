package SeleniumMavenProject.SeleniumMavenProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTagName;
import org.openqa.selenium.support.ui.Select;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sr185244\\eclipse-workspace\\SeleniumBroswersExecutionFiles\\drivers\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement UserName;  
        WebElement Password;
        UserName = driver.findElementByXPath("//input[@id=\"email\" and @name=\"email\"]");
        
        UserName.sendKeys("sumanrawat123@gmail.com");
        UserName.clear();
        UserName.sendKeys("sumanrawat12@gmail.com");
        Password = driver.findElementByCssSelector("input#pass");
       Password.sendKeys("shree143");
      // Password.submit();
      WebElement MaleRadioButton;
      MaleRadioButton = driver.findElementByCssSelector("input#u_0_9");
    //  MaleRadioButton.click();
      if (MaleRadioButton.isSelected()) {
    	  System.out.println("MaleRadioButton clicked");
      }
    	  else 
    	  {
    		  System.out.println("MaleRadioButton not clicked");
    	  }
    }
   
    
       
       //driver.findElementByCssSelector("input#u_0_2").click();
        
	
//        UserName = driver.getTitle();
//        System.out.println("User GetTitle " + UserName);
//       UserName = driver.findElement(By.id("email")).getTagName() ;  
//       System.out.println("User getTagName " + UserName);
//       
//       UserName = driver.findElementByXPath("//input[@id=\"email\" and @name=\"email\"]").getTagName();
//       System.out.println("User getTagName by XPath " + UserName);
      // driver.close();
      //  System.exit(0);
        
    }
