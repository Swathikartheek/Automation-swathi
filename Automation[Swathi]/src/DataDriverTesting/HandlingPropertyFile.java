package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./File/commondata.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String un=p.getProperty("un");
		String pwd = p.getProperty("pwd");
		System.out.println("URL : "+url);
		System.out.println("UN  : "+un);
		System.out.println("PWD : "+pwd);
		
	}

}
