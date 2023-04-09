package TestNGFeatures;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountAnnotation {
	
	@Test(invocationCount=2)
	private void yogi() {
		System.out.println("I Love my Family");
	}
	@BeforeMethod
	@Test
	private void thangam() {
		System.out.println("I am good girl");
	}
	@AfterMethod
	@Test
	private void pavnu() {
		System.out.println("All is well");

	}
}
