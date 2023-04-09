package TestNGFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting2 {

	static WebDriver driver;
	@Test
	private void yogi2() {
		System.out.println(Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNGYogi\\UpdatedDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("AngryBird");
		driver.quit();
	}
	@Test
	private void yogi3() {
		System.out.println(Thread.currentThread().getId());
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNGYogi\\UpdatedDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		driver.quit();
	}
}
