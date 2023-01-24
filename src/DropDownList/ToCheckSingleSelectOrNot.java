package DropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToCheckSingleSelectOrNot 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.get("file:///C:/Users/wwwra/OneDrive/Desktop/Automation/Automation/HTML/dropdownlist.html");
           driver.manage().window().maximize();
           WebElement listbox=driver.findElement(By.xpath("//select[@name='students']"));
   		   Select sel=new Select(listbox);
   		   System.out.println(sel.isMultiple()); 
		
		

	}

}
