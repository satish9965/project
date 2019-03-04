package pageload;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mydate {
	   WebDriver driver;

	    @Test
	    public void dateTimePicker() {
	

    System.setProperty("webdriver.chrome.driver","DRIVERS//chromedriver.exe");
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get("http://jqueryui.com/resources/demos/datepicker/other-months.html");

    // click to open the date time picker calendar.
    WebElement dateBox = driver.findElement(By.id("datepicker"));

    // click to open the date time picker calendar.
    dateBox.click();

    // Fill date as mm/dd/yyyy as 10/6/2019
    dateBox.sendKeys("10/6/2019");

    // Press tab to shift focus to time field
    dateBox.sendKeys(Keys.TAB);

    // close the driver
  //  driver.close();
}
	
	
	

}
