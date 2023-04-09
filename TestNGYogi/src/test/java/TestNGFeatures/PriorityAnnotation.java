package TestNGFeatures;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PriorityAnnotation {
	@Test(priority=-1)
	@BeforeSuite
	private void yogi() {
		System.out.println("I am successfull Business woman");
	}
	@Test(priority=-123)
    private void girl() {
	   System.out.println("Girls are always strong");
   }
	@Test(priority=10)
    private void boy() {
	   System.out.println("Boys always care girls");
   }
	@Test
    private void hero() {
	   System.out.println("You are the hero of your own story");
   }
} 
