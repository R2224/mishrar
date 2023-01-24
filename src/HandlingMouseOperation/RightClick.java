package HandlingMouseOperation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
        WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
        Actions act=new Actions(driver);
        Thread.sleep(1000);
        act.contextClick(link).perform();
        Robot r=new Robot();
        for(int i=0;i<=5;i++)
        {
        	Thread.sleep(1000);
        	r.keyPress(KeyEvent.VK_DOWN);
        }
         r.keyPress(KeyEvent.VK_ENTER);
         r.keyRelease(KeyEvent.VK_DOWN);
         r.keyRelease(KeyEvent.VK_ENTER);
	}

}
