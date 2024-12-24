package Tabs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PIB {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://pib.gov.in");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.linkText("Ministry of Education")).click();
		driver.switchTo().alert().accept();
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle());
		}
		driver.quit();
		

	}

}
