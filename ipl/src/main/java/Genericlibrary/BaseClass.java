package Genericlibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseClass {
	public void launchBrowser() throws Throwable {
		//read data from property file
		PropertyFile pLib= new PropertyFile();
		String BROWSER = pLib.readDataFromPropertyFile("browser");
		String URL = pLib.readDataFromPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			
			WebDriver driver=new ChromeDriver();
		}
		else if(BROWSER.equalsIgnoreCase("firefox")) {
			
		WebDriver driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("invalid browser");
		}
}
}
