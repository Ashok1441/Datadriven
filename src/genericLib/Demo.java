package genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void open() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		new ChromeDriver();
//		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\AutomationProject\\Drivers\\geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
	}

}
