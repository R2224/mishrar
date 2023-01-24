package HandlingPopups;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FounditResumeUploadHandelpopUP 
{

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.foundit.in");
        driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
       WebElement link=driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]"));
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].click()",link);
      WebElement upload= driver.findElement(By.xpath("//input[contains(@id,'file-upload')]"));
      js.executeScript("arguments[0].click()",upload);
      StringSelection file=new StringSelection("\"C:\\Users\\wwwra\\OneDrive\\Documents\\application.docx\"");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
      
      Robot r=new Robot();
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     r.keyPress(KeyEvent.VK_TAB);
     r.keyPress(KeyEvent.VK_TAB);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_CONTROL);
     r.keyRelease(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_TAB);
     r.keyRelease(KeyEvent.VK_ENTER);
	}

}
