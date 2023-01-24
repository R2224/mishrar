package HandlingPopups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginEnterLeaveNameAndCancel 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[contains(text(),'Login ')])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[contains(@class,'popup_menu_icon')])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Leave Types']")).click();
        Thread.sleep(1000);
       driver.findElement(By.xpath("//span[text()='Create Leave Type']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("(//input[contains(@type,'text')])[5]")).sendKeys("rahul");
       driver.findElement(By.xpath("(//div[text()='Cancel'])[2]")).click();
        Alert al=driver.switchTo().alert();
        System.out.println(al.getText());
        al.accept();
        
       
	}

	
		


}
