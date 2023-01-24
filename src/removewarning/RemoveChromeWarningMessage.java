package removewarning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RemoveChromeWarningMessage 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.wikipedia.com");		

	}

}
