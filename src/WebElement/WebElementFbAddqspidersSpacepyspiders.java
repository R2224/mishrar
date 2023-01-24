package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFbAddqspidersSpacepyspiders 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.facebook.com");
         driver.manage().window().maximize();
         WebElement username=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
         username.sendKeys("qspiders");
         username.sendKeys(Keys.SPACE );
         username.sendKeys("pyspiders");

	}

}
