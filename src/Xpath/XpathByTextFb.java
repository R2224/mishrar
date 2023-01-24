package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathByTextFb
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.navigate().to("http://www.facebook.com");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//a[.='Create a Page']")).click();
       Thread.sleep(2000);
       driver.navigate().back(); 
       driver.findElement(By.xpath("//a[.='Create New Account']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//a[contains(text(),'Privacy Policy')])[2]")).click();
      
	}

}
