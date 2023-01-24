package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangehrmLoginLogout 
{

	public static void main(String[] args) throws InterruptedException 
 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      driver.findElement(By.name("username")).sendKeys("Admin");
	      driver.findElement(By.name("password")).sendKeys("admin123");
	      Thread.sleep(3000);
	      driver.findElement(By.className("oxd-button")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.className("oxd-userdropdown-name")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.partialLinkText("Logout")).click();
	      
	      

	}

}
