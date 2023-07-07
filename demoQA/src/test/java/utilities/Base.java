package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public void setUp() {
		ChromeOptions chromeOptions = new ChromeOptions();
		 chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Browser Opened");
	}

	public void enterUrl(String url) {
		driver.get(url);
		System.out.println("EnterURL");
	
	}

	public void tearDown() {
		driver.close();
		System.out.println("Closebrowser");
	}

}
