package Pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingPrintPopup {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_P);Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_CONTROL);Thread.sleep(2000);
		for(int i=1;i<=3;i++)
		{
			r.keyPress(KeyEvent.VK_TAB);
		}
		Thread.sleep(2000);
		for(int i=1;i<=4;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			
		}
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_1);
		r.keyPress(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);
		r.keyPress(KeyEvent.VK_ENTER);
		

	}

}
