package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteWithoutShortCutKey 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	      WebElement username=driver.findElement(By.id("email"));
	      username.sendKeys("rahul");
	      String usernamedata=username.getAttribute("value");
          WebElement password=driver.findElement(By.id("pass"));
          password.sendKeys(usernamedata);
          String passworddata=password.getAttribute("value");
          if(passworddata.equals(usernamedata))
          {
        	  System.out.println("matching hela");
          }
          else
          {
        	  System.out.println("matching helani");
          }
	}

}
