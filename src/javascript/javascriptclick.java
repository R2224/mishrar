package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptclick 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.yahoo.com/?");
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='persistent']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",checkbox);
	}

}
