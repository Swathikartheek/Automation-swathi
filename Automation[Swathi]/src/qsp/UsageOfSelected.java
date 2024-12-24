package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		boolean selected = driver.findElement(By.xpath("//label[text()='Female']")).isSelected();
		if(selected)
			System.out.println("pass");
		else
			System.out.println("fail");
		driver.quit();

	}

}
