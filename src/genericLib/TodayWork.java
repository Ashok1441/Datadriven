package genericLib;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TodayWork {
	
	@Test
	public void filpkart() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("mobiles")
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.ENTER)
		.perform();
		
		driver.findElement(By.xpath("//div[text()='6 GB & Above']")).click();
		Thread.sleep(2000);
		
        Point loc = driver.findElement(By.xpath("//div[text()='Less than 512 MB']")).getLocation();
    	driver.findElement(By.id("container"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy"+loc);
		
		driver.findElement(By.xpath("//div[text()='SAMSUNG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		
	}
	
	@Test
	public void faceBook() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestNGProject\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/campaign/landing.php");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
