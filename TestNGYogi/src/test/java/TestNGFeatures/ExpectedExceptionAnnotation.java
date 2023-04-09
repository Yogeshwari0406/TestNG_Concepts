package TestNGFeatures;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedExceptionAnnotation {
	@Test
	private void method3() {
		System.out.println("yogi");
	}
	@Test(expectedExceptions= NullPointerException.class)
	private void method2() {
		String s= null;
		System.out.println(s.length());
	}
	@Test(expectedExceptions= NoSuchElementException.class)
	private void method11() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Eclipse-22-23\\TestNG\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("Yogi");
		driver.findElement(By.id("passss")).sendKeys("Yogesh");
		driver.findElement(By.name("login")).click();
		System.out.println("This method is not ignored");
	}
	@Test(expectedExceptions= ArithmeticException.class)
	private void method5() {
		int a =5/0;
		System.out.println(a);
	}
	@Test(expectedExceptions= ArithmeticException.class)
	private void method6() {
		int a =5;
		float b = 123.12f;
		int c=(int) (a+b);
		System.out.println(c);
	}
}
