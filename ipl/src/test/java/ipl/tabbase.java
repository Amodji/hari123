package ipl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Genericlibrary.BaseClass;
import Genericlibrary.PropertyFile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class tabbase extends BaseClass {
	
@Test
public void ipl() throws Throwable {
		String s1="MATCHES";
		String s2="TEAMS";
		String s3 = "NEWS";
		PropertyFile pLib=new PropertyFile();
		String URL = pLib.readDataFromPropertyFile("url");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
       List<WebElement> data = driver.findElements(By.xpath("//nav[@class=\"site-navigation textRight\"]/descendant::ul[@class=\"site-menu main-menu js-clone-nav d-none d-lg-block textCenter\"]/child::li"));
       for(WebElement nav:data)
       {
    	   String text = nav.getText();
    	   
    	   if(text.contentEquals(s1)) {
    		   System.out.println(text);
    	   }
    	   else if(text.contentEquals(s2))
    	   {
    	   System.out.println(text);
       }
    	   else if(text.contentEquals(s3))
    	   {
    	   System.out.println(text);
       }  
    	   else
    	   {
    		   System.out.println();
    	   }
	}
}
}


