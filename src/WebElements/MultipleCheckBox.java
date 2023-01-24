package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCheckBox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/wwwra/OneDrive/Desktop/Automation/Automation/HTML/java.html");
         List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
         System.out.println(checkbox.size());
         // click on all the checkboxes
         for(int i=0;i<checkbox.size();i++)
         {
        	 Thread.sleep(1000);
        	 checkbox.get(i).click();
         }   
         //click on alternative checkbox
         for(int i=0;i<checkbox.size();i+=2)
         {
        	 Thread.sleep(1000);
        	 checkbox.get(i).click();
         }
         //click on alternative checkbox in reverse order
         for(int i=checkbox.size()-2;i>=0;i-=2)
         {
        	 Thread.sleep(1000);
        	 checkbox.get(i).click();
         }
         
	}

}
