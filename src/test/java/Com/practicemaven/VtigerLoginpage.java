package Com.practicemaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VtigerLoginpage {
	@Test
	public static void Login() throws Throwable {
		
	
		System.setProperty("Webdriver.chrome.driver","D:\\KCSM12\\Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
		WebElement un=driver.findElement(By.name("user_name"));
		un.sendKeys("admin");
		WebElement pwd=driver.findElement(By.name("user_password"));
		pwd.sendKeys("admin");
		WebElement loginbtn=driver.findElement(By.id("submitButton"));
		loginbtn.click();
	}
}
