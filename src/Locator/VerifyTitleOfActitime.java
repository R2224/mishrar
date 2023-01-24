package Locator;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleOfActitime
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().window().maximize();
	      String actualtitle=driver.getTitle();
	      if(actualtitle.equals("actiTIME - Login"))
	      {
	    	  System.out.println("title matching");
	      }
	      else
	      {
	    	  System.out.println("title not matching");
	      }
	      driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	      driver.findElement(By.xpath("//a[.='Login ']")).click();
	      Thread.sleep(5000);
	      String homepagetitle= driver.getTitle();
	      System.out.println(homepagetitle);
	      if(homepagetitle.equals("actiTIME - Enter Time-Track"))
	      {
	    	  System.out.println("matching");
	      }
	      else
	      {
	    	  System.out.println("not matching");
	      }
	      
	}
}
