package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionforYahooBing
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("yahoo");
		Thread.sleep(2000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//div[contains(@class,'pcTkSc')]"));
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)
		{

			if(suggestions.get(i).getText().equalsIgnoreCase("yahoo login"))
			{	
				suggestions.get(i).click();
				break;
		     }
		
		}
		driver.navigate().back();
		WebElement search2=driver.findElement(By.xpath("//input[@name='q']"));
		search2.sendKeys("microsoft bing");
		Thread.sleep(2000);
		List<WebElement> suggestions2=driver.findElements(By.xpath("//span[contains(text(),'microsoft bing')]"));
		System.out.println(suggestions2.size());
		suggestions2.get(0).click();
		driver.findElement(By.xpath("(//h3[contains(text(),'Bing')])[1]")).click();
		
		}
}
	


