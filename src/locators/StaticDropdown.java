package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
WebElement dd=		driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select s=new Select(dd);
	s.selectByIndex(3);
	System.out.println(s.getFirstSelectedOption().getText());
	s.selectByValue("AED");
	System.out.println(s.getFirstSelectedOption().getText());
	s.selectByVisibleText("INR");
	System.out.println(s.getFirstSelectedOption().getText());
	driver.quit();
	
	}

}
