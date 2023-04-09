package TestNGFeatures;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	@BeforeMethod
	@AfterTest
	@Test
	private void method1() {
		System.out.println("Multiply your earning way");
	}
	@AfterSuite
	@AfterMethod
	@Test
	private void method2() {
		System.out.println("Multiply your earning way");
	}
	@BeforeTest
	@Test
	private void method5() {
		System.out.println("Think positive always");
	}
	@Test
	private void method4() {
		System.out.println("Stay Strong");
	}
	@Test
	private void method7() {
		System.out.println("Positive attitude in negative situation");
	}
	@Test
	private void method6() {
		System.out.println("Multiply your Business");
	}
}
