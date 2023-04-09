package TestNGFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	@Test(dataProvider="kuyil")// we can give method name directly or have to give dataproivder name which is setting for @Dataprovider

	public void yogi1(String UN, String Pass)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys(UN);
		driver.findElement(By.id("pass")).sendKeys(Pass);
	}
	@DataProvider(name="kuyil")
	public String[][] yogi2()
	 {
	    return new String[][]
		   {
		   {"Yogi","Yogesh"},{"Yogi1","Yogesh1"}, {"Yogi2","Yogesh2"}
		   };
	 }
	}	
