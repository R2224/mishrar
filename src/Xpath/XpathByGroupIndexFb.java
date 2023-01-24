package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndexFb
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.navigate().to("http://www.facebook.com");
          driver.manage().window().maximize();
          driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
	}

}
