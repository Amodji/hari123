package ipl;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class tab {
	static {
		System.setProperty("webdriver.chrome.driver","./chromedriver (1).exe");
	}
@Test
public void ipl() throws InterruptedException {
		String s1="MATCHES";
		String s2="TEAMS";
		String s3 = "NEWS";
		
		WebDriver d= new ChromeDriver();
		d.get("https://www.iplt20.com/");
       List<WebElement> data = d.findElements(By.xpath("//nav[@class=\"site-navigation textRight\"]/descendant::ul[@class=\"site-menu main-menu js-clone-nav d-none d-lg-block textCenter\"]/child::li"));
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

