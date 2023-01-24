package HandlingMouseOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement men=driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions act=new Actions(driver);
		act.click(men).perform(); 
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Levis");
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.xpath("//li[contains(text(),'Levis')]"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase("Levis Tshirts"))
			{
				list.get(i).click();
				break;
			}
		}
		WebElement categories=driver.findElement(By.xpath("//span[text()='Categories']"));
		act.moveToElement(categories).perform();
		WebElement Tshirts=driver.findElement(By.xpath("//label[text()='Tshirts']"));
		act.click(Tshirts).perform();
	}

}
