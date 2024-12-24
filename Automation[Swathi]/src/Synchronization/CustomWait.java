package Synchronization;

import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://online.actitime.com/ssandeep/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);
		for(int i=1;i<100;i++)
		{
			try
			{
				driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
				break;
			}
			catch(NoSuchElementException e)
			{
				System.out.println(i);
			}
			
		}

	}

}
