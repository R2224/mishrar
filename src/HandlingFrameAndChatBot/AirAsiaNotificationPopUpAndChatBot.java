package HandlingFrameAndChatBot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AirAsiaNotificationPopUpAndChatBot 
{

	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-notification");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.airasia.co.in/home");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[contains(@class,'avm-bot-icon bot-avatar-outline animated')]")).click();
		driver.switchTo().frame("avaamoIframe");
		driver.findElement(By.xpath("//textarea[@id='queryTextbox']")).sendKeys("hey machaa");
		driver.findElement(By.xpath("//button[text()='Send']")).click();
		driver.findElement(By.xpath("//a[@class='close avaamo_popup__close close-bot avm-icon-cross']")).click();
		driver.switchTo().parentFrame();
	}

}
