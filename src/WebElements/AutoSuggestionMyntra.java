package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionMyntra
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'desktop-main')])[1]")).click();
		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("levis");
		Thread.sleep(2000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//Li[contains(text(),'Levis')]"));
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)
		{
			
			if(suggestions.get(i).getText().equalsIgnoreCase("Levis Men Jackets"))
			{	
				suggestions.get(i).click();
				break;
			}
		}
		List<WebElement> suggestions3=driver.findElements(By.xpath("//input[contains(@class,'price-input')]"));
		System.out.println(suggestions3.size());
		for(int k=0;k<suggestions3.size();k++)
		{
			if(suggestions3.get(k).getText().equalsIgnoreCase("Rs. 5173 to Rs. 7982"))
			{
				suggestions3.get(k).click();
				break;
			}
		}
		List<WebElement> suggestions2=driver.findElements(By.xpath("//label[contains(@class,'common-customCheckbox')]"));
		System.out.println(suggestions2.size());
		for(int j=0;j<suggestions2.size();j+=2)
		{
			Thread.sleep(2000);
			suggestions2.get(j).click();
			
		}
		
		
		

	}

}
