package Tabs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("apple iphone 16 pro max"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[contains(text(),'Apple iPhone 16 Pro Max')])[1]")).click();
		Set<String> allwid = driver.getWindowHandles();
		for (String wid: allwid) {
			driver.switchTo().window(wid);
			
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='NOTIFY ME']")).click();
		

	}

}
