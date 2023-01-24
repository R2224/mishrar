package differentwayofenterningcharactersequence;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class charsequence1 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement text=driver.findElement(By.xpath("//input[@class='gLFyf']"));
	    text.sendKeys("selenium");
	   StringBuffer sb=new StringBuffer();
	   sb.append(" ");
	   sb.append("by");
	   sb.append(" ");
	   sb.append("rahul");
	   text.sendKeys(sb);
		
		

	}

}
