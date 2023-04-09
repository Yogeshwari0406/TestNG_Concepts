package RerunConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NormalClass {
	static WebDriver driver;
	@Test
	private void yogi() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNGYogi\\UpdatedDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys("AngryBird");
		driver.findElement(By.id("password")).sendKeys("Loverboy");
	}
	@Test
	private void yogi1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNGYogi\\UpdatedDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.m/");
		driver.findElement(By.id("username")).sendKeys("AngryBird");
		driver.findElement(By.id("password")).sendKeys("Loverboy");
	}
	@Test
	private void yogi2() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNGYogi\\UpdatedDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotapp.com/");
		driver.findElement(By.id("username")).sendKeys("AngryBird");
		driver.findElement(By.id("password")).sendKeys("Loverboy");
	}
	@Test
	private void yogi3() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNGYogi\\UpdatedDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("usernae")).sendKeys("AngryBird");
		boolean display = driver.findElement(By.id("password")).isDisplayed();
		Assert.assertEquals(display, true);//validation     retrun type of assert is boolean.
		SoftAssert ref = new SoftAssert();//verification
		ref.assertEquals(display, true);
	}
}
