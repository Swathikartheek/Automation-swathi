package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsAlphabeticalOrder{

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/FCI/Desktop/MultiDropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<WebElement> AllEle = s.getOptions();
		List<String> ts=new ArrayList<>();
		
	
		for(int i=0;i<AllEle.size();i++)
		{
			String text=AllEle.get(i).getText();
			ts.add(text);
			
		}
		Collections.sort(ts);
		for(String t:ts)
		{
			System.out.println(t);
		}
		
		
		
		driver.quit();
	

	}

}
