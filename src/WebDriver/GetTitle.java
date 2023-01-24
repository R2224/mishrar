package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.google.com");
	      //String actualtitle=driver.getTitle();
	      //System.out.println(actualtitle);
	      System.out.println(driver.getTitle());

	}

}
