package actitimetestscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteCustomer {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//span[text()='Customer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='editButton available'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ACTIONS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Delete']")).click();
		driver.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		driver.quit();
		
		
	}

}
