package testngTutorial;

import org.testng.annotations.Test;

public class TestNGInvocationCountTest {

	@Test(invocationCount = 5)
	public void sum()
	{
		int a,b,c;
		a=10;b=10;
		c=a+b;
		System.out.println("printing C"+c);
	}
}
