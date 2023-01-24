package HandlingPopups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandels 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
		
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		
		Set<String> windowhandles=driver.getWindowHandles();
		System.out.println(windowhandles);
		
		
	}

}
