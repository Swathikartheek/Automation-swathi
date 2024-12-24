package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.linkText("Button")).click();
		driver.findElement(By.linkText("Double Click")).click();
		WebElement doubleClick = driver.findElement(By.id("btn20"));
		Actions a=new Actions(driver);
		a.doubleClick(doubleClick).perform();
		boolean res = driver.findElement(By.xpath("//span[@class='text-green-600 p-1 px-2 ms-2 rounded-md']")).isDisplayed();
		if(res)
		{
			System.out.println("text is displayed");
		}
		else
		{
			System.out.println("text is not displayed");
		}
	}

}
