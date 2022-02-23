package invalidLoginTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class BaseTest implements IAutoConsts{
	public static WebDriver driver;
	@Test
		public void openBrowser() throws Throwable {
			
			FileLib flib = new FileLib();
			String browserName = flib.readProprertyData(PRO_PATH, "browser");
			
			if(browserName.equals("chrome")) {
				System.setProperty(CHROME_KEY, CHROME_VALUE);
				driver=new ChromeDriver();
			}
			else if(browserName.equals("firefox")) {
				System.setProperty(FRIEFOX_KEY, FRIEFOX_VALUE);
				driver=new FirefoxDriver();
			}
			else {
				Reporter.log("Give proper Browser Name", true);
				
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String Url = flib.readProprertyData(PRO_PATH, "URL");
			driver.get(Url);	
			
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			WebdriverCommonLib wlib = new WebdriverCommonLib();
			String loginTitle = flib.readProprertyData(PRO_PATH, "loginTitle");
			wlib.verfiy(wlib.getPageTitle(), loginTitle, " Login Title Display");
			
//			driver.findElement(By.id("username")).sendKeys(flib.readExcelData(EXCEL_PATH, "Sheet1", 0, 0));
//			Thread.sleep(2000);
//			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, "Sheet1", 0, 1));
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//div[text()='Login ']")).click();
//			
//			Thread.sleep(2000);
//			String homeTitle = flib.readProprertyData(PRO_PATH, "hometitle");
//			wlib.verfiy(wlib.getPageTitle(), homeTitle, "HomeTitle");
					
		}


}
