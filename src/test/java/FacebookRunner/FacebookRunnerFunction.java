package FacebookRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sr185244\\NewEclipse\\SeleniumMavenProject\\src\\test\\java\\Feature\\Facebook.feature" , glue = "FacebookStepDefination")
public class FacebookRunnerFunction {

}
