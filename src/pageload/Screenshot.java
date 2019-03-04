package pageload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {
	
	static WebDriver driver;
	
	public static void main (String[]args)throws IOException{
		
		System.setProperty("webdriver.chrome.driver", "DRIVERS//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http:facebook.com");
		takesreenshot("Facebook_LoginPage");
		
		
}



	public static void takesreenshot(String filename)throws IOException{
		
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("E:\\Automation\\takescreen\\screensot"+filename+".png"));
		
		
	}
	
	
	
	
	

}
