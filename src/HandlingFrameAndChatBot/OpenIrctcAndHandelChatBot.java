package HandlingFrameAndChatBot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class OpenIrctcAndHandelChatBot 
{

	public static void main(String[] args)
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notifications");
	   System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver(option);
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    driver.findElement(By.xpath("//img[@id='disha-banner-close']")).click();
	    driver.findElement(By.xpath("//div[@id='askDishaLuncher']")).click();
	    driver.switchTo().frame("Disha-Bot");
	   WebElement textfield=driver.findElement(By.xpath("//div[contains(text(),'Select Your Source Station')]"));
        Actions act=new Actions(driver);
        act.click(textfield).perform();
       WebElement textfield2=driver.findElement(By.id("station-textbox"));
       textfield2.sendKeys("cuttack");
       WebElement cuttacklink=driver.findElement(By.xpath("//p[contains(text(),'Cuttack')]"));
       act.click(cuttacklink).perform();
       WebElement from=driver.findElement(By.xpath("//div[contains(text(),'Select Your Destination Station')]"));
       act.click(from).perform();
       WebElement from2=driver.findElement(By.xpath("//input[contains(@id,'station-textbox')]"));
        from2.sendKeys("bhubaneswar");
        WebElement bbsrlink=driver.findElement(By.xpath("//p[contains(text(),'Bhubaneswar')]"));
        act.click(bbsrlink).perform();    
        WebElement text=driver.findElement(By.xpath("//input[contains(@id,'text')]"));
        text.sendKeys("hey machaa");
	}

}
