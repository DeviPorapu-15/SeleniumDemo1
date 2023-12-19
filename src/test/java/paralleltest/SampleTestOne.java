package paralleltest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestOne {
	@Test
	public void testOne() {
		long id = Thread.currentThread().getId();
		System.out.println("Test11 in SampleOne....."+id);
	}
	@Test
	public void testTwo() {
		long id = Thread.currentThread().getId();
		System.out.println("Test12 in SampleOne....."+id);
	}
	@Test
	public void testThree() {
		long id = Thread.currentThread().getId();
		System.out.println("Test13 in SampleOne....."+id);
	}
}
