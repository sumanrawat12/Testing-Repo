package testngTutorial;

import org.testng.annotations.Test;

public class TestNGExceptionTimeOutTest {
	//Suppose test case is taking more time or struck in infinite loop or due to time issues ==> use timeOut or invocationTimeOut thus called TestNGExceptionTimeout
	//if want why above happened then use expectedExceptions
	
	@Test(invocationTimeOut = 200)
public void infinteLoopTest()
{
	int i=1;
	while (i==1)
	{
		System.out.println("print i "+i);
	}
}
	
	@Test(invocationTimeOut = 200,expectedExceptions = NumberFormatException.class) // This function will pass (this can be used instead of Try and Catch
	public void infinteLoopTest1()
	{
		String X = "100A";
		Integer.parseInt(X);
	}
}
