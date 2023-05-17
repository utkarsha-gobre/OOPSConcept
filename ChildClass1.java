package OOPS;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClass1 {

	
public void LaunchAppFlipkart()
{
	System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	
    ChromeDriver driver = new ChromeDriver();
    
   	driver.get("https://www.flipkart.com/");
   	driver.manage().window().maximize();
}
}
