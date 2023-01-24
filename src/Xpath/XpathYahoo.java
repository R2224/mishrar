package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathYahoo 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://login.yahoo.com/account/create?");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Rahul");
       driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Mishra");
       driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("www.zara.com");
       driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qspider");
       driver.findElement(By.xpath("//input[@name='birthYear']")).sendKeys("1995");

	}

}
