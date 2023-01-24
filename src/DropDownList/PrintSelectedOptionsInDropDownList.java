package DropDownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintSelectedOptionsInDropDownList 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/wwwra/OneDrive/Desktop/Automation/Automation/HTML/dropdownlist.html");
		WebElement list=driver.findElement(By.xpath("//select[@name='students']"));
         Select sel=new Select(list);
         sel.selectByVisibleText("Dipti");
         sel.selectByValue("chakara");
		sel.selectByIndex(1);
		List<WebElement> selectedoption=sel.getAllSelectedOptions();
		
		System.out.println(selectedoption.size());
		for(int i=0;i<selectedoption.size();i++)
		{
			System.out.println(selectedoption.get(i).getText());
		}
		WebElement option=sel.getFirstSelectedOption();
		System.out.println(option.getText());
	}

}
