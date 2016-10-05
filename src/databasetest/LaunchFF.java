package databasetest;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class LaunchFF {
	WebDriver driver;
  @Test
  public void firefox() {
  driver.get("http://www.google.com");
  
  driver.findElement(By.name("q")).sendKeys("hello Selenium Krish");
  }
  @BeforeTest
  public void beforeTest() {
	  
	  	System.setProperty("webdriver.gecko.driver","C:\\lib\\geckodriver.exe"); // Selenium 3 - Launching firefox browser using Geckodriver 
	   driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
      }

}
