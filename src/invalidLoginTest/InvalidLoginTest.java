package invalidLoginTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest{
	
	@Test
	public void invalidTest() throws Throwable {
		
		FileLib flib = new FileLib();
		int rc = flib.getRowCount(EXCEL_PATH, "Sheet1");
		System.out.println(rc);
		
		for(int i=1;i<=rc;i++) {
			
			String usn = flib.readExcelData(EXCEL_PATH, "Sheet1", i, 0);
			String pwd = flib.readExcelData(EXCEL_PATH, "Sheet1", i, 1);
			
			driver.findElement(By.id("username")).sendKeys(usn);
			Thread.sleep(2000);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(2000);
			
			
		}
		
		
		driver.close();
	}
	
	

}
