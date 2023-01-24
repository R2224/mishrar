package differentwayofenterningcharactersequence;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Charactersquence 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement text=driver.findElement(By.xpath("//input[@class='gLFyf']"));
				text.sendKeys("selenium");
		((JavascriptExecutor)driver).executeScript("window.open()");
		 ArrayList<String> tab=new ArrayList<>(driver.getWindowHandles());
          driver.switchTo().window(tab.get(1));
          driver.get("https://www.youtube.com");
          WebElement textfield= driver.findElement(By.xpath("//input[@id='search']"));
          JavascriptExecutor js=(JavascriptExecutor)driver;
          js.executeScript("arguments[0].value='selenium'",textfield); 
          Thread.sleep(2000);
          driver.switchTo().window(tab.get(0));
          for(int i=0;i<=8;i++)
          {
        	  Thread.sleep(1000);
          text.sendKeys(Keys.BACK_SPACE);
          }
          StringBuffer str=new StringBuffer();
          str.append("rahul");
          str.append(" ");
          str.append("mishra");
          text.sendKeys(str);
          Thread.sleep(2000);
          ((JavascriptExecutor)driver).executeScript("window.open()");
          ArrayList<String> tab1=new ArrayList<>(driver.getWindowHandles());
          driver.switchTo().window(tab1.get(2));
          driver.get("https://www.google.com");
          WebElement text2=driver.findElement(By.xpath("//input[@class='gLFyf']"));
          StringBuilder sbl=new StringBuilder();
          sbl.append("hey");
          sbl.append(" ");
          sbl.append("maacha");
          text2.sendKeys(sbl);
           
	}

}
