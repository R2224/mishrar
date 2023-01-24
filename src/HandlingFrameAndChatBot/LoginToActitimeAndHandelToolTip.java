package HandlingFrameAndChatBot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToActitimeAndHandelToolTip 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://demo.actitime.com");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        driver.findElement(By.xpath("//div[text()='Login ']")).click();
        WebElement tooltip=driver.findElement(By.xpath("//div[@class='supportQuestionButton']"));
        String text=tooltip.getAttribute("class");
        if(text.equals("Got a question?"))
        {
        	System.out.println("text is matching");
        	
        }
        else
        {
        	System.out.println("text is not matching");
        }
	}

}
