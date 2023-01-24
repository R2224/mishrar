package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionAmericanAirLines 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
        driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("american airlines");
        Thread.sleep(2000);
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//span[text()='American Airlines® - American Airlines® Flights']")).click();
        driver.manage().window().maximize();
       WebElement city= driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
       city.sendKeys("san jose");
       Thread.sleep(3000);
       List<WebElement> suggestions=driver.findElements(By.xpath("//a[contains(text(),'San')]"));
       System.out.println(suggestions.size());
       suggestions.get(1).click();
       WebElement city2= driver.findElement(By.name("destination"));
       city2.sendKeys("San");
       Thread.sleep(3000);
       List<WebElement> suggestions2=driver.findElements(By.xpath("//a[contains(text(),'San')]"));
       System.out.println(suggestions2.size());
       Thread.sleep(1000);
       suggestions2.get(7).click();
	
        
        
	}

}
