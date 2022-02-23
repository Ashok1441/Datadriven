package WorkBookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GetRowCountWBF {

	@Test
	public void getCount() throws Exception {
		
		FileInputStream fis = new FileInputStream("./DataFiles./Sample2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		
		int lastRownNum = sheet.getLastRowNum();
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		
		System.out.println(lastRownNum);
		System.out.println(lastCellNum);
		
		
	}
}
