package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathInstagram 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.linkText("Sign up")).click();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//input[@name='emailOrPhone']")).sendKeys("9438526579");
	     driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Rahul Mishra");
	     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("$Rahul$");
	     driver.findElement(By.xpath("//input[@type='password']")).sendKeys("cuttack");
	     Thread.sleep(3000);
	     driver.close();

	}

}
