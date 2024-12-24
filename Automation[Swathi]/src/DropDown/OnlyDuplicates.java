package DropDown;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicates {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/FCI/Desktop/MultiDropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<WebElement> Allopt = s.getOptions();
		Set<String> ts = new TreeSet();
		int count=0;
		for(int i=0;i<Allopt.size();i++)
		{
			String text = Allopt.get(i).getText();
			boolean res = ts.add(text);
			if(res==false)
			{
				System.out.println(text);
				break;
			}
		
		}
		
		driver.quit();

	}

}
