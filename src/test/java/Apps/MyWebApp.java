package Apps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyWebApp {
  @Test
  public void VerifyTitle() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  String Title = driver.getTitle();
	  System.out.println("Title is "+Title);
	// Assert.assertEquals(title, "My N Login Page");
	  Thread.sleep(2000);
	  driver.close();
	  
	  
  }
}
