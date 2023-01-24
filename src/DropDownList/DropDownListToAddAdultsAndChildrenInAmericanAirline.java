package DropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListToAddAdultsAndChildrenInAmericanAirline 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.americanairlines.in/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement list=driver.findElement(By.xpath("//select[@name='adults']"));
        list.click();
        Select sel=new Select(list);
        sel.selectByVisibleText("4");
        WebElement list2=driver.findElement(By.xpath("//select[@name='children']"));
        list2.click();
        Select sel2=new Select(list2);
        Thread.sleep(1000);
        sel2.selectByValue("3");
        
	}

}
