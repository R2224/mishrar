package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.facebook.com");
	      driver.findElement(By.className("inputtext")).sendKeys("madhuri");
	      driver.findElement(By.name("pass")).sendKeys("@2224");
	      Thread.sleep(3000);
	      driver.findElement(By.name("login")).click();
	      }

}
