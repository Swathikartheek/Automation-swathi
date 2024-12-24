package Pop_ups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowser2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.id("login-google-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pwid = driver.getWindowHandle();
		Set<String> allwid = driver.getWindowHandles();
		Iterator<String> wid = allwid.iterator();
		while(wid.hasNext())
		{
			String i = wid.next();
			driver.switchTo().window(i);
		
		if(!i.equals(pwid))
		{
			driver.close();
		}
		}
	

	}

}
