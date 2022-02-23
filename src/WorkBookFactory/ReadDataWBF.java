package WorkBookFactory;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataWBF {
	public static void main(String[] args) throws Exception {
		
	
	FileInputStream fis = new FileInputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	
	String cellvalue0 = wb.getSheetAt(1).getRow(0).getCell(0).toString();
	String cellvalue1 = wb.getSheetAt(1).getRow(0).getCell(1).toString();
	String cellvalue2 = wb.getSheetAt(1).getRow(0).getCell(2).toString();
	double cellvalue3 = wb.getSheetAt(1).getRow(0).getCell(3).getNumericCellValue();
	boolean cellvalue4 = wb.getSheetAt(1).getRow(0).getCell(4).getBooleanCellValue();
	
	System.out.println(cellvalue0);
	System.out.println(cellvalue1);
	System.out.println(cellvalue2);
	System.out.println(cellvalue3);
	System.out.println(cellvalue4);
	}
}
