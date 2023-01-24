package HandlingPopups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraChildBrowserPopUp 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		WebElement menlink=driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		WebElement jacketlink=driver.findElement(By.xpath("(//a[.='Jackets'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(menlink).build().perform();
		Thread.sleep(1000);
		act.click(jacketlink).perform();
		WebElement brands=driver.findElement(By.xpath("//span[.='Brand']"));
		WebElement hrx=driver.findElement(By.xpath("//label[contains(text(),'HRX by Hrithik Roshan')]"));
		WebElement wrogn=driver.findElement(By.xpath("//label[contains(text(),'WROGN')]"));
		act.moveToElement(brands).perform();
        Thread.sleep(1000);
        act.click(hrx).perform();
        Thread.sleep(1000);
        act.click(wrogn).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//h4[contains(text(),'Solid Padded Jacket')])[1]")).click();
        Set<String> windowhandels=driver.getWindowHandles();
        ArrayList<String> al=new ArrayList<>(windowhandels);
        for(int i=0;i<al.size();i++)
        {
        	driver.switchTo().window(al.get(i));
        	String title=driver.getTitle();
        	if(title.contains("Buy HRX By Hrithik"))
        	{
        		driver.findElement(By.xpath("//p[text()='M']")).click();
        		Thread.sleep(3000);
        		driver.findElement(By.xpath("//div[contains(@class,'pdp-add-to-b')]")).click();
        		driver.findElement(By.xpath("//span[.='Bag']")).click();
        		WebElement pincode=driver.findElement(By.xpath("//button[contains(@class,'css-1qjnrii')]"));
        		JavascriptExecutor js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].click()",pincode);
        		driver.findElement(By.id("pincode")).sendKeys("753003");
        		driver.findElement(By.xpath("//div[text()='CHECK']")).click();
        		WebElement placeorder= driver.findElement(By.xpath("//button[contains(@class,'css-etguer')]"));
        		js.executeScript("arguments[o].click()",placeorder);
        	}
        }
        
		

	}

}
