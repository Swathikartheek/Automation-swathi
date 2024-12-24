package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count = allsugg.size();
		System.out.println(count);
		for (WebElement ele : allsugg) {
			String text = ele.getText();
			System.out.println(text);
			
		}
		allsugg.get(count-1).click();

	}

}
