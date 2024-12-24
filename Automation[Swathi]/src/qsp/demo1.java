package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.errorprone.annotations.ThreadSafe;

public class demo1 {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		@Nullable
		String url = driver.getCurrentUrl();
		if (url.contains("google"))
		{
			System.out.println(url);
		}
		else
		{
			System.out.println("test fail");
		}

	}

}
