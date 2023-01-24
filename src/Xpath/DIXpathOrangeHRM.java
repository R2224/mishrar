package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DIXpathOrangeHRM 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
	      driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
	      driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("(//span[contains(@class,'oxd-text oxd-text--span oxd-main-menu-item--name')])[9]")).click();
	      Thread.sleep(3000);
	      WebElement link=driver.findElement(By.xpath("(//p[contains(@class,'oxd-text oxd-text--p orangehrm-directory-card-header --break-words')])[4]/..//p[contains(@class,'oxd-text oxd-text--p orangehrm-directory-card-subtitle --break-words')]"));
	      System.out.println(link.getText());
	}

}