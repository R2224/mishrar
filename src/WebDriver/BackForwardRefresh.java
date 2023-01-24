
package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BackForwardRefresh 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.navigate().to("http://www.myntra.com");
	      driver.navigate().to("http://www.flipkart.com");
	      driver.navigate().back();
	      driver.navigate().forward();
	      driver.navigate().refresh();
	      

	}

}
