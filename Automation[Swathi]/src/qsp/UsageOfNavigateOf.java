package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigateOf {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");Thread.sleep(2000);
		
		driver.navigate().to("https://www.instagram.com");
		Thread.sleep(1000);
		driver.navigate().back();Thread.sleep(1000);
		driver.navigate().forward();Thread.sleep(1000);
		driver.navigate().refresh();Thread.sleep(1000);
		driver.quit();

	}

}
