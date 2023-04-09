package DataProvider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

	@DataProvider(name="kuyilu") 	
	public String[][] yogi2()
	 {
	    return new String[][]
		   {
		   {"Yogiiiiii","Yogesh"},{"Yogi1","Yogesh1"}, {"Yogi2","Yogesh2"}
		   };
	 }
}
