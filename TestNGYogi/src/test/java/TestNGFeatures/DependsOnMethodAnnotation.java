package TestNGFeatures;

import org.testng.annotations.Test;

public class DependsOnMethodAnnotation {
	@Test
	private void method2() {
		System.out.println("This method is not ignored");
	}
	@Test
	private void method1() {
		System.out.println("This method is not ignored");
	}
	@Test(dependsOnMethods="method2")
	private void method3() {
		System.out.println("This method is not ignored");
	}
}
