package DropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SortTheOptionOfDropDownListInAcendingOrder 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/wwwra/OneDrive/Desktop/Automation/Automation/HTML/dropdownlist.html");
		WebElement listbox=driver.findElement(By.xpath("//select[@name='students']"));
		Select sel=new Select(listbox);
		List<WebElement> option=sel.getOptions();
		System.out.println(option.size());
		for(int i=option.size()-1;i>0;i--)
		{
			System.out.println(option.get(i).getText());
		}

	}

}
