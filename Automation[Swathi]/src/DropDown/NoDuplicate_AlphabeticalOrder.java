package DropDown;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoDuplicate_AlphabeticalOrder {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/FCI/Desktop/MultiDropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		Set<String> ts=new TreeSet();
		List<WebElement> AllOpt = s.getOptions();
		for(WebElement opt:AllOpt)
		{
			String text = opt.getText();
			ts.add(text);
		}
		for(String s1:ts)
		{
			System.out.println(s1);
		}
		driver.quit();
		

	}

}
