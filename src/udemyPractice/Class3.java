package udemyPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class3 {
	@AfterMethod//can be use for deleting cookies
	public void After()
	{
		System.out.println("I will execute After every method in class 3");
	}
	@AfterTest
	public void Last() {
		System.out.println("I will execute last");
	}

	@Test
	public void WebloginCarLoan() {
		System.out.println("WebloginCarLoan");
	}

	@Test
	public void MobileloginCarLoan() {
		System.out.println("MobileloginCarLoan");
	}

	@BeforeMethod//can be use for deleting cookies
	public void Before()
	{
		System.out.println("I will execute before every method in class 3");
	
	}
	@Test(dataProvider="getData")
	public void MobilelogoutCarLoan(String username,String Password) {
		System.out.println("MobilelogoutCarLoan");
		System.out.println(username);
		System.out.println(Password);

	}

	@Test
	public void MobileSignupCarLoan() {
		System.out.println("MobileSignupCarLoan");
	}

	@Test(groups= {"smoke"})
	public void ApiloginCarLoan() {
		System.out.println("ApiloginCarLoan");
	}
	
	@DataProvider
	public Object[][] getData()
	{
	Object[][]data =new Object[3][2];//3 rows ,2 columns
	//1st set
	data[0][0]="firstUsername";
	data[0][1]="firstPassword";
	
	//2nd set
	data[1][0]="SecondUsername";
	data[1][1]="SecondPassword";
	
	//3rd set
		data[2][0]="ThirdUsername";
		data[2][1]="ThirdPassword";
		
		return data;
	
	
	}	
}
