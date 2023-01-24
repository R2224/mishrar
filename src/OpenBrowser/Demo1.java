package OpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1 
{
static
{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
System.setProperty("webdriver.edgedriver.driver","./drivers/msedgedriver.exe");

}
public static void test(ChromeDriver driver)
{
     System.out.println("chrome browser is open");	
}
public static void test(EdgeDriver driver)
{
	System.out.println("edge browser is open");
}
	public static void main(String[] args)
	{
	
	 ChromeDriver driver1= new ChromeDriver();
	 Demo1.test(driver1);
     EdgeDriver driver2= new EdgeDriver();
     Demo1.test(driver2);
	}

}
