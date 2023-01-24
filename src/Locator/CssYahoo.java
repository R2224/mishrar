package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssYahoo 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://login.yahoo.com/account/create?");
         driver.manage().window().maximize();
         driver.findElement(By.cssSelector("input[name='firstName']")).sendKeys("Rahul");
         driver.findElement(By.cssSelector("input[name='lastName']")).sendKeys("Mishra");
         driver.findElement(By.cssSelector("input[name='userId']")).sendKeys("www.zara.com");
         driver.findElement(By.cssSelector("input[name='password']")).sendKeys("qspider");
         driver.findElement(By.cssSelector("input[name='birthYear']")).sendKeys("1995");
	}

}
