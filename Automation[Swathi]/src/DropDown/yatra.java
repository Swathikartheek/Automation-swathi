package DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//span[text()='Bus']")).click();
		driver.findElement(By.xpath("//input[@id='input-with-icon-adornment']/../../fieldset)")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		driver.findElement(By.id("input-with-icon-adornment")).sendKeys("shimoga");
		Thread.sleep(2000);
		driver.quit();
		

	}

}
