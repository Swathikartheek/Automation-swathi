package HandlingMultipleElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksAmazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
	    List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    int count = allLinks.size();
	    System.out.println(count);
	    for (WebElement ele : allLinks) {
	    	String text = ele.getText();
	    	System.out.println(text);
			
		}
	    driver.quit();
		

	}

}
