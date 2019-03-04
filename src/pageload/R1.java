package pageload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class R1 {
	
	
	
		@Test
		
		 public void dateTimepicker () throws InterruptedException {
			
			WebDriver driver=null;
			
			System.setProperty("webdriver.chrome.driver", "DRIVERS//chromedriver.exe");
			
			driver=new ChromeDriver();
			
			driver.get("http:aa.com");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']")).sendKeys("BLR");
			driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']")).sendKeys("HYD");
			
			
			
		}

		
		
		
	}
	


