package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptscroll 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.myntra.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<=4;i++)
		{
			js.executeScript("window.scrollBy(0,1000)");
		}
		for(int i=0;i<=4;i++)
		{
			js.executeScript("window.scrollBy(0,-1000)");
		}
	}

}
