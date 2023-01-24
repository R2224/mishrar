package Locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleOfOrangehrm
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	      driver.manage().window().maximize();
	      String actualtitle=driver.getTitle();
	      if(actualtitle.equals("OrangeHRM"))
	      {
	    	  System.out.println("title matching");
	      }
	      else
	      {
	    	  System.out.println("title not matching");
	      }

	}

}
