package testngTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class FirstTestNGScript {
	// TestNG is open source and used with Java
	// TEstNg is available in .jar files
	// TestNG does not need any main method (main())
	// TestNG is used to written TDD - Test Driven Development
	// Test is a class in TESTNG jar file 
	// if order is not provided then TestNG will run the function according to functions first alphabet
	// Extent report for reports
	// if ( eg: priority=-2) priority is given in negative value then that particular test / function will execute first as negative value is always small. Also in negatives small value is checked
	// if any of the function is not working or got failed TestNG will execute next functions without hold or exit
	// ANNOTATIONS are started with @  //Everything @Before is pre-conditions //Test cases are Starting with @Test (count of all test cases will be by counting @Test
	// Everything @After is post conditions
	// BeforeSuite --> BeforeTest -->BeforeClass -->BeforeMethod -->Test --> AfterMethod--> -->AfterClass--> AfterTest--> Aftersuite
	// Pairs while executing each test case will be ""BeforeMethod -->Test --> AfterMethod"" - this set will be created = number of @Test is there 
	// Rest all annotations will be executed only once
	// @Test are independent of other @Test but are dependent of other annotations
	// "groups" feature 
	
	
//	@Test (priority=-3,description = "priority = 3")
//	public void loginApplication()
//	{
//		System.out.println("My First TESTNG");
//		//Assert.assertEquals(12,13);
//	}
//	
//	@Test(priority=-1 , description = "priority=1")
//	public void AddFunction()
//	{
//		int a,b,c;
//		a=2;b=2;
//		c=a+b;
//		System.out.println("Output of AddFunction"+c);
//		
//	}
//	
//	@Test(priority=-2 , description = "priority=2")
//	public void SubFunction()
//	{
//		int a,b,c;
//		a=2;b=2;
//		c=a-b;
//		System.out.println("Output of AddFunction"+c);
//		
//	}
	
	//Everything @Before is pre-conditions 
	@BeforeSuite
	public void setUp()
	{
		System.out.println("setUp system property for chrome");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("launch Chrome");
	}
	
	@BeforeTest
	public void login()
	{
		System.out.println("login method");
	}
	@BeforeMethod
	public void EnterURL()
	{
		System.out.println("enter URL");
	}
	
	
	
	//Test cases are Starting with @Test
	@Test	
	public void googleTitleTest()
	{
		System.out.println("Test googleTitleTest");
	}
	
	@Test	
	public void searchTest()
	{
		System.out.println("Test searchTest");
	}
	
	@Test	
	public void googleLogoTest()
	{
		System.out.println("Test googleLogoTest");
	}
	//Everything @After is post conditions
	@AfterMethod
	public void logout()
	{
		System.out.println("logout method");
	}
	
	
	@AfterTest
	public void deleteAllCookies()
	{
		System.out.println("deleteAllCookies");
	}
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("closeBrowser");
		
		}
	
	@AfterSuite // at present not running will see later
	public void generateTestReport()
	{
		System.out.println("generateTestReport");
		
		}


}
