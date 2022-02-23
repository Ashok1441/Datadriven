package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	private static final String TestSheet = null;

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("D:\\Selenium\\ApachePOI\\DataFiles\\Sample2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("TestSheet");
		//XSSFSheet sheet = wb.getSheetAt(0);
		String value = sheet.getRow(0).getCell(2).toString();// we can use getstringcellvalue
		double value1 = sheet.getRow(4).getCell(2).getNumericCellValue();
		System.out.println(value);
		System.out.println(value1);
		wb.close();
		fis.close();
		
	
		
		
		
	}

}
