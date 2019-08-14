package jenkinsDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JenkinsJobs {
	
	@Test
	public void testJenkins(){
		System.out.println("Hi jenkins");
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
