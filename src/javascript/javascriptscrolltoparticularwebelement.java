package javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptscrolltoparticularwebelement 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://www.wikipedia.com");
        WebElement logo=driver.findElement(By.partialLinkText("Wikinews"));
        int x=logo.getLocation().getX();
        int y=logo.getLocation().getY();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy("+x+","+y+")");
        js.executeScript("arguments[0].click()",logo);

	}

}
