package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/FCI/Desktop/MultiDropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		boolean res = s.isMultiple();
		if(res==true)
		{
			System.out.println("dropdown is multi select");
		}
		else
		{
			System.out.println("dropdown is single select");
		}
		
		WebElement options = s.getWrappedElement();
		System.out.println(options);
		driver.quit();

	}

}
