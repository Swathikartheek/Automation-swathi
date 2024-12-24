package Pop_ups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowser4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Url");
		String s=sc.next();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			String text = driver.getTitle();
			if(text.contains(s))
			{
				driver.close();
			}
			
		}
		
		

	}

}
