package Tabs;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareINSURANCEtAB {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/");
		Thread.sleep(2000);
		//driver.findElement(By.id("exitpopup_close")).click();
		driver.findElement(By.id("renew_nav")).click();
		Thread.sleep(2000);
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			
		}
		Thread.sleep(2000);
		driver.findElement(By.id("policynumber")).sendKeys("123"+Keys.ENTER);
		driver.findElement(By.id("dob")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(month);
		//List<WebElement> allele = s1.getOptions();
		//for (WebElement ele : allele) {
			s1.selectByValue("6");
		//}
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(year);
		//List<WebElement> allopt = s2.getOptions();
		//for (WebElement opt : allopt) {
			s2.selectByVisibleText("1981");
			
		//}
		Thread.sleep(2000);
		driver.findElement(By.linkText("7")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("alternative_number")).sendKeys("987645432");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		Thread.sleep(2000);
		boolean msg = driver.findElement(By.id("policynumberError")).isDisplayed();
		if(msg==true)
		{
			System.out.println("The text is displayed");
		}
		else
		{
			System.out.println("The text is not displayed");
		}
		
	

	}

}
