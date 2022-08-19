package udemyPractice;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class4 {
	
@Test(groups= "smoke")
public void WebloginHomeLoan()
{
System.out.println("WebloginHomeLoan");	
}

@Test(timeOut=4000)
public void MobileloginHomeLoan()
{
System.out.println("MobileloginHomeLoan");	
}


@BeforeSuite
public void Suite()
{
System.out.println("I am suite");	
}
@Test(dependsOnMethods= {"WebloginHomeLoan","MobileloginHomeLoan"})
public void ApiloginHomeLoan()
{
System.out.println("ApiloginHomeLoan");	
}

}
