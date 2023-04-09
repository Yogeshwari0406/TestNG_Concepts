package RerunConcept;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzerClass implements IRetryAnalyzer {
       
	@Override
	//Recursion type - Calling same method or function multiple times using Recursion method
	public boolean retry(ITestResult result) {
		int Queen=0;
		int pilla=2;
	if(Queen<=pilla) {
		Queen++;
		return true;
	}
		return false;
		
	}
	
}
