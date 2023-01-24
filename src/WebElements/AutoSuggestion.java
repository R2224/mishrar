package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		System.out.println(suggestions.size());
		//by using index value
		suggestions.get(7).click();
		
		//by using keboard function
		
		for(int i=0;i<=5;i++)
		{
			Thread.sleep(1000);
		search.sendKeys(Keys.ARROW_DOWN);
		}
		search.sendKeys(Keys.ENTER);
		
		
		//by using loop
		for(int i=0;i<suggestions.size();i++)
		{
			
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium webdriver"))
			{	
				suggestions.get(i).click();
				break;
			}
		}
		

	}

}
