package HandlingPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriChildBrowserPopUp 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com");
	WebElement companies=driver.findElement(By.xpath("//div[text()='Companies']"));
	WebElement MNC=driver.findElement(By.xpath("//div[text()='MNC']"));
	Actions act=new Actions(driver);
	act.moveToElement(companies).perform();
	Thread.sleep(2000);
	act.click(MNC).perform();
	WebElement fortune=driver.findElement(By.xpath("//div[.='Fortune 500']"));
	System.out.println(fortune.getText());
	
	for(int i=0;i<=0;i++)
	{
	driver.findElement(By.xpath("//div[contains(@class,'swiper-wrapper ')]//div[13]")).click();
	driver.findElement(By.xpath("//div[.='Fortune 500']")).click();
	
	}
	
	
	 for(int j=0;j<=1;j++)
	 {
		   driver.findElement(By.xpath("//div[contains(@class,'swiper-wrapper ')]//div[13]")).click();
		   driver.findElement(By.xpath("//div[.='Fortune 500']")).click();
		
	 }
	
	 for(int k=0;k<=2;k++)
	 {
		 driver.findElement(By.xpath("//div[contains(@class,'swiper-wrapper ')]//div[13]")).click();
		 driver.findElement(By.xpath("//div[.='Fortune 500']")).click();
		
	 }
	
	
	}

}
