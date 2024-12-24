package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;

public class basic1 {

	public static void test(WebDriver driver) throws InterruptedException{
		driver.get("https://www.facebook.com");Thread.sleep(2000);
		@Nullable
		String title = driver.getTitle(); Thread.sleep(2000);
		System.out.println(title);
		driver.quit();

	}

}
