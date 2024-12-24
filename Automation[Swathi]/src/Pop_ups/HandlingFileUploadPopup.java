package Pop_ups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		Thread.sleep(2000);
		File f=new File("./File/API Test Cases.xlsx");
		String abspath = f.getAbsolutePath();
		driver.findElement(By.id("fileInput")).sendKeys(abspath);

	}

}
