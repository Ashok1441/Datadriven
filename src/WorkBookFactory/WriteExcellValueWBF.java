package WorkBookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class WriteExcellValueWBF {
	
	@Test
	public void write() throws Exception  {
		FileInputStream fis = new FileInputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet("TestSheet").getRow(1).createCell(1).setCellValue("ashok kumar");;
		FileOutputStream fos = new FileOutputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
		wb.write(fos);
		
		System.out.println("done writing in excel sheet");
	}

}
