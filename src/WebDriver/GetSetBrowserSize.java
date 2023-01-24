package WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowserSize
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://www.google.com");
	      System.out.println(driver.manage().window().getSize());
	      Dimension d=new Dimension(802,702);
	     driver.manage().window().setSize(d);
	     System.out.println(driver.manage().window().getSize());

	}

}
