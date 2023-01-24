package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFbAddJspiderBeforeQspider
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.facebook.com");
         driver.manage().window().maximize();
         WebElement username=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
         username.sendKeys("qspiders");
         for(int i=0;i<=7;i++)
         {
        	 Thread.sleep(1000);
        	 username.sendKeys(Keys.ARROW_LEFT);
        	
         }
         
         username.sendKeys("jspiders");
         username.sendKeys(Keys.SPACE);
	}

}
