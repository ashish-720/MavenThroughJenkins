package Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class program1 {
	
	@Test
	public void m1() {
		System.setProperty("webdriver.chrome.driver", "./SoftwaresNew/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Hello jenkins");
		System.out.println("Hello sabya");
		driver.get("https://gmail.com");
		driver.get("https://facebook.com");
		driver.close();
	}
}
