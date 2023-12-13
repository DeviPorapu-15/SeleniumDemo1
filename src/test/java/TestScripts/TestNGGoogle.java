package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGoogle {
	WebDriver driver;
	@BeforeMethod
public void pageSetUp() {
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(50));
}
  @Test(dependsOnMethods ="SeleniumTutorial")
  public void JavaTutorial() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("JavaTutorial");
	  Assert.assertEquals(driver.getTitle(), "JavaTutorial - Google");
	  srcBox.submit(); 
  }
  @Test
  public void SeleniumTutorial() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("SeleniumTutorial");
	  Assert.assertEquals(driver.getTitle(), "SeleniumTutorial - Google");
	  srcBox.submit(); 
  }
  @Test(enabled=false)
  public void CypressSearchTutorial() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("CypressTutorial");
	  Assert.assertEquals(driver.getTitle(), "CypressTutorial - Google Search");
	  srcBox.submit(); 
  }
  @Test(enabled=false)
  public void AppiumTutorial() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("AppiumTutorial");
	  Assert.assertEquals(driver.getTitle(), "AppiumTutorial - Google Search");
	  srcBox.submit(); 
  }
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
}
