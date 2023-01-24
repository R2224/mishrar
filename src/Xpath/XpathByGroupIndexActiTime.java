package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByGroupIndexActiTime 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
	      driver.findElement(By.xpath("(//input[contains(@type,'password')])[1]")).sendKeys("manager");
	      Thread.sleep(3000);
	      driver.findElement(By.partialLinkText("Login")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("(//div[contains(@class,'menu_icon')])[4]")).click();
	}

}
