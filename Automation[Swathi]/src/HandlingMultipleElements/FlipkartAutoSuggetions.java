package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSuggetions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("apple iphone 16 pro");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'apple iphone')]"));
		for (WebElement ele : allsugg) {
			String text = ele.getText();
			System.out.println(text);
			
		}
		driver.quit();

	}

}
