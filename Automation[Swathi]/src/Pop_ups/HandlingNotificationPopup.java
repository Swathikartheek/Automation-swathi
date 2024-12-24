package Pop_ups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopup {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();Thread.sleep(2000);
		options.addArguments("--disable-notifications");Thread.sleep(2000);
		WebDriver driver=new ChromeDriver(options);Thread.sleep(2000);
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.get("https://www.irctc.co.in/nget/train-search");Thread.sleep(2000);

	}

}
