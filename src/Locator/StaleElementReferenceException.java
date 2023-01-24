package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://en-gb.facebook.com/");
	      WebElement link=driver.findElement(By.partialLinkText("forgot"));
	      link.click();
	      Thread.sleep(3000);
	      WebElement link1=driver.findElement(By.partialLinkText("forgot"));
	      System.out.println(link1.getText());

	}

}
