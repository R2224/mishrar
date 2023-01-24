package waystorefreshwebpage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Refreshwebpage 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
	     Robot r=new Robot();
		r.keyPress(KeyEvent.VK_F5);
		r.keyRelease(KeyEvent.VK_F5);
		 
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.get(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.navigate().to(driver.getCurrentUrl());
		
		

	}

}
