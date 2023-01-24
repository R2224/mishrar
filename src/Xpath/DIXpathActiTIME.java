package Xpath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DIXpathActiTIME
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
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[contains(text(),'Types of Work')]")).click();
	      driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
	      driver.findElement(By.xpath("(//input[contains(@name,'name')])[2]")).sendKeys("Rahul");
	      driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();
	      driver.findElement(By.xpath("//a[contains(text(),'Rahul')]/../..//a[contains(text(),'delete')]")).click();
	      Alert alert=driver.switchTo().alert();
	      System.out.println(alert.getText());
	      Thread.sleep(1000);
	      alert.accept();
	     // alert.dismiss();
	      
	}

}
