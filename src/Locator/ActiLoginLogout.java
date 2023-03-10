package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiLoginLogout
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().window().maximize();
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("keepLoggedInLabel")).click();
	      driver.findElement(By.partialLinkText("Login")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.id("logoutLink")).click();
	}

}
