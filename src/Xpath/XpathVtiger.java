package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathVtiger 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://crmaccess.vtiger.com/log-in/?");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("$Rahul$");
	     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("cuttack");
	     Thread.sleep(3000);
	     driver.close();

	}

}
