package DropDownList;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FbCreateNewAccountSelectDOBDropDownList 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(1000);
		WebElement list1=driver.findElement(By.id("day"));
		list1.click();
		Select sel1=new Select(list1);
		sel1.selectByIndex(26);
		WebElement list2=driver.findElement(By.id("month"));
		list2.click();
		Select sel=new Select(list2);
		sel.selectByVisibleText("Nov");
		WebElement list3=driver.findElement(By.id("year"));
		Select sel3=new Select(list3);
		sel3.selectByValue("1995");
		
		
	

	}

}
