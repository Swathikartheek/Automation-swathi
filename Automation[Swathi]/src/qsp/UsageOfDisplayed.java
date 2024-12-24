package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfDisplayed {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		boolean displayed = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		if(displayed)
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();

	}

}
