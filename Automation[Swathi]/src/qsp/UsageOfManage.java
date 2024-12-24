package qsp;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().setSize(new Dimension(100,155));
		driver.manage().window().setPosition(new Point(200,100));
		driver.manage().window().minimize();
		driver.quit();

	}

}
