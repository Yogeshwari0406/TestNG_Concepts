package TestNGFeatures;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreAnnotation {
	@Test
	//@Ignore
	private void method1() {
		System.out.println("method is not ignored");
	}
	@Test
	private void method2() {
		System.out.println("This method is not ignored");
	}
	@Test
	private void method3() {
		System.out.println("This method is not ignored");
	}
}


