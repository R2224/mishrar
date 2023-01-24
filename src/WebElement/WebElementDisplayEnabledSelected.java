package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDisplayEnabledSelected
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().window().maximize();
	     WebElement checkbox= driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']"));
	     Thread.sleep(3000);
	     checkbox.click();
	     System.out.println(checkbox.isDisplayed());
	      System.out.println(checkbox.isEnabled());
	      System.out.println(checkbox.isSelected());

	}

}
