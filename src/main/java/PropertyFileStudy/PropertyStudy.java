package PropertyFileStudy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyStudy {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		
		FileInputStream streaming = new FileInputStream("config.properties");
		
		Properties prop = new Properties();
		
	    prop.load(streaming);
		
	 String Browser =   prop.getProperty("Browser");
	 String Location = prop.getProperty("DriverLocation");
	 
	 if(Browser.equals("Chrome")) {
		 
		 System.setProperty("webdriver.chrome.driver", Location);
		 
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
	 }
         
	}

	}


