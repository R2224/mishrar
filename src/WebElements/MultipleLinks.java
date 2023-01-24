package WebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/wwwra/OneDrive/Desktop/Automation/Automation/HTML/java.html");
		List<WebElement> link=driver.findElements(By.xpath("//a"));
	System.out.println(	link.size());
             //to get text and attribute value
	      for(int i=0;i<link.size();i++)
	     {
		    System.out.println(link.get(i).getText()); 
		     System.out.println(link.get(i).getAttribute("href")); 
		     if(link.get(i).getText().equals("Amazon"))
		     {
		    	 link.get(i).click();
		     }
		     
	     }
	      
	}

}
