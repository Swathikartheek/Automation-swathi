package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		basic1 b=new basic1();
		ChromeDriver driver=new ChromeDriver();
		b.test(driver);
		EdgeDriver driver1=new EdgeDriver();
		b.test(driver1);
		

	}

}
