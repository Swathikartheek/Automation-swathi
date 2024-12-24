package DropDown;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithoutDuplicates {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/FCI/Desktop/MultiDropdown.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		List<WebElement> AllOptions = s.getOptions();
		Set<String> hs=new HashSet<>();
		for(WebElement opt:AllOptions)
		{
			String text = opt.getText();
			hs.add(text);
		}
		for(String sl:hs)
		{
			System.out.println(sl);
		}
		driver.quit();
		

	}

}
