package OpenBrowser;

import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenFireFox
{

	public static void main(String[] args) 
	{

		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	       FirefoxDriver driver=new FirefoxDriver();
	       driver.get("http://www.google.com");

	}

}
