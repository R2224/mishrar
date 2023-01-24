package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssVtiger 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://crmaccess.vtiger.com/log-in/?");
	     driver.manage().window().maximize();
	     driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("$Rahul$");
	     driver.findElement(By.cssSelector("input[name='password']")).sendKeys("cuttack");
	     Thread.sleep(3000);
	     driver.close();
	}

}
