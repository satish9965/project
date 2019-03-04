package pageload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SA {
	
	
		
		@Test
		public static void login() {
			WebElement element;
			WebDriver driver=null;
			System.setProperty("webdriver.chrome.driver", "DRIVERS\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://orangehrm-demo-6x.orangehrmlive.com/");
			driver.manage().window().maximize();
		     driver.findElement(By.id("txtUsername"));
			
			 WebElement Username = driver.findElement(By.id("txtUsername")) ;
			 Username.clear();
			 Username.sendKeys("admin");
			
			 WebElement Password = driver.findElement(By.id("txtPassword"));
			 Password.clear();
			 Password.sendKeys("admin123");
			 
			 WebElement loginButton=driver.findElement(By.id("btnLogin"));
			 loginButton.click();
			 
			 
			
			
			
			
		}
	}


