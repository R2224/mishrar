package HandlingPopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToSwitchWindowHandles 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com");
	driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
	Set<String> windowhandels=driver.getWindowHandles();
	ArrayList<String> al=new ArrayList<>(windowhandels);
	for(int i=0;i<al.size();i++)
	{
		driver.switchTo().window(al.get(i));
		String title=driver.getTitle();
		if(title.contains("Time Tracking"))
		{
			Thread.sleep(6000);
			driver.findElement(By.xpath("//a[.='Get started']")).click();
		}
		else
		{
			System.out.println("not matching");
		}
		
	}

	}

}
