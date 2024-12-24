package TestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingScreenShotwebele {
	@Test
	public void demo1() throws IOException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.omnidesigntech.com/");
		WebElement logo = driver.findElement(By.className("logo"));
		File src = logo.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/omnilogo.png");
		FileUtils.copyFile(src, dest);
		driver.quit();
	}


	}


