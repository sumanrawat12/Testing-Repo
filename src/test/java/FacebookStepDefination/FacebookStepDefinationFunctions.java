package FacebookStepDefination;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookStepDefinationFunctions {
	
	@Given("^Open Facebook on Chrome Browser$")
	public void open_Facebook_on_Chrome_Browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		//System.out.println("Blank Print");
		
	}

	//@When("^Give Username \"(.*)\" and Password \"(.*)\"$")
	@When("^Give Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void give_Username_and_Password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	//	FacebookMainFunction.OpenBrowser();
		ChromeDriver driver = new ChromeDriver();	
		
		driver.findElementByXPath("//input[@name=\"email\" and @data-testid=\"royal_email\"]").sendKeys(username);
		driver.findElementByXPath("//input[@name=\"pass\" and @data-testid=\"royal_pass\"]").sendKeys(password);
		driver.findElementByXPath("//input[@type=\"submit\" and @data-testid=\"royal_login_button\"]").click();
	     //  driver.findElement(By.name("uid")).sendKeys(username);					
	     //  driver.findElement(By.name("password")).sendKeys(password);
	}

	@Then("^Now Facebook is logged in$")
	public void now_Facebook_is_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		System.out.println("Blank Print");
	}


}
