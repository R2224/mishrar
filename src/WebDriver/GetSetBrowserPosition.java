package WebDriver;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSetBrowserPosition 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.manage().window().getPosition());
		Point p=new Point(300,300);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());

	}

}
