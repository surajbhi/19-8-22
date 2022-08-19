package udemyPractice;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
	@AfterSuite
	public void Suite()
	{
	System.out.println("I am last suite");	
	}
	
	@Test(groups= {"smoke"})
public void demo()
{
System.out.println("helllo");
Assert.assertTrue(false);//explicitly fails
}

	@Test(enabled=false)
	public void demo1()
	{
	System.out.println("helllo1");
	}
	
	@BeforeTest
	public void Last() {
		System.out.println("I will execute first");
	}
}
