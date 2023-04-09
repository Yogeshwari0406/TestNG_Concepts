package TestNGFeatures;

import org.testng.annotations.Test;

public class GroupingAnnotation {
	@Test(groups="Apple")
	private void yogi() {
		System.out.println("I am successfull Business woman");
	}
	@Test(groups="Apple")
    private void girl1() {
	   System.out.println("Girls are always strong");
   }
	@Test(groups="Orange")
    private void girl2() {
	   System.out.println("Girls are always strong");
   }
	@Test(groups="Orange")
    private void girl() {
	   System.out.println("Girls are always strong");
   }

}
