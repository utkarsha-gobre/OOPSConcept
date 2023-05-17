package OOPS;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParentClass1 {
	
	public void LaunchFacebook()

	{
		
	System.setProperty("webdriver,chrome,driver","C:\\Users\\HP\\eclipse-workspace1\\SoftwareApplication\\chromedriver.exe");
	
    ChromeDriver driver = new ChromeDriver();
    
    driver.get("https://www.facebook.com/");
    
    driver.manage().window().maximize();
	}

}
