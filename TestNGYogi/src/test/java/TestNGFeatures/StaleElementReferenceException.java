package TestNGFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementReferenceException {
	@Test
	private void yogi() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNG\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement UN = driver.findElement(By.id("email"));
	//driver.navigate().refresh(); Alternate technique. Once element has been found, immediatly we have to do actions(sendkeys) before refresh. Once page refreshed if we give action, it will throw stale element exception
	driver.get(driver.getCurrentUrl());
	UN.sendKeys("yo");
	driver.findElement(By.id("pass")).sendKeys("Yogesh");
	driver.findElement(By.name("login")).click();
}
}
