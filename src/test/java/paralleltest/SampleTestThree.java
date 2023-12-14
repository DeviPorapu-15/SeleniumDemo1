package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestThree {
@Test(groups="feature1")
public void testone() {
	System.out.println("Test31 is in Sample three");
}
@Test(groups="feature2")
public void testtwo() {
	System.out.println("Test32 is in Sample three");
}
@Test(groups="feature1")
public void testthree() {
	System.out.println("Test33 is in Sample three");
}
@Test(groups="feature4")
public void testfour() {
	System.out.println("Test34 is in Sample three");
}
}
