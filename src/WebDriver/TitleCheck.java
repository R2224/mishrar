package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TitleCheck 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.navigate().to("http://www.google.com");
	      String actualtitle= driver.getTitle();
	      if(actualtitle.equals("Google"))
	      {
	    	  System.out.println("matching");
	      }
	      else
	      {
	    	  System.out.println("not matching");
	      }
	}

}
