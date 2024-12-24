package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleURL {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		List<WebElement> allLinks = driver.findElements(By.xpath("//cite[@role='text']"));
		for (WebElement ele: allLinks) {
			String text = ele.getText();	
			System.out.println(text);
		}
		driver.quit();

	}

}
