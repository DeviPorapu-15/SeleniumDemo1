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
  @Test(alwaysRun = true, dependsOnMethods ="SeleniumTutorial")
  public void JavaTutorial() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("JavaTutorial");
	  srcBox.submit(); 
	  Assert.assertEquals(driver.getTitle(), "JavaTutorial - Google Search");
	  
  }
  @Test
  public void SeleniumTutorial() {
	  driver.get("https://www.google.com");
	  WebElement srcBox = driver.findElement(By.className("gLFyf"));
	  srcBox.sendKeys("SeleniumTutorial");
	  srcBox.submit();
	  Assert.assertEquals(driver.getTitle(), "SeleniumTutorial - Google Search Page"); 
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
	  srcBox.submit();
	  Assert.assertEquals(driver.getTitle(), "AppiumTutorial - Google Search");
	   
  }
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
}
