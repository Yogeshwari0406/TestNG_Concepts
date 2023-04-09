package TestNGFeatures;

import org.testng.annotations.Test;

public class TimeOutAnnotation {
	@Test(timeOut=2000)
	
	private void yogi() {
		System.out.println("I Love my Family");
		 
	}
	 @Test
	private void yogesh() throws Throwable   {
	System.out.println("yogi papa");
	Thread.sleep(1000);
	}

}
