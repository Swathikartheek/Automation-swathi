package Frames;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HDFCBank {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hdfcbank.com/");
		WebElement login = driver.findElement(By.xpath("(//button[text()='Login'])[1]"));
		Actions a=new Actions(driver);
		a.moveToElement(login).perform();
		driver.findElement(By.xpath("(//a[text()='NetBanking'])[1]")).click();
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			
		}
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
		Set<String> allwid1 = driver.getWindowHandles();
		for (String wid : allwid1) {
			driver.switchTo().window(wid);
			
		}
		List<WebElement> allLang = driver.findElements(By.xpath("//p[contains(text(),'Download the Secure')]"));
		for (WebElement lang: allLang) {
			String text = lang.getText();
			System.out.println(text);
			
		}
		
		

	}

}
