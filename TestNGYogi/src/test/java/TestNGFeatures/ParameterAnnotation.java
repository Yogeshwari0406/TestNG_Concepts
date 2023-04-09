package TestNGFeatures;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {
	@Test
	@Parameters("yogi")
	private void method5(int value) {
		if(value==12) {
			System.out.println("Student name is Gopii");
		}
		else if(value ==4)
		{
			System.out.println("Student name is Yogii");
		}
		
		System.out.println(value);
	}
		
}
