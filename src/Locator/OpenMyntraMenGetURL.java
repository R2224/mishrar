package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMyntraMenGetURL
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("MEN")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Jeans")).click();
		System.out.println(driver.getCurrentUrl());
	}

}
