package HandlingPopups;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FresherWorldAndSwitchChildBrowser 
{

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.freshersworld.com");
		WebElement placmentpaper=driver.findElement(By.xpath("//span[text()='Placement Paper']"));
         Actions act=new Actions(driver);
           act.moveToElement(placmentpaper).perform();
           act.moveToElement(placmentpaper).perform();
           WebElement more=driver.findElement(By.xpath("(//a[@title='Placement Papers'])[2]"));
          JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("arguments[0].click()",more);
          driver.findElement(By.xpath("//a[.=' Capgemini']")).click();
          Set<String> windowhandels=driver.getWindowHandles();

          act.sendKeys(Keys.CONTROL);
          act.sendKeys(Keys.TAB);
          

	}

}
