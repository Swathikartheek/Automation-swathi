package DropDown;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/FCI/Desktop/MultiDropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<WebElement> allopt = s.getOptions();
		
		for(int i=0;i<allopt.size();i++)
		{
			s.selectByIndex(i);
			Thread.sleep(1000);
		}
		for(int i=allopt.size()-1;i<=0;i--)
		{
			s.deselectByIndex(i);
			Thread.sleep(1000);
		}
		for (WebElement opt : allopt) {
			String text = opt.getText();
			s.selectByVisibleText(text);
			Thread.sleep(1000);
		}
		for (WebElement ele : allopt) {
			@Nullable
			String value = ele.getAttribute("value");
			s.deselectByValue(value);
			Thread.sleep(1000);
			
		}
	

	}

}
