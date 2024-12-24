package DisabledElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/FCI/Desktop/disabled%20element.html");
		driver.findElement(By.id("t1")).sendKeys("virat");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("document.getElementById('t2').value='anushka'");
		//js.executeScript("document.getElementById('t2').value='   '");
		//js.executeScript("document.getElementById('t2').click()");

	}

}
