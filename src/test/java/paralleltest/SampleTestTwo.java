package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestTwo {
	@Test
	public void testOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Test21 in SampleTwo....."+id);
	}
	@Test
	public void testTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Test22 in SampleTwo....."+id);
	}
	@Test
	public void testThree() {
		long id = Thread.currentThread().getId();
		System.out.println("Test23 in SampleTwo....."+id);
	}
}
