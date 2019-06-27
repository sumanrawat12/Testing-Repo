package FacebookMain;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrame {
// using Guru99 link http://demo.guru99.com/selenium/deprecated.html
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sr185244\\eclipse-workspace\\SeleniumBroswersExecutionFiles\\drivers\\chromedriver.exe");		
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.switchTo().frame("classFrame");
	        driver.findElementByXPath("//a[@href=\"overview-tree.html\"]").click();
	      //  driver.close(); 
	    }
}
