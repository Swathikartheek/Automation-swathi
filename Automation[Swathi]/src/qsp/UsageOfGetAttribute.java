package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.name("login"));
		Thread.sleep(2000);
		login.click();
		WebElement pwd = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
		String tagname = pwd.getTagName();
		String text = pwd.getText();
		String attribute = pwd.getAttribute("href");
		Thread.sleep(2000);
		
		String size = driver.findElement(By.xpath("//div[contains(text(),'The email address or mobile')]")).getCssValue("font-size");
		String color = driver.findElement(By.xpath("//div[contains(text(),'The email address or mobile')]")).getCssValue("color");
		
		System.out.println(tagname);
		System.out.println(text);
		System.out.println(attribute);
		System.out.println(size);
		System.out.println(color);
		driver.quit();
		
		
		
		

	}

}
