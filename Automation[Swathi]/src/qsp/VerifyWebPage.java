package qsp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		System.out.println(actualtitle);
		System.out.println(actualUrl);
		String expectedTitle = "google";
		String expectedUrl = "google.com/";
		if(actualtitle.equalsIgnoreCase(expectedTitle) && actualUrl.equalsIgnoreCase(expectedUrl))
			{
				System.out.println("url and title are same");
			}
		else
			{
				System.out.println("url and title are not same");
			}
			driver.quit();
		
		

	}
}
	


