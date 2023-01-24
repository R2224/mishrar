package HandlingMouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
        WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
        Actions act=new Actions(driver);
        Thread.sleep(1000);
        act.doubleClick(link).perform();

	}

}
