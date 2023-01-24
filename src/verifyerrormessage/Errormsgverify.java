package verifyerrormessage;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Errormsgverify 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.silentOutput","true");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://accounts.google.com/");
        WebElement nextButton=driver.findElement(By.xpath("//span[.='Next']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",nextButton);
        Thread.sleep(2000);
        WebElement errormsg=driver.findElement(By.xpath("//div[@class='o6cuMc']"));
        String msg=errormsg.getText();
        System.out.println(msg);
        if(msg.equals("Enter an email or phone number"))
        {
        	System.out.println("matching hauchi");
        }
        else
        {
        	System.out.println("matching hauni");
        }
        
	}

}
