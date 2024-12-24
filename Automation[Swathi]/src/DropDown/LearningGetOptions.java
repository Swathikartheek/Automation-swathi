package DropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearningGetOptions {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	List<WebElement> allEle = s.getOptions();
	for(WebElement ele:allEle) 
	{
		System.out.println(ele.getText());
	}
	driver.quit();
	

	}

}
