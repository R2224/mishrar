package HandlingMouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHoveringMyntra 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.myntra.com");
	 WebElement menlink=driver.findElement(By.xpath("//a[.='Men']"));
	 WebElement jacketslink=driver.findElement(By.xpath("(//a[.='Jackets'])[1]"));
	 Actions act=new Actions(driver);
	 act.moveToElement(menlink).perform();
	 Thread.sleep(1000);
	 act.click(jacketslink).perform();
	 
	 
	 

	}

}
