package Com.practicemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookLogin {
	@Test
	public static void facebook() {
	
		
			System.setProperty("webdriver.chrome.driver","D:\\KCSM12\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");

	}
	}

