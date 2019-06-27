package testngTutorial;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGDependencyFeatures {
	//checking on dependsOnMethods // When dependent parent function is failed then child function will fail
	
	@Test
	public void loginTest()
	{
		System.out.println("Login Test");
		//assertEquals(12, 14);
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest()
	{
		System.out.println("homePage Test");
	}
	
	
}
