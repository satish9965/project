package pageload;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Freecrm {
	@Test
	public static void login() {
		WebElement element ;
		
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "DRIVERS//chromedriver.exe");
		
		driver=new ChromeDriver();
	     
		driver.get("https://classic.crmpro.com/login.cfm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("satish123");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("satish@9965");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
			
			
		
		
	}
	

}
