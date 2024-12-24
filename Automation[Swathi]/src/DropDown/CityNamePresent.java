package DropDown;

import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CityNamePresent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city name");
		String cityName= sc.nextLine();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/FCI/Desktop/MultiDropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		int count=0;
	
		List<WebElement> allOpt = s.getOptions();
		for(int i=0;i<allOpt.size();i++)
		{
			String text = allOpt.get(i).getText();
			if(cityName.equalsIgnoreCase(text))
			{
				count++;
				break;
			}
		}

		
		if(count==1) {
		System.out.println(cityName+" is present");
		}
	
	else
	{
		System.out.println(cityName+" is not present");
	}

	
driver.quit();
}
}
