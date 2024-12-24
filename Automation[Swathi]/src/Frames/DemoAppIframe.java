package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppIframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Frames']")).click();
		driver.findElement(By.xpath("//section[text()='iframes']")).click();Thread.sleep(2000);
		driver.findElement(By.linkText("Nested with Multiple iframe")).click();
		driver.switchTo().frame(0);Thread.sleep(2000);
		String email1 = driver.findElement(By.xpath("(//p[@class='para'])[1]")).getText();Thread.sleep(2000);
		String pwd = driver.findElement(By.xpath("(//p[@class='para'])[2]")).getText();
		String conpwd = driver.findElement(By.xpath("(//p[@class='para'])[3]")).getText();
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email1);Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath("//input[@id='confirm']")).sendKeys(conpwd);Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		
		
		
		
		
		
		

	}

}
