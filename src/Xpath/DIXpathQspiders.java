package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DIXpathQspiders 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.navigate().to("https://qspiders.com/contact");
            driver.manage().window().maximize();
           WebElement link= driver.findElement(By.xpath("(//p[contains(@class,'card-header-title')])[18]/../..//span[contains(text(),'+1')]"));
         System.out.println(link.getText());
	}

}
