package udemyPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2 {
	@BeforeClass
	public void Beforeclass()
	{
	System.out.println("I am before class");
	}
	
	@Test(groups= {"smoke"})
	public void demo()
	{
	System.out.println("helllo3");
	}
	
	@AfterClass
	public void Afterclass()
	{
	System.out.println("I am After class");
	}
}
