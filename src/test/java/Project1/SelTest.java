package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelTest {
	
	 @Test
	  public void f() {
		  
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.edubridgeindia.com/");
			
			String actual_tiitle=driver.getTitle();
			String expected_title="Job-Oriented Online Courses in India. Learn Anywhere, Anytime & at Anyplace";
			
			Assert.assertEquals(actual_tiitle, expected_title);
			
			driver.close();
			
	  }
}
