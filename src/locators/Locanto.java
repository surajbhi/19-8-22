package locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locanto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome driver 2\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://rahulshettyacademy.com/locatorspractice/");
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.findElement(By.id("inputUsername")).sendKeys("surajbhirde");
driver.findElement(By.name("inputPassword")).sendKeys("ravindra");
driver.findElement(By.className("signInBtn")).click();
System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("suraj");
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("abc@gmail.com");
driver.findElement(By.xpath("//form/input[3]")).sendKeys("8624089141");
driver.findElement(By.xpath("//div/button[2]")).click();
System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
driver.findElement(By.cssSelector(".go-to-login-btn")).click();
Thread.sleep(1000);
driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("suraj");
driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
driver.findElement(By.id("chkboxOne")).click();
driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
Thread.sleep(5000);
driver.quit();

}
}
