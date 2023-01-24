package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathFbFnSnMobNoPw
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.facebook.com");
         driver.manage().window().maximize();
         driver.findElement(By.linkText("Create New Account")).click();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rahul");
         driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("mishra");
         driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9438526579");
         driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("chup bhosdeke");
         Thread.sleep(3000);
         driver.close();

	}

}
