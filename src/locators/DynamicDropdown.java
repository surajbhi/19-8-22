package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='VTZ']")).click();

		//driver.findElement(By.xpath("//a[@value='TRV'][1]")).click();
		//to avoid indexing we can use parent child traversing
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='TRV']"))
				.click();
		System.out.println(driver.findElement(By.xpath("//a[@value='VTZ']")).getText());
		System.out.println(driver.findElement(By.xpath("//a[@value='TRV'][1]")).getText());
		Thread.sleep(2000);
		driver.quit();
	}

}
