package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.linkText("Sign Up"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		//r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_W);

	}

}
