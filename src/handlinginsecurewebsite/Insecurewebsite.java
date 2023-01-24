package handlinginsecurewebsite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Insecurewebsite 
{

	public static void main(String[] args) 
	{
		ChromeOptions opt=new ChromeOptions();
		opt.setAcceptInsecureCerts(true);
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://eporner.com");

	}

}
