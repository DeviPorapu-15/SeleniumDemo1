package TestScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestFour {
@Test(groups="feature1")
public void testone() {
	System.out.println("Test41 is in Sample four");
}
@Test(groups="feature2")
public void testtwo() {
	System.out.println("Test42 is in Sample four");
}
@Test(groups="feature3")
public void testthree() {
	System.out.println("Test43 is in Sample four");
}
@Test(groups="feature4")
public void testfour() {
	System.out.println("Test44 is in Sample four");
}
}
