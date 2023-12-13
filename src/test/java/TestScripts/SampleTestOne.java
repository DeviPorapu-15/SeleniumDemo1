package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestOne {
	WebDriver driver;
	@BeforeMethod
public void pageSetUp() {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(20));
}
  @Test
  public void JavaTutorail() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className(""));
	  srcBox.sendKeys("JavaTutorial");
	  Assert.assertEquals(driver.getTitle(), "JavaTutorial - Google Search");
	  srcBox.submit(); 
  }
  @Test
  public void SeleniumTutorail() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className(""));
	  srcBox.sendKeys("SeleniumTutorial");
	  Assert.assertEquals(driver.getTitle(), "SeleniumTutorial - Google Search");
	  srcBox.submit(); 
  }
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
}
