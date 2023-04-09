package TestNGFeatures;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class DependsOnGroupsAnnotation {
	@Test(dependsOnGroups="yogi")
	private void method2() {
		System.out.println("This method is not ignored");
	}
	@BeforeMethod
	@Test(groups="yogi")
	private void method1() {
		System.out.println("Yogii");
	}
	@Test
	private void method3() {
		System.out.println("This method is not ignored");
	
	}
	@Test
	private void method4() {
		System.out.println("This method is not ignored");
	}

}
