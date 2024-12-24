package actitimetestscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateProject {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.linkText("TASKS")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		driver.findElement(By.id("projectPopup_projectNameField")).sendKeys("Fushigi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'-- Please Select Customer ')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@class='x-menu-focus']/..//img[@class='x-menu-item-icon '])[6]")).click();
		driver.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Customer");
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
