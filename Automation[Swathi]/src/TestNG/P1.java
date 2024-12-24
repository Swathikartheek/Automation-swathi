package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class P1 {
	@Test
    public void demoA()
	{
		Reporter.log("Welcome");
	}
	@Test
	public void demoB()
	{
		Reporter.log("Hello world", true);
	}
	@Test
	public void democ()
	{
		System.out.println("Bye world");
	}

}
